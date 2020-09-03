package com.springstudy.controllers;

import com.springstudy.sfdistudy.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by sousaJ on 20/08/2020
 * in package - com.springstudy.controllers
 **/

public class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    public void setUp(){
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }
}
