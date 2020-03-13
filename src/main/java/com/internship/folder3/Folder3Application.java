package com.internship.folder3;

import com.internship.folder3.controllers.ConstructorInjectedController;
import com.internship.folder3.controllers.GetterInjectedController;
import com.internship.folder3.controllers.MyController;
import com.internship.folder3.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.internship.folder3","main"})
public class Folder3Application {

    public static void main(String[] args) {

        ApplicationContext appContext = SpringApplication.run(Folder3Application.class, args);
        MyController myController = (MyController) appContext.getBean("myController");
        System.out.println(myController.hello());
        System.out.println(appContext.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(appContext.getBean(GetterInjectedController.class).sayHello());
        System.out.println(appContext.getBean(ConstructorInjectedController.class).sayHello());
    }

}
