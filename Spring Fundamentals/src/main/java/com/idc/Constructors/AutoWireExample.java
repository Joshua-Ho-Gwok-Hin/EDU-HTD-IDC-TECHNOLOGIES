package com.idc.Constructors;

import org.springframework.stereotype.Component;

@Component
public class AutoWireExample {

    String name = "Harry Potter";

    public void sayHello() {
        System.out.println("Harry Potter says hello");
    }

}
