package com.algorithm.leetcode.list;

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 */

public class DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pHead = head;
        ListNode pNext = head.next;

        while (pNext != null) {
            if (pHead.val == pNext.val) {
                pNext = pNext.next;
                if (pNext == null)
                    pHead.next = null;
            } else {
                pHead.next = pNext;
                pHead = pHead.next;
                pNext = pNext.next;
            }
        }
        return head;        //注意是返回head不是返回pHead,因为pHead只代表head中的最后一个节点
    }
}
