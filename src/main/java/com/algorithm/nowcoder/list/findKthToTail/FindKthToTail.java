package com.algorithm.nowcoder.list.findKthToTail;

/**
 * question 输入一个链表，输出该链表中倒数第k个结点。
 */

public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k <= 0) {
            return null;
        }
        ListNode pAhead = head;
        ListNode pBehind = null;
        for (int i = 0; i < k - 1; i++) {
            if (pAhead.next != null) {
                pAhead = pAhead.next;
            } else {
                return null;
            }
        }
        pBehind = head;
        while (pAhead.next != null) {
            pAhead = pAhead.next;
            pBehind = pBehind.next;
        }
        return pBehind;
    }
}


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}