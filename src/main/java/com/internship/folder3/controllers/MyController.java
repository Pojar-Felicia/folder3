package com.internship.folder3.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String hello(){
        System.out.println("Hello !");
        return "goo";
    }
}
