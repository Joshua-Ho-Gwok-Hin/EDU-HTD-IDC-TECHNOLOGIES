package com.idc.springexpressionlanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProgram {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("springexpressionlanguage.xml");
        Expression exp = appContext.getBean(Expression.class);
        System.out.println(exp);

    }
}
