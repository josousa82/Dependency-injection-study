package com.springstudy.sfdistudy.repositories;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by sousaJ on 03/09/2020
 * in package - com.springstudy.sfdistudy.repositories
 **/
@Component
public class GreetingRepositoryImpl implements GreetingRepository{

    @Override
    public String getEnglishGreeting() {
        return "Hello Primary Greeting Service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de saludo Primaria";
    }

    @Override
    public String getGermanGreeting() {
        return "Primärer Grußdienst";
    }
}
