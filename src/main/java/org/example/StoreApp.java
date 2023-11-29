package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StoreApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(StoreConfig.class);

        Store store = context.getBean(Store.class);
        System.out.println("Items in the store: " + store.getItems());
    }
}
