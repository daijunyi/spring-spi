package com.daijunyi.spring.boot.autoconfigure;

import com.daijunyi.spring.boot.service.PayService;
import com.daijunyi.spring.boot.service.impl.PayServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author djy
 * @createTime 2022/9/5 17:30
 * @description
 */
@Configuration
@EnableConfigurationProperties(PayProperties.class)
public class PayAutoConfiguration {

    private PayProperties payProperties;

    public PayAutoConfiguration(PayProperties payProperties) {
        this.payProperties = payProperties;
    }

    @Bean
    @ConditionalOnMissingBean
    public PayService payService(){
        return new PayServiceImpl(payProperties.getAppId(),payProperties.getSecret());
    }

}
