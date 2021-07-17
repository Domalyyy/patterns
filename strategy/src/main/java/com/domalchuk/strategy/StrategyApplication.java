package com.domalchuk.strategy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyApplication {

    public static void main(final String[] args) {
        SpringApplication.run(StrategyApplication.class, args);

        final Behaviour1 behaviour1 = new Behaviour1();
        final Behaviour2 behaviour2 = new Behaviour2();

        final Example example1 = new Example();
        example1.setBehaviour(behaviour1);

        final Example example2 = new Example();
        example2.setBehaviour(behaviour2);

        example1.action();
        example2.action();
    }

}
