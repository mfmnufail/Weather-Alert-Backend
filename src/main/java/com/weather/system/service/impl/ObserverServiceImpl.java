package com.weather.system.service.impl;

import com.weather.system.entity.Observer;
import com.weather.system.repository.ObserverRepository;
import com.weather.system.service.ObserverService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
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
    public List<Observer> getAllObservers() {
        return repository.findAll();
    }

    @Override
    public void deleteObserver(long id) {

    }


}


