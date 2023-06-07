package com.example.lcmcalculator.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void lcm_WhenUpperValueIsGiven_CalculatesLeastCommonMultiple() {
        //arrange
        long expected = 360360;
        //act
        long actual = Calculator.least_common_multiple(15);
        //assert
        Assertions.assertEquals(expected,actual);
    }
}