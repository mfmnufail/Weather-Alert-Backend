package com.weather.system.service;

import com.weather.system.entity.Observer;

import java.util.List;

public interface ObserverService {

    Observer createObserver(Observer observer);
    List<Observer> getAllObservers();
    void deleteObserver(long id);

}
