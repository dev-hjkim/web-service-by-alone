package com.example.webservicebyalone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class WebServiceByAloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebServiceByAloneApplication.class, args);
    }

}
