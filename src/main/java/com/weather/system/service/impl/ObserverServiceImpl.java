package com.weather.system.service.impl;

import com.weather.system.entity.Observer;
import com.weather.system.repository.ObserverRepository;
import com.weather.system.service.ObserverService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObserverServiceImpl implements ObserverService {


    private final ObserverRepository repository;

    public ObserverServiceImpl( ObserverRepository repository) {
        this.repository = repository;
    }



    @Override
    public Observer createObserver(Observer observer) {
        repository.save(observer);
        return observer;
    }

    @Override
    public Observer findObserverByUsername(String username) {
        return repository.findObserverByUsername(username);
    }

    @Override
    public Observer findObserverByEmail(String email) {
        return   repository.findObserverByEmail(email);
    }


    @Override
    public List<Observer> getAllObservers() {
        return repository.findAll();
    }

    @Override
    public void deleteObserver(String id) {
        Observer observer = repository.findById(id).orElseThrow(()-> new RuntimeException("Not found"));
        repository.delete(observer);
    }


}


