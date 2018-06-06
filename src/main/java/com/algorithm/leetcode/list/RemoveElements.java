package com.algorithm.leetcode.list;

public class RemoveElements {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode pre = node;
        while (pre.next != null) {
            if (pre.next.val == val) {
                pre.next = pre.next.next;
            } else {
                pre = pre.next;
            }
        }
        return node.next;
    }
}
