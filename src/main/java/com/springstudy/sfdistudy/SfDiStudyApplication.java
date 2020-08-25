package com.springstudy.sfdistudy;

import com.springstudy.sfdistudy.controllers.ConstructorInjectedController;
import com.springstudy.sfdistudy.controllers.MyController;
import com.springstudy.sfdistudy.controllers.PropertyInjectedController;
import com.springstudy.sfdistudy.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfDiStudyApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfDiStudyApplication.class, args);

        MyController myController = (MyController)ctx.getBean("myController");

        String greeting = myController.sayHello();
        System.out.println("greeting = " + greeting);

        System.out.println("----------Property");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println("propertyInjectedController.getGreeting() = " + propertyInjectedController.getGreeting());

        System.out.println("----------Setter");

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println("setterInjectedController.getGreeting() = " + setterInjectedController.getGreeting());

        System.out.println("----------Constructor");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
        System.out.println("constructorInjectedController.getGreeting() = " + constructorInjectedController.getGreeting());

    }

}
