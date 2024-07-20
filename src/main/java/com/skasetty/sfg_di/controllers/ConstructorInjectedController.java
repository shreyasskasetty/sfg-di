package com.skasetty.sfg_di.controllers;

import com.skasetty.sfg_di.services.GreetingService;

public class ConstructorInjectedController {
    private final GreetingService greetingService;


    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
