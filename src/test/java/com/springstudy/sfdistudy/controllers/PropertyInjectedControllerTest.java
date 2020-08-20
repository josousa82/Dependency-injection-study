package com.springstudy.sfdistudy.controllers;

import com.springstudy.sfdistudy.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by sousaJ on 20/08/2020
 * in package - com.springstudy.sfdistudy.controllers
 **/

public class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    public void setUp(){
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }
}
