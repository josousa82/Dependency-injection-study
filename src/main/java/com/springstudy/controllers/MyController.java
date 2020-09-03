package com.springstudy.controllers;

import com.springstudy.sfdistudy.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by sousaJ on 20/08/2020
 * in package - com.springstudy.controllers
 **/
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return "Hi folks!! -- From the Primary Bean";
    }

}
