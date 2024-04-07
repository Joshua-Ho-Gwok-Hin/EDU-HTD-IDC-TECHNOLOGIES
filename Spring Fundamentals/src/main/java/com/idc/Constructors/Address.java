package com.idc.Constructors;

import org.springframework.beans.factory.annotation.Autowired;

public class Address implements InterfaceClass {

    String personName;
    String branchName;

    @Autowired
    public InterfaceClass interfaceClass;

    public Address(String personName, String branchName) {
        this.personName = personName;
        this.branchName = branchName;
    }

    @Override
    public void details() {
        System.out.println(" the person issued by " +
                personName +
                " from " +
                branchName);
    }
}
