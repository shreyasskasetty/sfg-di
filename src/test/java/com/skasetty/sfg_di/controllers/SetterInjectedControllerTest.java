package com.skasetty.sfg_di.controllers;

import com.skasetty.sfg_di.services.GreetingServiceImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {
    SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImp());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}