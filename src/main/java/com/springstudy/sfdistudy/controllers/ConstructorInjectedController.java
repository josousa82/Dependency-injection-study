package com.springstudy.sfdistudy.controllers;

import com.springstudy.sfdistudy.services.GreetingService;
import com.springstudy.sfdistudy.services.GreetingServiceImpl;

/**
 * Created by sousaJ on 20/08/2020
 * in package - com.springstudy.sfdistudy.controllers
 **/
public class ConstructorInjectedController {

    GreetingService greetingService;

    public ConstructorInjectedController(GreetingServiceImpl greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
