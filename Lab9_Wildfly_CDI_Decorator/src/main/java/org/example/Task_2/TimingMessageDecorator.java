package org.example.Task_2;

import jakarta.annotation.Priority;
import jakarta.decorator.Decorator;
import jakarta.decorator.Delegate;
import jakarta.inject.Inject;
import jakarta.interceptor.Interceptor;

import java.time.Instant;

@Decorator
@Priority(Interceptor.Priority.APPLICATION)
public class TimingMessageDecorator implements MessageService{
    @Inject
    @Delegate
    private MessageService messageService;

    @Override
    public String getMessage() {
        System.out.println("Timing: Start at " + Instant.now());
        String result = messageService.getMessage();
        System.out.println("Timing: End at " + Instant.now());
        return "[TIMED] " + result;
    }
}
