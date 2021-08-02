package com.domalchuk.listener;

import com.domalchuk.listener.observable.Publisher;
import com.domalchuk.listener.observer.Subscriber;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListenerApplication {
    public static void main(final String[] args) {
        SpringApplication.run(ListenerApplication.class, args);

        final Publisher publisher = new Publisher();

        final Subscriber subscriber1 = new Subscriber();
        final Subscriber subscriber2 = new Subscriber();
        final Subscriber subscriber3 = new Subscriber();

        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);
        publisher.subscribe(subscriber3);

        publisher.doChanges("Changes");

        publisher.unsubscribe(subscriber2);

        System.out.println();
        publisher.doChanges("New changes");

        System.out.println();
        System.out.println();
        publisher.subscribe(subscriber2);

        publisher.doChanges("Revert");
    }
}
