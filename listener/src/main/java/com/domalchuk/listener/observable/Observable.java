package com.domalchuk.listener.observable;

import com.domalchuk.listener.observer.Observer;
import org.springframework.stereotype.Component;

@Component
public interface Observable {
    void subscribe(final Observer observer);
    void unsubscribe(final Observer observer);
    void unsubscribeAll();
    void notifySubscribers();
    void notifySubscribers(final Object inf);
}
