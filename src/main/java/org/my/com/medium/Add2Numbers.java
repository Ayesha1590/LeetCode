package org.my.com.medium;

import lombok.extern.slf4j.Slf4j;
import org.my.com.easy.ListNode;

@Slf4j
public class Add2Numbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode  current = dummyHead;
        int carry = 0;

        while (l1!= null || l2!= null) {
            log.info("l1 : {} , l2 : {} , current : {}", l1,l2, current);
            int x = (l1!= null) ? l1.val : 0;
            int y = (l2!= null) ? l2.val : 0;

            int sum = carry + x + y;
            carry = sum / 10;
            log.info("sum : {} , carry : {}", sum, carry);
            current.next = new ListNode(sum % 10);
            current = current.next;
log.info("current : {}", current);
            if (l1!= null) {
                l1= l1.next;
            }

            if (l2!= null) {
                l2= l2.next;
            }
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        log.info("Result : {}", addTwoNumbers(l1, l2));
    }
}
