package com.internship.folder3;

import com.internship.folder3.controllers.ConstructorInjectedController;
import com.internship.folder3.controllers.GetterInjectedController;
import com.internship.folder3.controllers.MyController;
import com.internship.folder3.controllers.PropertyInjectedController;
import com.internship.folder3.exampleBeans.FakeDataSource;
import com.internship.folder3.exampleBeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.internship.folder3","main"})
public class Folder3Application {

    public static void main(String[] args) {

        ApplicationContext appContext = SpringApplication.run(Folder3Application.class, args);

        FakeDataSource fakeDataSource = appContext.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());

        FakeJmsBroker fakeJmsBroker = appContext.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker.getUsername());
 }

}
