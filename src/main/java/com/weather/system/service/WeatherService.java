package com.weather.system.service;

import com.weather.system.entity.Alert;

import java.util.List;

public interface WeatherService {

    List<Alert> getWeatherDetails();
}
