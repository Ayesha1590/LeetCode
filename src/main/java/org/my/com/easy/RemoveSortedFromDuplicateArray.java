package org.my.com.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class RemoveSortedFromDuplicateArray {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static int removeDuplicates1(int[] nums) {
        Arrays.stream(nums).distinct().toArray();
        long count = Arrays.stream(nums).distinct().count();
        int b=   count > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) count;
        log.info("b : {}", b);
        return nums.length == 0 ? 0 : b;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        log.info("Result : {}", removeDuplicates1(nums));
    }
}
