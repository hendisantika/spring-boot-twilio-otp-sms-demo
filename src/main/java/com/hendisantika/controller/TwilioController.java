package com.hendisantika.controller;

import com.hendisantika.service.PhoneVerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-twilio-otp-sms-demo
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/03/22
 * Time: 13.55
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/")
public class TwilioController {

    @Autowired
    PhoneVerificationService phoneSmsService;

    @GetMapping
    public String homePage() {
        return "index";
    }
}
