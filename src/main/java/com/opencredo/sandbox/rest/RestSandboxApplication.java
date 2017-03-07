package com.opencredo.sandbox.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class RestSandboxApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestSandboxApplication.class, args);
    }
}
