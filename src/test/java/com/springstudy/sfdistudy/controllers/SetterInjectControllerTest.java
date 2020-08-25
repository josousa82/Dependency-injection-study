package com.springstudy.sfdistudy.controllers;

import com.springstudy.sfdistudy.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by sousaJ on 20/08/2020
 * in package - com.springstudy.sfdistudy.controllers
 **/
public class SetterInjectControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    public void setUp(){
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }

}
