package com.idc.beanlifecycle;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component("annotatedLog")
public class LogMessageWithAnnotation {

    String message;

    public String getMessage() {
        return "I am the bean with annotation.";
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init() {
        System.out.println("init() annotated bean");
    }

    public void destroy() {
        System.out.println("destroy() annotated bean");
    }
}
