package com.aprakash.grocerymongodb.services;

import io.sentry.Sentry;
import jakarta.annotation.PostConstruct;

public class SentryService {

    @PostConstruct
    public void init() {
        try {
            throw new Exception("This is the mongodb test.");
        } catch (Exception e) {
            Sentry.captureException(e);
        }
    }
}
