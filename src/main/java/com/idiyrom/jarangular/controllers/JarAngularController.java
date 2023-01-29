package com.idiyrom.jarangular.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JarAngularController {

    @GetMapping("/api/")
    private String foo(){
        return "This is Java Spring Boot RESTful WebService Example";
    }
}
