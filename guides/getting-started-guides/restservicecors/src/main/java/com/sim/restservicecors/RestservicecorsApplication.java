package com.sim.restservicecors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class RestservicecorsApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestservicecorsApplication.class, args);
    }

    /**
     * method to configure how to handle cross-origin resource sharing
     * */
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/greeting-javaconfig")
                        .allowedOrigins("http://localhost:8080");
            }
        };
    }
}
