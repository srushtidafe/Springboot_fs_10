package org.geekster;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MailHandlerBeans {
    @Bean
    public MailHandler beanOfMailHandler(){
        return new MailHandler();
    }
}