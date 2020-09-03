package com.springstudy.controllers;

import com.springstudy.sfdistudy.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by sousaJ on 20/08/2020
 * in package - com.springstudy.controllers
 **/

@Controller
public class SetterInjectedController {

    // GreetingService is an interface, and different services implement this interface
    // the qualifier annotation tells spring which implementation should be implemented
    // in the specified controller. So each controller calls is own implementation, however
    // dynamic polymorphism. Any subclass of GreetingService can be injected.
    private GreetingService greetingService;

    @Qualifier("setterInjectedGreetingService")
    @Autowired
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
