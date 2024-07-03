package org.my.com.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {3, 6, 88, 8,0};
        int[] nums2 = {1, 4, 2, 90, 9};
        int m = nums1.length;
        int n = nums2.length;
        int[] nums11 = merge(nums1, m, nums2, n);
        log.info("Result : {}", nums11);
    }

    public static int[] merge1(int[] arr1, int n1, int[] arr2, int n2) {
        int i = 0, j = 0, k = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] arr3 = new int[n1 + n2];

        // Traverse both array

        while (i < n1 || j < n2) {

            // Check if current element of first

            // array is smaller than current element

            // of second array. If yes, store first

            // array element and increment first array

            // index. Otherwise do same with second array

            if (arr1[i] < arr2[j])

                arr3[k++] = arr1[i++];

            else

                arr3[k++] = arr2[j++];

        }


        // Store remaining elements of first array

        while (i < n1)
            arr3[k++] = arr1[i++];


        // Store remaining elements of second array

        while (j < n2)
            arr3[k++] = arr2[j++];

//        Arrays.sort(arr3);
        return arr3;
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        log.info("nums1 : {}", nums1);
        log.info("nums2 : {}", nums2);
        int[] arr3 = new int[m + n];
        for (int i = 0; i < m; i++) {
            arr3[i] = nums1[i];
        }
        log.info("1st arr3 : {}", arr3);
        for (int i = 0; i < n; i++) {
            arr3[m + i] = nums2[i];
        }
        log.info("arr3 : {}", arr3);
        Arrays.sort(arr3);
        return arr3;
    }
}

