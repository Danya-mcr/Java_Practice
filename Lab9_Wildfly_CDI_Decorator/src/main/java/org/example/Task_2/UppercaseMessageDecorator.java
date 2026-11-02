package org.example.Task_2;

import jakarta.annotation.Priority;
import jakarta.decorator.Decorator;
import jakarta.decorator.Delegate;
import jakarta.inject.Inject;
import jakarta.interceptor.Interceptor;

@Decorator
@Priority(Interceptor.Priority.APPLICATION)
public class UppercaseMessageDecorator implements MessageService{
    @Inject
    @Delegate
    private MessageService messageService;

    @Override
    public String getMessage() {
        System.out.println("Uppercasing: Before calling service");
        String result = messageService.getMessage();
        System.out.println("Uppercasing: After calling service");
        return result.toUpperCase();
    }
}
