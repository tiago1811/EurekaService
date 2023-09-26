package com.example.clienteeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ClienteEurekaApplication {

    public static void main(String[] args) {

        SpringApplication.run(ClienteEurekaApplication.class, args);
        System.out.println("Product service ruuning....!");
    }

}
