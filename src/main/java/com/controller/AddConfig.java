package com.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.controller")
public class AddConfig {
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver vr=new InternalResourceViewResolver();
        vr.setSuffix("/webapp/");
        vr.setSuffix(".jsp");
        return vr;
    }
}
