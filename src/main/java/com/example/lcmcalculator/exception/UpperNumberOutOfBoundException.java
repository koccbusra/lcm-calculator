package com.example.lcmcalculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UpperNumberOutOfBoundException extends RuntimeException {
    public UpperNumberOutOfBoundException(String s) {
        super("Upper number is out of bound! valid between [1:25]");
    }
}
