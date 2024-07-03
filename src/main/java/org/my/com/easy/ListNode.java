package org.my.com.easy;

import lombok.Data;

@Data
public class ListNode {
   public int val;
   public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        ListNode current = this;
//        while (current != null) {
//            sb.append(current.val).append(" -> ");
//            current = current.next;
//        }
//        sb.append("null");
//        return sb.toString();
//    }
}
