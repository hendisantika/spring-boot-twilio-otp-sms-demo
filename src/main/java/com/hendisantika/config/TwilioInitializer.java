package com.hendisantika.config;

import com.twilio.Twilio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-twilio-otp-sms-demo
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/03/22
 * Time: 13.42
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class TwilioInitializer {

    private final TwilioProperties twilioProperties;

    @Autowired
    public TwilioInitializer(TwilioProperties twilioProperties) {
        this.twilioProperties = twilioProperties;
        Twilio.init(twilioProperties.getAccountSid(), twilioProperties.getAuthToken());
        System.out.println("Twilio initialized with account-" + twilioProperties.getAccountSid());
    }
}
