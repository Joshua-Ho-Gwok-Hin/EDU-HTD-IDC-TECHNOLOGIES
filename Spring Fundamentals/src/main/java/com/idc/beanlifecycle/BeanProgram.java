package com.idc.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanProgram {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycle.xml");
//
//        LogMessage obj = (LogMessage) context.getBean("log");
//        obj.getMessage();
//        ((AbstractApplicationContext)context).registerShutdownHook();


        ApplicationContext annotatedContext = new AnnotationConfigApplicationContext(ComponentScanClass.class);

        LogMessageWithAnnotation logAnno = annotatedContext.getBean(LogMessageWithAnnotation.class);
        logAnno.getMessage();
        ((AbstractApplicationContext)annotatedContext).registerShutdownHook();

    }
}
