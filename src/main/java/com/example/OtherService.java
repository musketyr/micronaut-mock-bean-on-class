package com.example;

import jakarta.inject.Singleton;

@Singleton
public class OtherService {

    private final ServiceThatIsAClass serviceThatIsAClass;

    public OtherService(ServiceThatIsAClass serviceThat) {
        this.serviceThatIsAClass = serviceThat;
    }

    public void doSomething() {
        serviceThatIsAClass.doSomething();
    }

}
