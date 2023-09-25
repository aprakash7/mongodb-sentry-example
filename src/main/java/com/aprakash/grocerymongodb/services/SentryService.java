package com.aprakash.grocerymongodb.services;

import io.sentry.Sentry;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class SentryService {

    @PreDestroy
    public void init() {
        System.out.println("Sending Sentry exit message... ");
        Sentry.captureMessage("Sentry example server exited gracefully");
    }
}
