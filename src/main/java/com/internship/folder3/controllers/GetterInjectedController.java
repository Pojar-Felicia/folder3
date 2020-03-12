package com.internship.folder3.controllers;

import com.internship.folder3.services.GreetingService;
import com.internship.folder3.services.GreetingServiceImpl;

public class GetterInjectedController {
    private GreetingService greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingServiceImpl greetingService){
        this.greetingService = greetingService;
    }

}
