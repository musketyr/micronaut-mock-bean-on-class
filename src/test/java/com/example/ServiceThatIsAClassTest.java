package com.example;

import io.micronaut.test.annotation.MockBean;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class ServiceThatIsAClassTest {


    @Inject OtherService otherService;
    @Inject ServiceThatIsAClass serviceThat;

    @MockBean
    ServiceThatIsAClass serviceThat() {
        return Mockito.mock(ServiceThatIsAClass.class);
    }

    @Test
    void testDoSomething() {
        otherService.doSomething();

        // verify that the method was called 1 time
        Mockito.verify(serviceThat, Mockito.times(1)).doSomething();
    }


}