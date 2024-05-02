package com.example;

import jakarta.inject.Singleton;

@Singleton
public class ServiceThatIsAClass implements SomeInterface {

    @Override
    public void doSomething() {
        System.out.println("Doing something");
    }

}
