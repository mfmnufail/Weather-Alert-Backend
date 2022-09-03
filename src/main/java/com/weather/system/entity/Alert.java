package com.weather.system.entity;


import lombok.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Data
@Document
@Getter
@Setter
@NoArgsConstructor
@EnableMongoRepositories
@ComponentScan
public class Alert {

    @Id
    private String id;
    private String location;
    private String wind_speed;
    private String pressure;
    private String humidity;

    public Alert(String location, String wind_speed, String pressure, String humidity) {
        this.location = location;
        this.wind_speed = wind_speed;
        this.pressure = pressure;
        this.humidity = humidity;
    }
}
