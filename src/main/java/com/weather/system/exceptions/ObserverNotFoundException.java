package com.weather.system.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
@Getter
public class ObserverNotFoundException extends RuntimeException {

    private long id;

    public ObserverNotFoundException(long id) {
        super(String.format("Student not found with %s", id));
        this.id = id;
    }
}
