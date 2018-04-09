package com.algorithm.leetcode.list;

public class addTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pSum = new ListNode(0);
        ListNode pTail = pSum;
        ListNode pCur;
        int carry = 0;
        int value;
        while (l1 != null && l2 != null) {
            value = l1.val + l2.val + carry;
            carry = value /10;
            value %= 10;
            pCur = new ListNode(value);
            pTail.next = pCur;
            pTail = pCur;
            l1 = l1.next;
            l2 = l2.next;
        }
        ListNode l = l1 != null ? l1 : l2;
        while (l != null) {
            value = l.val + carry;
            carry = value / 10;
            value %= 10;
            pCur = new ListNode(value);
            pTail.next = pCur;
            pTail = pCur;
            l = l.next;
        }
        if (carry != 0) {
            pTail.next = new ListNode(carry);
        }
        return pSum.next;
    }
}

class ListNode {
    int val;

    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}
