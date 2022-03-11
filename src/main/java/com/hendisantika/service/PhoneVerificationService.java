package com.hendisantika.service;

import com.hendisantika.config.TwilioProperties;
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
    public PhoneverificationService(TwilioProperties twilioProperties) {
        this.twilioProperties = twilioProperties;
    }
}
