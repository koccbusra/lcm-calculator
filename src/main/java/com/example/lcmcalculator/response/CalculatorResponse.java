package com.example.lcmcalculator.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class CalculatorResponse {
    private Integer upperNumber;
    private Long result;
    private Long elapsedTimeInNanoSec;

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CalculatorResponse)) {
            return false;
        }
        CalculatorResponse cr = (CalculatorResponse)obj;
        return cr.upperNumber.equals(this.upperNumber)
                && cr.result.equals(this.result);
    }
}
