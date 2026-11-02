package org.example.Task_1;

import jakarta.enterprise.context.ApplicationScoped;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

@ApplicationScoped
public class GreetingService implements IGreetingService{
    private final AtomicInteger callCount = new AtomicInteger(0);
    private final String serverName = "WildFly 42";

    @Override
    public String getGreeting() {
        int count = callCount.incrementAndGet();
        return String.format("Hello from CDI! Call #%d", count);
    }

    @Override
    public String getServerInfo() {
        return String.format("Server: %s | Time: %s", serverName, LocalDateTime.now());
    }

    @Override
    public String getSystemStats() {
        Runtime runtime = Runtime.getRuntime();
        long memoryUsed = (runtime.freeMemory() * runtime.freeMemory()) / (1024 * 1024);
        return String.format("Memory: %d MB | Calls: %d", memoryUsed, callCount.get());
    }
}
