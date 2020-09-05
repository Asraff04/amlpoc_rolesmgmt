package com.poc.rolesadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@EnableJpaRepositories(basePackages = "com.poc.rolesadmin.repository")
@SpringBootApplication
public class ComPocRolesadminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComPocRolesadminApplication.class, args);
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
