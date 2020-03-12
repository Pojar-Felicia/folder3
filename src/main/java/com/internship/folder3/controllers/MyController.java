package com.internship.folder3.controllers;

import com.internship.folder3.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello !");
        return greetingService.sayGreeting();
    }
}
