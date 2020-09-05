package com.springstudy.sfdistudy.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by sousaJ on 20/08/2020
 * in package - com.springstudy.sfdistudy.services
 **/
@Service
public class ConstructorGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world -- Injected via Constructor";
    }
}
