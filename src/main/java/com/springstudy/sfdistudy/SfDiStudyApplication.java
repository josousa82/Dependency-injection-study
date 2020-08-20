package com.springstudy.sfdistudy;

import com.springstudy.sfdistudy.controllers.MyController;
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
    }

}
