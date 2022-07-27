package com.weather.system.repository;

import com.weather.system.entity.Weather;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WeatherRepository extends MongoRepository<Weather, String> {
}
