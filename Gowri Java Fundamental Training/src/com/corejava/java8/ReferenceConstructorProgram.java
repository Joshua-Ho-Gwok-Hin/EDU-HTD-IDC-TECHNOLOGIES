package com.corejava.java8;

public class ReferenceConstructorProgram {

    public static void main(String[] args) {

        InterfaceUser interfaceUser = User:: new;
        User user = interfaceUser.getUser("What?");

        System.out.println(user.getName());
//        InterfaceUser interfaceUser1 = ReferenceConstructorProgram::apply;
        System.out.println("ref "+ interfaceUser.apply());

//        InterfaceUser interface =

    }
}
