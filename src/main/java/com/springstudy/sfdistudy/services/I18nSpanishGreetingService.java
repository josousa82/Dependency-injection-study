package com.springstudy.sfdistudy.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by sousaJ on 24/08/2020
 * in package - com.springstudy.sfdistudy.services
 **/
@Profile({"ES", "default"}) // setting this profile as default
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Holla Mundo";
    }
}
