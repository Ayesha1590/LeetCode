package org.my.com.easy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AddBinary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        log.info("Result : {}", addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }

        if (carry != 0) {
            sb.append(carry);
        }
        log.info("sb : {}", sb);
        return sb.reverse().toString();
    }
}
