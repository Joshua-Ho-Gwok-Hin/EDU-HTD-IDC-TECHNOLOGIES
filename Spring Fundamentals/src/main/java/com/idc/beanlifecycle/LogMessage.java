package com.idc.beanlifecycle;

public class LogMessage {

    String message;

    public String getMessage() {
        return "I am a bean";
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init() {
        System.out.println("log bean is going through init method");
    }

    public void destroy() {
        System.out.println("log bean to be destroyed");
    }
}
