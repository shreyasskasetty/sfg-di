package com.skasetty.sfg_di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImp implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello, World";
    }
}
