package com.example.lcmcalculator.service;

import com.example.lcmcalculator.calculator.UpperNumberData;
import com.example.lcmcalculator.request.UpperNumberRequest;
import com.example.lcmcalculator.response.CalculatorResponse;
import com.example.lcmcalculator.response.UpperNumberResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
class UpperNumberServiceTest {

    @InjectMocks
    private UpperNumberService upperNumberService;

    @Test
    void setUpperNumber_WhenSetUpperNumberIsCalled_ReturnsUpperNumberResponse(){
        //arrange
        UpperNumberResponse expectedUpperNumberResponse = UpperNumberResponse.builder()
                .upperValue(10)
                .message("Upper number is updated")
                .build();

        UpperNumberRequest request = UpperNumberRequest.builder()
                .upperNumber(10)
                .build();
        //act
        UpperNumberResponse actualUpperNumberResponse = upperNumberService.setUpperNumber(request);

        //assert
        Assertions.assertEquals(expectedUpperNumberResponse, actualUpperNumberResponse);
    }

}