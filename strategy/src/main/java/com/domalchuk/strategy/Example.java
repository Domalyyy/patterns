package com.domalchuk.strategy;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Example {
    private Behaviour behaviour;

    public void action() {
        behaviour.action();
    }
}
