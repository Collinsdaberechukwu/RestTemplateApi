package com.example.restemplateapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("")
public class CityController {

    @GetMapping("/cities")
    public List<Object> getCity(){
        String uri = "https://countriesnow.space/api/v0.1/countries";
        RestTemplate restTemplate = new RestTemplate();
        Object[] objects = new Object[] {restTemplate.getForObject(uri, Object.class)};
        return Arrays.asList(objects);
    }
}
