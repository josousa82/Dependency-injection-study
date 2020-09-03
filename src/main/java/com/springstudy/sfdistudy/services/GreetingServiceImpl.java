package com.springstudy.sfdistudy.services;

import org.springframework.stereotype.Service;

/**
 * Created by sousaJ on 03/09/2020
 * in package - com.springstudy.sfdistudy.services
 **/
@Service
public class GreetingServiceImpl implements GreetingService{
    public static final String HELLO_GURUS = "Hello Gurus - Original";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }



}
