package com.domalchuk.listener.observer;

import org.springframework.stereotype.Component;

@Component
public interface Observer {
    void update(final String inf);
}
