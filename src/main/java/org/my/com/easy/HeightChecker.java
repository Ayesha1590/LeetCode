package org.my.com.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class HeightChecker {

    public int Solution(int[] heights) {
        int[] sorted = heights.clone();
        Arrays.sort(sorted);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sorted[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
        log.info("Before : {}", heights);
        HeightChecker heightChecker = new HeightChecker();
        log.info("Result : {}", heightChecker.Solution(heights));

    }
}
