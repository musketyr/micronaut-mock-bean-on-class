package com.example;

import jakarta.inject.Singleton;

@Singleton
public class OtherService {

    private final SomeInterface someInterface;

    public OtherService(SomeInterface serviceThat) {
        this.someInterface = serviceThat;
    }

    public void doSomething() {
        someInterface.doSomething();
    }

}
