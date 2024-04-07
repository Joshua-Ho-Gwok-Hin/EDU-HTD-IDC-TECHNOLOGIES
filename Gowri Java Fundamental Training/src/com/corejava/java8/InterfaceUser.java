package com.corejava.java8;

public interface InterfaceUser {

    User getUser(String name);

    //    int addNumbers();
    default InterfaceUser apply() {
        System.out.println("user functional interface");
        return null;
    }

}
