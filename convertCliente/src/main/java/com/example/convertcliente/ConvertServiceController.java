package com.example.convertcliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConvertServiceController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/convert/{temp}")
    public String convert(@PathVariable String temp) {
        String fahrenheit = restTemplate.getForObject("http://fahrenheit-service/fahrenheit/{temp}", String.class, temp);
        String kelvin = restTemplate.getForObject("http://kelvin-service/kelvin/{temp}", String.class, temp);
        return "Fahrenheit: " + fahrenheit + "Kelvin: " + kelvin;
    }

}
