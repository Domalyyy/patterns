package com.domalchuk.listener.observable;

import com.domalchuk.listener.observer.Observer;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@RequiredArgsConstructor
@Component
public class Publisher implements Observable {
    private final Set<Observer> observers = new HashSet<>();
    private boolean changed;
    private String inf;

    @Override
    public void subscribe(final Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribe(final Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void unsubscribeAll() {
        this.observers.clear();
    }

    @Override
    public void notifySubscribers() {
        if (this.changed) {
            for (final Observer observer : this.observers) {
                observer.update(this.inf);
            }
            this.changed = false;
        }
    }

    @Override
    public void notifySubscribers(final Object inf) {
        if (this.changed) {
            for (final Observer observer : this.observers) {
                observer.update(this.inf);
            }
            this.changed = false;
        }
    }

    public void doChanges(final String inf) {
        if (!inf.equals(this.inf)) {
            this.inf = inf;
            this.changed = true;

            this.notifySubscribers(inf);
        }
    }
}
