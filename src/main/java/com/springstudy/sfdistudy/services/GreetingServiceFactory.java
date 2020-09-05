package com.springstudy.sfdistudy.services;

import com.springstudy.sfdistudy.repositories.GreetingRepository;
import org.springframework.stereotype.Service;

/**
 * Created by sousaJ on 03/09/2020
 * in package - com.springstudy.sfdistudy.services
 **/

public class GreetingServiceFactory {

    private final GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public  GreetingService createGreetingService(String lang){
        switch (lang) {
            case "en":
                return new PrimaryGreetingService(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingService(greetingRepository);
            case "de":
                return new PrimaryGermanGreetingService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);

        }
    }
}
