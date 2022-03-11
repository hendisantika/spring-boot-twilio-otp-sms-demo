package com.hendisantika.service;

import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-twilio-otp-sms-demo
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/03/22
 * Time: 13.49
 * To change this template use File | Settings | File Templates.
 */
@Data
public class VerificationResult {
    private final String id;
    private final String[] errors;
    private final boolean valid;

    public VerificationResult(String id) {
        this.id = id;
        this.errors = new String[]{};
        this.valid = true;
    }

    public VerificationResult(String[] errors) {
        this.errors = errors;
        this.id = "";
        this.valid = false;
    }
}
