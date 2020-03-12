package com.internship.folder3.controllers;

import com.internship.folder3.services.GreetingService;

public class ConstructorInjectedController {
    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    String sayHello(){
        return greetingService.sayGreeting();
    }
}
