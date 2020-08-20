package com.springstudy.sfdistudy.controllers;

import com.springstudy.sfdistudy.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by sousaJ on 20/08/2020
 * in package - com.springstudy.sfdistudy.controllers
 **/
public class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    public void getGreetingTest(){
        System.out.println(controller.getGreeting());
    }

}
