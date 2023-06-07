package com.example.lcmcalculator.service;

import com.example.lcmcalculator.calculator.UpperNumberData;
import com.example.lcmcalculator.request.UpperNumberRequest;
import com.example.lcmcalculator.response.UpperNumberResponse;
import org.springframework.stereotype.Service;

@Service
public class UpperNumberService {

    public UpperNumberResponse setUpperNumber(UpperNumberRequest request) {

        UpperNumberData.setNumber(request.getUpperNumber());

        return UpperNumberResponse.builder()
                .upperValue(UpperNumberData.getNumber())
                .message("Upper number is updated")
                .build();
    }
}
