package com.example.lcmcalculator.controller;

import com.example.lcmcalculator.request.UpperNumberRequest;
import com.example.lcmcalculator.response.UpperNumberResponse;
import com.example.lcmcalculator.service.UpperNumberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UpperNumberController {
    private final UpperNumberService upperNumberService;
    private static Logger logger = LoggerFactory.getLogger(UpperNumberController.class);

    public UpperNumberController(UpperNumberService upperNumberService) {
        this.upperNumberService = upperNumberService;
    }

    @PutMapping("/upperNumber")
    public ResponseEntity<UpperNumberResponse> setUpperValue(@RequestBody UpperNumberRequest request){
        logger.info("upperNumber update request has been received number = {}", request.getUpperNumber());

        return new ResponseEntity(upperNumberService.setUpperNumber(request), HttpStatus.OK);
    }


}
