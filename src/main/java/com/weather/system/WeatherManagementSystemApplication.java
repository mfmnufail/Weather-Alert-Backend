package com.weather.system;

import com.weather.system.entity.Observer;
import com.weather.system.repository.ObserverRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class WeatherManagementSystemApplication {




    public static void main(String[] args) {
        SpringApplication.run(WeatherManagementSystemApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(ObserverRepository repository){
//        return args -> {
//            Observer observer = new Observer("dfsd","test@test.com");
//            repository.save(observer);
//        };


//    }

}
