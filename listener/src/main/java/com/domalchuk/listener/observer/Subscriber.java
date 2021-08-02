package com.domalchuk.listener.observer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class Subscriber implements Observer {
    private String inf;

    @Override
    public void update(final String inf) {
        System.out.println("Old value: " + this.inf);
        this.inf = inf;
        System.out.println("New value: " + this.inf);
    }
}
