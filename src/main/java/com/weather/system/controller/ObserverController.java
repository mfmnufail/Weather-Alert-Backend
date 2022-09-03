package com.weather.system.controller;

import com.weather.system.entity.Alert;
import com.weather.system.entity.Observer;
import com.weather.system.service.ObserverService;
import com.weather.system.service.WeatherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class ObserverController {

    private final ObserverService observerService;
    private final WeatherService weatherService;


    public ObserverController(ObserverService observerService, WeatherService weatherService) {
        this.observerService = observerService;
        this.weatherService = weatherService;
    }

    @PostMapping("api/observer")
    public ResponseEntity<Observer> addObserver(@Valid @RequestBody Observer observerDto){
        return new ResponseEntity<>(observerService.createObserver(observerDto), HttpStatus.CREATED);
    }

    @GetMapping("api/observer/username/{username}")
    public ResponseEntity<Observer> getObserverByUsername(@PathVariable(name = "username") String username){
        return new ResponseEntity<>(observerService.findObserverByUsername(username), HttpStatus.CREATED);
    }

    @GetMapping("api/observer/email/{email}")
    public ResponseEntity<Observer> getObserverByEmail(@PathVariable(name = "email") String email){
        return new ResponseEntity<>(observerService.findObserverByEmail(email), HttpStatus.CREATED);
    }

    @GetMapping("api/observer")
    public ResponseEntity<List<Observer>> getAllObservers(){

        return new ResponseEntity<>(observerService.getAllObservers(), HttpStatus.FOUND);
    }

    @DeleteMapping("api/observer/{id}")
    public void deleteObserver(@PathVariable(name = "id") String id){
        observerService.deleteObserver(id);

    }

    @GetMapping("api/weather")
    public ResponseEntity<List<Alert>> getWeatherDetails(){

        return new ResponseEntity<>(weatherService.getWeatherDetails(), HttpStatus.FOUND);
    }
}
