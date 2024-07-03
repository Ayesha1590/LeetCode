package org.my.com.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class MinNoOfMovesToSeatEveryOne {
    public static void main(String[] args) {
        int[] seats = {3, 1, 5};
        int[] students = {2,7, 4};
        log.info("Result : {}", minMovesToSeat(seats, students));
    }

    public static int minMovesToSeat(int[] seats, int[] students) {
        int n = seats.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            log.info("seats[i] : {} , students[i] : {}",seats[i], students[i]);
            result += Math.abs(seats[i] - students[i]);
            log.info("result : {}", result);
        }
        return result;
    }

    public static int minMovesToSeat1(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int result = 0;
        for (int i = 0; i < seats.length; i++) {
            result += Math.abs(seats[i] - students[i]);
        }
        return result;
    }

}
