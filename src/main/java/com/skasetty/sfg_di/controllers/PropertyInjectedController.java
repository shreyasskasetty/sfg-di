package com.skasetty.sfg_di.controllers;

import com.skasetty.sfg_di.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
