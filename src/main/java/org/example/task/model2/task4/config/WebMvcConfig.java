package org.example.task.model2.task4.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("org.example.task.model2.task4")
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

}
