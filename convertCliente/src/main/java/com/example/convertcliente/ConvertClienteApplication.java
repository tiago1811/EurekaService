package com.example.convertcliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConvertClienteApplication {

    public static void main(String[] args) {

        SpringApplication.run(ConvertClienteApplication.class, args);
        System.out.println("Product ConvertService ruuning....!");

    }
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
