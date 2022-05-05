package com.web.app.springbootapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/health")
    public String getVersion(){
        return "My First springBoot App 1.0";
    }

}
