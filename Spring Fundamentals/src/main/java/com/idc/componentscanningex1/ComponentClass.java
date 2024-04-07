package com.idc.componentscanningex1;

import org.springframework.stereotype.Component;

@Component("componentClass")
public class ComponentClass implements InterfaceClassForDemo {
    @Override
    public void printMessage() {
        System.out.println("Calling from ComponentClass");
    }
}
