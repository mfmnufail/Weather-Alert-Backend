package com.weather.system.service.impl;


import com.weather.system.entity.Alert;
import com.weather.system.repository.WeatherRepository;
import com.weather.system.service.WeatherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherServiceImpl implements WeatherService {

    private final WeatherRepository repository;

    public WeatherServiceImpl(WeatherRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Alert> getWeatherDetails() {
        return repository.findAll();
    }
}
