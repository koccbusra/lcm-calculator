package com.example.lcmcalculator.calculator;

import com.example.lcmcalculator.exception.UpperNumberOutOfBoundException;
import com.example.lcmcalculator.exception.UpperNumberNotSetException;

public class UpperNumberData {
    private static final Integer LOWER_BOUND = 1;
    private static final Integer UPPER_BOUND = 25;
    private static Integer upperNumber=-1;

    public static Integer getNumber(){
        if(upperNumber==-1)
            throw new UpperNumberNotSetException("");
        return upperNumber;
    }

    public static void setNumber(Integer value){
        if(value<LOWER_BOUND || UPPER_BOUND<value)
            throw new UpperNumberOutOfBoundException("");
        upperNumber = value;
    }
}
