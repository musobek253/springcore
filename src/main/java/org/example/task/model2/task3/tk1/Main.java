package org.example.task.model2.task3.tk1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Transform transform = (Transform) context.getBean("transform");
        transform.start();

        ((ClassPathXmlApplicationContext) context).close();
    }
}

