package com.hendisantika.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-twilio-otp-sms-demo
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/03/22
 * Time: 13.48
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@ConfigurationProperties("twilio")
@Data
public class TwilioProperties {
    private String accountSid;
    private String authToken;
    private String serviceId;
}
