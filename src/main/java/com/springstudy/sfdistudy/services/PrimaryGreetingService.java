package com.springstudy.sfdistudy.services;

import com.springstudy.sfdistudy.repositories.GreetingRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by sousaJ on 21/08/2020
 * in package - com.springstudy.sfdistudy.services
 **/

// A Bean defined as Primary in this case will be set as "default"
// the controller MyController is injecting the GreetingService Interface but
// doesn't have the @Qualifier annotation defining which service should be injected
// so the Bean that will be injected is the one defined as default, set as @Primary

@Primary
@Service
@Profile({"EN", "default"})
public class PrimaryGreetingService implements GreetingService{

    private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
