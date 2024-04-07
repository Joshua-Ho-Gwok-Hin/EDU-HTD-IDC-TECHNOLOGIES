package com.idc.Constructors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {

    @Bean(name="javaConfig")
    public InterfaceClass inter() {
        return new CreditCard(70000, "RBI");
    }
}
