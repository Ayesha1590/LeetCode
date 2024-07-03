package org.my.com.easy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RemoveDuplicatesFromSortedArray {

//    public static void main(String[] args) {
//        ListNode nums = new ListNode(1,new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(3)))));
//        log.info("Result : {}", removeDuplicates(nums));
//    }
//
//  public static ListNode removeDuplicates(ListNode head) {
//    ListNode current = head;
//    while (current != null && current.next != null) {
//      if (current.next.val == current.val) {
//        current.next = current.next.next;
//      } else {
//        current = current.next;
//      }
//    }
//    return head;
//  }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2,2,3,4};
        log.info("Result : {}", removeDuplicates(nums));
    }

    public static int[] removeDuplicates(int[] nums) {
    if (nums.length == 0) {
            return new int[0];
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        log.info("i : {} , num : {}", i,nums);
        int[] result = new int[i + 1];
        for (int k = 0; k < result.length; k++) {
            result[k] = nums[k];
            log.info("result : {}", result[k]);
        }
        return result;
    }
}
