package com.springstudy.sfdistudy.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by sousaJ on 21/08/2020
 * in package - com.springstudy.sfdistudy.services
 **/
@Primary
@Service
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY Bean";
    }
}
