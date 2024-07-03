package org.my.com.easy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Palindrome {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reversed = 0;
        int original = x;
        while (x != 0) {
            int digit = x % 10;
            log.info("digit : {}", digit);
            reversed = reversed * 10 + digit;
            log.info("reversed : {}", reversed);
            x = x/10;
            log.info("x : {}", x);
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        int x = 121;
        log.info("Result : {}", isPalindrome(x));
    }
}
