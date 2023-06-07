package com.example.lcmcalculator.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class UpperNumberResponse {
    String message;
    Integer upperValue;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpperNumberResponse)) {
            return false;
        }
        UpperNumberResponse ur = (UpperNumberResponse) obj;
        return ur.message.equals(this.message)
                && ur.upperValue.equals(this.upperValue);
    }
}
