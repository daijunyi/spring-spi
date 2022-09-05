package com.daijunyi.spring.boot.test.controller;

import com.daijunyi.spring.boot.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author djy
 * @createTime 2022/9/5 20:48
 * @description
 */
@RestController
public class PayController {

    @Autowired
    private PayService payService;

    @GetMapping("/pay")
    public String pay(){
        return payService.pay();
    }

}
