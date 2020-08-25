package com.springstudy.sfdistudy.controllers;

import com.springstudy.sfdistudy.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by sousaJ on 24/08/2020
 * in package - com.springstudy.sfdistudy.controllers
 **/
@Controller
public class I18NController {

    private final GreetingService greetingService;

    public I18NController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
