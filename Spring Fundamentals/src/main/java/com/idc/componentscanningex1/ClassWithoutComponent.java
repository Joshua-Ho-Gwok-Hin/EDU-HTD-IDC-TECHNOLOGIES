package com.idc.componentscanningex1;

public class ClassWithoutComponent implements InterfaceClassForDemo {
    @Override
    public void printMessage() {
        System.out.println("Calling from ComponentClass");
    }
}
