package com.domalchuk.strategy;

import org.springframework.stereotype.Component;

@Component
public class Behaviour2 implements Behaviour {
    @Override
    public void action() {
        System.out.println("Behaviour2: action");
    }
}
