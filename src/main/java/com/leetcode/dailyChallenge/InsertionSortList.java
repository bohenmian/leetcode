package com.leetcode.dailyChallenge;

public class InsertionSortList {

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode pre = head;
        ListNode cur = head.next;
        dummy.next = head;
        while (cur != null) {
            if (pre.val <= cur.val) {
                pre = cur;
                cur = cur.next;
            } else {
                ListNode p = dummy;
                while (p.next.val < cur.val) p = p.next;
                // 跳过cur
                pre.next = cur.next;

                //插入cur节点
                cur.next = p.next;
                p.next = cur;

                // cur回到pre后面
                cur = pre.next;
            }
        }
        return dummy.next;
    }
}
