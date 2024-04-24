package com.yassine.keycloak;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EntityScan("com.yassine.keycloak")
@SpringBootApplication
public class SpringBootKeycloakApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootKeycloakApp.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}