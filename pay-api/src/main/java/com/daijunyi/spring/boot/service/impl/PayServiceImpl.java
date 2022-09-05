package com.daijunyi.spring.boot.service.impl;

import com.daijunyi.spring.boot.service.PayService;

/**
 * @author djy
 * @createTime 2022/9/5 17:17
 * @description
 */
public class PayServiceImpl implements PayService {

    private String payId;

    private String secret;

    public PayServiceImpl(String payId, String secret) {
        this.payId = payId;
        this.secret = secret;
    }

    @Override
    public String pay() {
        System.out.println("支付了,appid是:"+payId+"，秘钥是:"+secret);
        return "支付成功，appid是:"+payId+"，秘钥是:"+secret;
    }
}
