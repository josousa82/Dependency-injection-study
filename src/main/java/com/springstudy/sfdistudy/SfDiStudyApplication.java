package com.springstudy.sfdistudy;

import com.springstudy.sfdistudy.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfDiStudyApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfDiStudyApplication.class, args);

//        MyController myController = (MyController)ctx.getBean("myController");

//        System.out.println(myController.sayHello());
        System.out.println(ctx.getBean(PropertyInjectedController.class));
        System.out.println(ctx.getBean(GetterInjectedController.class));
        System.out.println(ctx.getBean(ConstructorInjectedController.class));

    }

}
