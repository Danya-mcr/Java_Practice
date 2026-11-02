package org.example.Task_2;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DefaultMessageService implements MessageService{
    public String getMessage() {
        return "Hello from default service!";
    }
}
