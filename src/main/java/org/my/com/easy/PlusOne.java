package org.my.com.easy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PlusOne {
    public static int[] plusOne(int[] digits) {

        for (int i =digits.length - 1; i >= 0; i--) {
            log.info("qqqqqqdigits : {}", digits);
            if (digits[i] < 9) {
                digits[i]++;
                log.info("digits : {}", digits);
                return digits;
            }

            digits[i] = 0;
            log.info("11digits : {}", digits);
        }

        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
log.info("newNumber : {}", newNumber);
        return newNumber;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] result = plusOne(digits);
            log.info("Result : {}", result);


//        digits = new int[]{4, 3, 2, 1};
//        result = plusOne(digits);
//            log.info("Result : {}", result);
//
//
//        digits = new int[]{9};
//        result = plusOne(digits);
//
//            log.info("Result : {}", result);


    }
}
