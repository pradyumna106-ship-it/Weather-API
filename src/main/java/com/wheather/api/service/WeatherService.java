package com.wheather.api.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    @Cacheable(value = "weatherCache", key = "#city")
    public String getWeather(String city) {

        String url =
            "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/"
            + city + "?key=" + apiKey;

        return restTemplate.getForObject(url, String.class);
    }
}

