package com.springstudy.sfdistudy.controllers;

import com.springstudy.sfdistudy.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by sousaJ on 20/08/2020
 * in package - com.springstudy.sfdistudy.controllers
 **/

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
