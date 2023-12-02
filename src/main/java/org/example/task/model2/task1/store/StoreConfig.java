package org.example.task.model2.task1.store;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StoreConfig {
    @Bean
    public Item item() {
        Item item = new Item();
        item.setName("Item1 ");
        item.setPrice(10.0);
        return item;
    }

    @Bean
    public Store store(Item item) {
        Store store = new Store();
        store.setItems(List.of(item));
        return store;
    }
}
