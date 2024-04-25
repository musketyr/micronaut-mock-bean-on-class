package com.example;

import jakarta.inject.Singleton;

@Singleton
public class ServiceThatIsAClass {

    void doSomething() {
        System.out.println("Doing something");
    }

}
