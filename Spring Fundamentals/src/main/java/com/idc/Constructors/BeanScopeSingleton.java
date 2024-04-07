package com.idc.Constructors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.idc.Constructors")
public class BeanScopeSingleton {

    private String name;

    @Bean
    @Scope("singleton")
    public DebitCard singletonMethod() {
        return new DebitCard(20000,"Bean");
    }
}
