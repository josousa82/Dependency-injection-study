package com.springstudy.sfdistudy.controllers;

import com.springstudy.sfdistudy.services.GreetingService;
import com.springstudy.sfdistudy.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;


/**
 * Created by sousaJ on 20/08/2020
 * in package - com.springstudy.sfdistudy.controllers
 **/
@Controller
public class MyController {


    private final GreetingService greetingService;

    public MyController(GreetingServiceImpl greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!!!");
        return greetingService.sayGreeting();
    }

}
