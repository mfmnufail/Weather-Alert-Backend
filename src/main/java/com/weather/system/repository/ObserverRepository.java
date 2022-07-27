package com.weather.system.repository;

import com.weather.system.entity.Observer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface ObserverRepository extends MongoRepository<Observer,String> {
}
