package com.weather.system.service;

import com.weather.system.entity.Observer;

import java.util.List;

public interface ObserverService {

    Observer createObserver(Observer observer);
    Observer findObserverByUsername(String username);
    Observer findObserverByEmail(String email);
    List<Observer> getAllObservers();
    void deleteObserver(String id);

}
