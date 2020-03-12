package com.internship.folder3.controllers;

import com.internship.folder3.services.GreetingService;
import com.internship.folder3.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

@Autowired
    public void setGreetingService(GreetingServiceImpl greetingService){
        this.greetingService = greetingService;
    }

}
