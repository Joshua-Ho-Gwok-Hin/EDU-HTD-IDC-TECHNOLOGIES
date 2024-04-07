package com.idc.componentscanningex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProgram{

    public static void main(String[] args) {

//        ApplicationContext xmlContext = new ClassPathXmlApplicationContext("componentscanningex1.xml");
//        ApplicationContext beanContext = new AnnotationConfigApplicationContext(BeanAnnotation.class);
//        ApplicationContext componentContext = new AnnotationConfigApplicationContext(ComponentClass.class);
        ApplicationContext configContext = new AnnotationConfigApplicationContext(ConfigComponentScanning.class);

//        InterfaceClassForDemo xmlUsingBean = (InterfaceClassForDemo) xmlContext.getBean("xmlApp");
//        xmlUsingBean.printMessage();
//
//        InterfaceClassForDemo xmlUsingClass = xmlContext.getBean(XMLApplicationContext.class);
//        xmlUsingClass.printMessage();

//        InterfaceClassForDemo beanAnnotation = beanContext.getBean(BeanAnnotation.class);
//        beanAnnotation.printMessage();

//        InterfaceClassForDemo componentClass = (InterfaceClassForDemo) componentContext.getBean("componentClass");
//        componentClass.printMessage();

        InterfaceClassForDemo componentClass = configContext.getBean(ClassWithoutComponent.class);
        componentClass.printMessage();

    }


}
