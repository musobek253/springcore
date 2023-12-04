package org.example.task.model2.task3.tk2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "org.example.task.model2.task3.tk2")
public class AppConfig {
    // Configuration for your application

    @Bean
    public TransformAspect transformAspect(){
        return new TransformAspect();
    }
    @Bean
    public Transform transform(){
        return new Transform();
    }
}

