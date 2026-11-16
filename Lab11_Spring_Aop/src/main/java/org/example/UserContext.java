package org.example;

import org.springframework.stereotype.Component;

@Component
public class UserContext {
    private String currentRole = "USER";

    public String getCurrentRole() {
        return currentRole;
    }

    public void setCurrentRole(String currentRole) {
        this.currentRole = currentRole;
    }
}
