package com.domalchuk.strategy;

import org.springframework.stereotype.Component;

@Component
public class Behaviour1 implements Behaviour {
    @Override
    public void action() {
        System.out.println("Behaviour1: action");
    }
}
