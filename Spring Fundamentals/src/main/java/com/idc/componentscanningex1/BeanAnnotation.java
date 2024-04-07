package com.idc.componentscanningex1;

import org.springframework.context.annotation.Bean;

public class BeanAnnotation implements InterfaceClassForDemo {

    @Bean
    @Override
    public void printMessage() {
        System.out.println("Calling from BeanAnnotation");
    }
}
