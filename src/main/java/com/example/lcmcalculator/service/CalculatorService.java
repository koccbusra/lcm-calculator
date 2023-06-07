package com.example.lcmcalculator.service;

import com.example.lcmcalculator.calculator.Calculator;
import com.example.lcmcalculator.calculator.UpperNumberData;
import com.example.lcmcalculator.response.CalculatorResponse;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public CalculatorResponse calculate() {

        long startTime = System.nanoTime();
        long result = Calculator.least_common_multiple(UpperNumberData.getNumber());
        long endTime = System.nanoTime();
        long elapsedTimeInNanoSec = endTime - startTime;

        return CalculatorResponse.builder()
                .result(result)
                .upperNumber(UpperNumberData.getNumber())
                .elapsedTimeInNanoSec(elapsedTimeInNanoSec)
                .build();
    }
}
