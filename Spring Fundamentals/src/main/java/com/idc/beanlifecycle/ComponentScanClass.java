package com.idc.beanlifecycle;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
@Configuration
@ComponentScan(basePackages="com.idc.beanlifecycle")
@ComponentScan(basePackageClasses = ComponentScanClass.class)
public class ComponentScanClass {
}
