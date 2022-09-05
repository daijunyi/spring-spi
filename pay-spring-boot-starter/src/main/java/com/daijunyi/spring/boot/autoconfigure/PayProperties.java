package com.daijunyi.spring.boot.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author djy
 * @createTime 2022/9/5 17:30
 * @description
 */
@ConfigurationProperties(prefix = "daijunyi.pay")
public class PayProperties {

    private String appId;

    private String secret;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
