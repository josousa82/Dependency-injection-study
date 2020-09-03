package com.springstudy.sfdistudy;

import com.springstudy.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springstudy.controllers", "com.springstudy.sfdistudy.services"})
public class SfDiStudyApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfDiStudyApplication.class, args);

        MyController myController = (MyController)ctx.getBean("myController");

        System.out.println("---------- Profile study");
        I18NController i18NController = (I18NController) ctx.getBean("i18NController");
        System.out.println("i18NController.sayHello() = " + i18NController.sayHello());

        System.out.println("---------- Primary Bean");
        System.out.println("greeting Primary Bean = " + myController.sayHello());

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
