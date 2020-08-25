package com.springstudy.sfdistudy.services;

import org.springframework.stereotype.Service;

/**
 * Created by sousaJ on 20/08/2020
 * in package - com.springstudy.sfdistudy.services
 **/
@Service
public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}