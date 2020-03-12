package com.internship.folder3;

import com.internship.folder3.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Folder3Application {

    public static void main(String[] args) {

        ApplicationContext appContext = SpringApplication.run(Folder3Application.class, args);
        MyController myController = (MyController) appContext.getBean("myController");
        myController.hello();
    }

}
