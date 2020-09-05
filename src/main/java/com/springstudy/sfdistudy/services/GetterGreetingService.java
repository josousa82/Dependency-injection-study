package com.springstudy.sfdistudy.services;

import org.springframework.stereotype.Service;

/**
 * Created by sousaJ on 05/09/2020
 * in package - com.springstudy.sfdistudy.services
 **/
@Service
public class GetterGreetingService implements GreetingService{



    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the getter";
    }
}
