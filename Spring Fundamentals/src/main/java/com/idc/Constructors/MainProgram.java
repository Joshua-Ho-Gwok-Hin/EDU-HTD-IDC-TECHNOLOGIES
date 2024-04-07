package com.idc.Constructors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProgram {

    public static void main(String[] args) {

//        ApplicationContext fromXml = new ClassPathXmlApplicationContext(
//                "constructorhello.xml");
//
        ApplicationContext beanScopeSinglton = new AnnotationConfigApplicationContext(
                BeanScopeSingleton.class);

        InterfaceClass beanSingletonTest = (InterfaceClass) beanScopeSinglton.getBean("debit");
        beanSingletonTest.details();


//        ApplicationContext usingComponentScan = new AnnotationConfigApplicationContext(
//                UsingComponentScan.class) {
//        };
//
//        AutoWireExample autoWireExample = usingComponentScan.getBean(AutoWireExample.class);
//        autoWireExample.sayHello();


//        AutoWireExample withoutComponentScan = new AutoWireExample();
//        withoutComponentScan.sayHello();


//        InterfaceClass usingClass = fromXml.getBean(DebitCard.class);
//        usingClass.details();
//
//        InterfaceClass usingBeanName = (DebitCard) fromXml.getBean("debit");
//        usingBeanName.details();

//        Not Working
//        InterfaceClass javaConfigUsingClass = (InterfaceClass) fromConfigClass.getBean(JavaConfiguration.class);
//        javaConfigUsingClass.details();

//        InterfaceClass javaConfigUsingBeanName = (InterfaceClass) fromConfigClass.getBean("javaConfig");
//        javaConfigUsingBeanName.details();
//
//        CreditCard withoutInterface = usingComponentScan.getBean(CreditCard.class);
//        withoutInterface.details();







    }
}
