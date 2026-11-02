package org.example.Task_1;

import jakarta.annotation.Priority;
import jakarta.decorator.Decorator;
import jakarta.decorator.Delegate;
import jakarta.inject.Inject;
import jakarta.interceptor.Interceptor;

import java.time.Duration;
import java.time.Instant;

@Decorator
@Priority(Interceptor.Priority.APPLICATION)
public class LoggingGreetingDecorator implements IGreetingService{
    @Inject
    @Delegate
    private IGreetingService greetingService;

    public String getGreeting() {
        System.out.println("Decorator: getGreeting() called at " + Instant.now());

        Instant start = Instant.now();
        String result = greetingService.getGreeting();
        Instant end = Instant.now();

        long duration = Duration.between(start, end).toMillis();
        System.out.println("Decorator: getGreeting() took " + duration + "ms");

        return "*(" + result + ")*";
    }

    @Override
    public String getServerInfo() {
        System.out.println(" Decorator: getServerInfo() called");
        String original = greetingService.getServerInfo();
        return original + " | Powered by CDI Decorator";
    }

    @Override
    public String getSystemStats() {
        System.out.println("Decorator: getSystemStats() called");
        String original = greetingService.getSystemStats();

        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() / (1024 * 1024);
        return original + String.format(" | Max Memory: %d MB", maxMemory);
    }
}
