package org.example.task.model2.task3.tk2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Transform transform = context.getBean( Transform.class);
        transform.start();

        context.close();
    }
}

