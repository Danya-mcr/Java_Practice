package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityAspect {

    private final UserContext userContext;

    public SecurityAspect(UserContext userContext) {
        this.userContext = userContext;
    }

    @Before("execution(* org.example.BankService.deleteAccount(..))")
    public void checkAdminAccess(JoinPoint joinPoint) {
        System.out.println("[Security] Проверка прав для метода: " + joinPoint.getSignature().getName());

        if (!"ADMIN".equals(userContext.getCurrentRole())) {
            throw new SecurityException("Доступ запрещен! Требуются права ADMIN.");
        }
        System.out.println("[Security] Доступ разрешен.");
    }

    @AfterThrowing(pointcut = "execution(* org.example.BankService.*(..))", throwing = "ex")
    public void logSecurityException(JoinPoint joinPoint, Throwable ex) {
        System.out.println("[Logging] В методе " + joinPoint.getSignature().getName() + " перехвачена ошибка: " + ex.getMessage());
    }
}
