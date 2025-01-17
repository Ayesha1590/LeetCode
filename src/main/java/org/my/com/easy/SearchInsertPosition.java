package org.my.com.easy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println("Index: " + searchInsert(nums, target));  // Output: 2

        target = 2;
        System.out.println("Index: " + searchInsert(nums, target));  // Output: 1

        target = 7;
        System.out.println("Index: " + searchInsert(nums, target));  // Output: 4

        target = 0;
        System.out.println("Index: " + searchInsert(nums, target));  // Output: 0
    }
}
