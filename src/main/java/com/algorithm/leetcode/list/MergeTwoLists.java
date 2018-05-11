package com.algorithm.leetcode.list;

/**
 * 合并两个有序的链表
 */

public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        ListNode mergeNode = null;
        if (l1.val < l2.val) {
            mergeNode.next = l1;
            mergeNode.next = mergeTwoLists(l1.next, l2);

        } else {
            mergeNode.next = l2;
            mergeNode.next = mergeTwoLists(l1, l2.next);
        }
        return mergeNode;
    }
}
