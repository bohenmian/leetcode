package com.algorithm.leetcode.list;

public class HasCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode pSlow = head.next;
        if (pSlow == null) {
            return false;
        }
        ListNode pFast = pSlow.next;

        while (pFast != null && pSlow != null) {
            if (pFast == pSlow) {       //如果快慢指针相遇则代表有环
                return true;
            }
            pSlow = pSlow.next;     //慢指针,慢指针每次走一步
            pFast = pFast.next;     //快指针,快指针每次走两步
            if (pFast != null) {
                pFast = pFast.next;
            }
        }
        return false;
    }
}
