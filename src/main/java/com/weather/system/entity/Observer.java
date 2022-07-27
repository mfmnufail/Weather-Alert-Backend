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
public class Observer {

    @Id
    private String id;
    private String username;
    private String email;

    public Observer(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
