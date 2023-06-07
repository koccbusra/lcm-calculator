package com.example.lcmcalculator.controller;

import com.example.lcmcalculator.response.CalculatorResponse;
import com.example.lcmcalculator.service.CalculatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CalculatorController {

    private static Logger logger = LoggerFactory.getLogger(CalculatorController.class);

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calculate")
    private ResponseEntity<CalculatorResponse> calculate() {
        logger.info("calculate request has been received");

        return new ResponseEntity(calculatorService.calculate(), HttpStatus.ACCEPTED);
    }
}
