package com.kodilla.patterns2.facade.kodillaExample;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Authenticator {

    public boolean isAuthenticated(Long userId) {
        Random generator = new Random ();
        return generator.nextBoolean();
    }

}
