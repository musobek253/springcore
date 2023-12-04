package org.example.task.model2.task3.tk1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransformAspect {

    @Before("execution(* org.example.task.model2.task3.tk1.Transform.start())")
    public void beforeStart(JoinPoint joinPoint) {
        System.out.println("Before start method execution");
    }

    @After("execution(* org.example.task.model2.task3.tk1.Transform.start())")
    public void afterStart(JoinPoint joinPoint) {
        System.out.println("After start method execution");
    }

    @AfterReturning(pointcut = "execution(* org.example.task.model2.task3.tk1.Transform.start())", returning = "result")
    public void afterReturningStart(JoinPoint joinPoint, Object result) {
        System.out.println("After returning from start method with result: " + result);
    }
}

