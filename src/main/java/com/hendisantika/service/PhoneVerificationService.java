package com.hendisantika.service;

import com.hendisantika.config.TwilioProperties;
import com.twilio.exception.ApiException;
import com.twilio.rest.verify.v2.service.Verification;
import com.twilio.rest.verify.v2.service.VerificationCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-twilio-otp-sms-demo
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/03/22
 * Time: 13.52
 * To change this template use File | Settings | File Templates.
 */
@Service
public class PhoneVerificationService {

    private final TwilioProperties twilioProperties;

    @Autowired
    public PhoneVerificationService(TwilioProperties twilioProperties) {
        this.twilioProperties = twilioProperties;
    }

    public VerificationResult startVerification(String phone) {
        try {
            Verification verification = Verification.creator(twilioProperties.getServiceId(), phone, "sms").create();
            if ("approved".equals(verification.getStatus()) || "pending".equals(verification.getStatus())) {
                return new VerificationResult(verification.getSid());
            }
        } catch (ApiException exception) {
            return new VerificationResult(new String[]{exception.getMessage()});
        }
        return null;
    }

    public VerificationResult checkVerification(String phone, String code) {
        try {
            VerificationCheck verification = VerificationCheck.creator(twilioProperties.getServiceId(), code).setTo(phone).create();
            if ("approved".equals(verification.getStatus())) {
                return new VerificationResult(verification.getSid());
            }
            return new VerificationResult(new String[]{"Invalid code."});
        } catch (ApiException exception) {
            return new VerificationResult(new String[]{exception.getMessage()});
        }
    }

}
