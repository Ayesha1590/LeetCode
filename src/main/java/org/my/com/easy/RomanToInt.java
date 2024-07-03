package org.my.com.easy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RomanToInt {

    public static int romanToInt(String s) {
        log.info("s : {}", s);
        int result = 0,prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int current = romanTable(s.charAt(i));
            log.info("s.charAt(i) : {}", s.charAt(i));
            log.info("current : {}", current);
            if (prev > current) {
                result -= current;
                log.info("prev : {} , result : {}",prev, result);
            } else {
                result += current;
                log.info("!prev : {} , result : {}",prev, result);
            }
            prev = current;
            log.info("prev : {}", prev);
        }
        return result;
    }

    public static int romanTable(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        log.info("Result : {}", romanToInt(s));
    }
}
