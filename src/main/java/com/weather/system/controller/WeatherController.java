package com.weather.system.controller;

import com.weather.system.entity.Observer;
import com.weather.system.entity.Weather;
import com.weather.system.service.ObserverService;
import com.weather.system.service.WeatherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ObserverController {

    private final WeatherService weatherService;

    public ObserverController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("api/weather")
    public ResponseEntity<List<Weather>> getWeatherDetails(){
        return new ResponseEntity<>(weatherService.getWeatherDetails(), HttpStatus.CREATED);
    }


}
