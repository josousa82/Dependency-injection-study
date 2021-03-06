package com.springstudy.sfdistudy.controllers;


import com.springstudy.sfdistudy.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by sousaJ on 20/08/2020
 * in package - com.springstudy.sfdistudy.controllers
 **/

@Controller
public class PropertyInjectedController {

        @Autowired
        @Qualifier("greetingServiceImpl")
        public GreetingService greetingServiceIlm;

        public String sayHello(){
            return greetingServiceIlm.sayGreeting();
        }
}
