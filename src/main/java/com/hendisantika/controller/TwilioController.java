package com.hendisantika.controller;

import com.hendisantika.service.PhoneVerificationService;
import com.hendisantika.service.VerificationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @PostMapping("/sendotp")
    public ResponseEntity<String> sendOTP(@RequestParam("phone") String phone) {
        VerificationResult result = phoneSmsService.startVerification(phone);
        if (result.isValid()) {
            return new ResponseEntity<>("Otp Sent..", HttpStatus.OK);
        }
        return new ResponseEntity<>("Otp failed to sent..", HttpStatus.BAD_REQUEST);
    }
}
