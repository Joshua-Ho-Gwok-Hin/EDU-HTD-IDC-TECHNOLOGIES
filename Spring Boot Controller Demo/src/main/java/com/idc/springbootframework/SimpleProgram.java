package com.idc.springbootframework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleProgram {

    @GetMapping("/add")
    public String display() {
        return "Return String";
    }
    @GetMapping("/try")
    public void trytry() {
        System.out.println("System.out.println()");;
    }

}
