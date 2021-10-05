package com.the_ring.spring.aop.jdk;

import org.springframework.stereotype.Component;

@Component
public class User {

    public void add() {

        System.out.println("add ...");
        int i = 10 /0;
    }
}
