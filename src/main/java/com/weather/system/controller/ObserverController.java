package com.weather.system.controller;

import com.weather.system.entity.Observer;
import com.weather.system.service.ObserverService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ObserverController {

    private final ObserverService observerService;

    public ObserverController(ObserverService observerService) {
        this.observerService = observerService;
    }

    @PostMapping("api/observer")
    public ResponseEntity<Observer> addObserver(@Valid @RequestBody Observer observerDto){

        return new ResponseEntity<>(observerService.createObserver(observerDto), HttpStatus.CREATED);
    }

    @GetMapping("api/observer")
    public ResponseEntity<List<Observer>> getAllObservers(){

        return new ResponseEntity<>(observerService.getAllObservers(), HttpStatus.CREATED);
    }

    @DeleteMapping("api/observer/{id}")
    public void deleteObserver(@PathVariable(name = "id") long id){
        observerService.deleteObserver(id);

    }
}
