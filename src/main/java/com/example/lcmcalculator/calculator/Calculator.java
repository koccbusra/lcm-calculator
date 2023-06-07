package com.example.lcmcalculator.calculator;

public class Calculator {
    private static long greatest_common_divider(long result, long value) {
        if(result%value != 0)
            return greatest_common_divider(value,result%value);
        else
            return value;
    }

    public static long least_common_multiple(long n) {
        long result = 1;
        for (long i = 1; i <= n; i++) {
            long gcm = greatest_common_divider(result, i);
            result = result * i / gcm;
        }
        return result;
    }
}
