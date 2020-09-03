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
public class PropertyInjectedController {

        @Qualifier("propertyInjectedGreetingService")
        @Autowired
        public GreetingService greetingService;

        public String getGreeting(){
            return greetingService.sayGreeting();
        }
}
