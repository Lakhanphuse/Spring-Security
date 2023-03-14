package com.jspiders.securityapi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/")
    public String display(){
        return "<h1> Welcome to Login Page</h1>";
    }

    @GetMapping("/student")
    public  String show(){
        return "<h1> Welcome to Student to Application</h1>";
    }

    @GetMapping("/admin")
    public String info(){
        return "<h1> Welcome Admin to Application </h1>";
    }
}
