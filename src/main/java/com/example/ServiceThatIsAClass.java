package com.example;

import jakarta.inject.Singleton;

@Singleton
public class ServiceThatIsAClass {

    public void doSomething() {
        System.out.println("Doing something");
    }

}
