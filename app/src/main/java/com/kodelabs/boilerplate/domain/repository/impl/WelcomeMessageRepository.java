package com.kodelabs.boilerplate.domain.repository.impl;

import com.kodelabs.boilerplate.domain.repository.MessageRepository;

/**
 * Created by akruglov on 02.04.17.
 */

public class WelcomeMessageRepository implements MessageRepository {

    @Override
    public String getWelcomeMessage() {
        String msg = "Welcome, friend!"; // let's be friendly

        // let's simulate some network/database lag
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return msg;
    }
}
