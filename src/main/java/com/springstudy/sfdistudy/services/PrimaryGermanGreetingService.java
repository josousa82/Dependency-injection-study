package com.springstudy.sfdistudy.services;

import com.springstudy.sfdistudy.repositories.GreetingRepository;

/**
 * Created by sousaJ on 03/09/2020
 * in package - com.springstudy.sfdistudy.services
 **/
public class PrimaryGermanGreetingService implements GreetingService{

    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }


    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
