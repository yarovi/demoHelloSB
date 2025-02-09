package org.yasmani.io.demohellosb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {
    //create  method get hello
    @RequestMapping("/hello")
    public String hello(){
        return "Hello from ModuloHijo";
    }
}
