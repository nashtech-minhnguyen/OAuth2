package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SecurityController {
    
    @GetMapping("/")
    public String getNoConfig(){
        return "Hello Everyone";
    }

    @GetMapping("/security")
    public String getSecurityCoinfig(){
        return "Hello Github User";
    }

}
