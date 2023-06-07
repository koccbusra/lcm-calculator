package com.example.lcmcalculator.service;

import com.example.lcmcalculator.calculator.UpperNumberData;
import com.example.lcmcalculator.response.CalculatorResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
class CalculatorServiceTest {

    @InjectMocks
    private CalculatorService calculatorService;

    @Test
    void calculate_WhenCalculateIsCalled_ReturnsCalculatorResponse(){
        //arrange
        CalculatorResponse expectedCalculatorResponse = CalculatorResponse.builder()
                        .upperNumber(15)
                        .result(360360L)
                        .build();

        //act
        UpperNumberData.setNumber(15);
        CalculatorResponse actualCalculatorResponse = calculatorService.calculate();

        //assert
        Assertions.assertEquals(expectedCalculatorResponse, actualCalculatorResponse);
    }
}