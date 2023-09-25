package com.example.kelvinserce;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KelvinServiceController {
    @RequestMapping("/kelvin/{temp}")
    public Double convertCelsiusToFahrenheit(@PathVariable Double temp){
        Double kelvin = (temp + 273.15);
        return kelvin;
    }
}
