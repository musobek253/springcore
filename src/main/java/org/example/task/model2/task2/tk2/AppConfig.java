package org.example.task.model2.task2.tk2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:city.properties")
public class AppConfig {
    @Value("${city.name}")
    private String cityName;

    @Value("${city.numberOfPeople}")
    private int numberOfPeople;

    @Value("${city.size}")
    private double size;

    @Bean
    public City city() {
        City city = new City();
        city.setName(cityName);
        city.setNumberOfPeople(numberOfPeople);
        city.setSize(size);
        return city;
    }

}

