package com.example.lcmcalculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UpperNumberNotSetException extends RuntimeException{
    public UpperNumberNotSetException(String message) {
        super("Upper number hasn't been set!");
    }
}
