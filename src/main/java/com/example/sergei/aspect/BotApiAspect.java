package com.example.sergei.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Component for logging controller and service methods with Spring AOP
 *
 * @author Sergei Kudryashov
 * @since 1.0
 */
@Aspect
@Component
public class BotApiAspect {

    @Pointcut("execution(* com.example.sergei.controller.*Controller.*(..))")
    public void controllerMethods() {}

    @Pointcut("execution(* com.example.sergei.service.*.*(..))")
    public void serviceMethods() {}

    @Around("serviceMethods()")
    public Object logMethodCall(ProceedingJoinPoint thisJoinPoint) throws Throwable {
        Logger log = LoggerFactory.getLogger(thisJoinPoint.getTarget().getClass());
        String methodName = thisJoinPoint.getSignature().getName();
        log.debug("Call method {}()", methodName);

        long start = System.currentTimeMillis();
        Object result = thisJoinPoint.proceed();
        long proceedTime = System.currentTimeMillis() - start;

        log.debug("Method {}() run {} millis", methodName, proceedTime);
        return result;
    }

    @AfterThrowing(
            pointcut = "controllerMethods()",
            throwing = "ex"
    )

    public void afterThrowingAdvice(JoinPoint thisJoinPoint, RuntimeException ex) {
        Logger log = LoggerFactory.getLogger(thisJoinPoint.getTarget().getClass());
        String methodName = thisJoinPoint.getSignature().getName();
        log.error("Method {}() throws: ", methodName, ex);
    }

}