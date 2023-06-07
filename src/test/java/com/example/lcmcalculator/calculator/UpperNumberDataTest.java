package com.example.lcmcalculator.calculator;

import com.example.lcmcalculator.exception.UpperNumberNotSetException;
import com.example.lcmcalculator.exception.UpperNumberOutOfBoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpperNumberDataTest {

    @Test
    void setUpperNumber_WhenInvalidUpperNumberIsGiven_ThrowsUpperNumberOutOfBoundException() {
        //arrange
        String expectedErrorMessage = "Upper number is out of bound! valid between [1:25]";
        //act assert
        Exception exception = assertThrows(UpperNumberOutOfBoundException.class, () -> UpperNumberData.setNumber(-1));
        Assertions.assertEquals(expectedErrorMessage, exception.getMessage());
    }

    @Test
    void getUpperNumber_WhenUpperNumberIsSet_ReturnValidUpperValue() {
        //arrange
        int expectedUpperValue = 15;
        //act
        UpperNumberData.setNumber(15);
        // assert
        Assertions.assertEquals(expectedUpperValue, UpperNumberData.getNumber());
    }
}