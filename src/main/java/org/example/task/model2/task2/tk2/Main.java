package org.example.task.model2.task2.tk2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        City city = context.getBean(City.class);
        System.out.println(city);
    }
}

