package com.idc.Constructors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.idc.Contructors")
public class AutoWireComponent {


    int limit = 10000;
    String bankName = "DBS";

    public void details() {
        System.out.println("From LinkTwo Classes");
    }
}
