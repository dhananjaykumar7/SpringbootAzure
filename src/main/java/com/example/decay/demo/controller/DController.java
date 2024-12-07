package com.example.decay.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DController {

    @GetMapping("/")
    public String showMessage(){
        return "Application deployed in Azure";
    }
}
