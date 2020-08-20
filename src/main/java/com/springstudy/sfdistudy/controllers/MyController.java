package com.springstudy.sfdistudy.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by sousaJ on 20/08/2020
 * in package - com.springstudy.sfdistudy.controllers
 **/
@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello Worlds!!");
        return "Hi folks!!";
    }

}
