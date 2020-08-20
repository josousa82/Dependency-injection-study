package com.springstudy.sfdistudy.controllers;


import com.springstudy.sfdistudy.services.GreetingService;

/**
 * Created by sousaJ on 20/08/2020
 * in package - com.springstudy.sfdistudy.controllers
 **/
public class PropertyInjectedController {

        public GreetingService greetingService;

        public String getGreeting(){
            return greetingService.sayGreeting();
        }
}
