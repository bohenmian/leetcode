package com.algorithm.nowcoder.list.mergeList;

/**
 * question 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */

public class Merge {

    public ListNode merge(ListNode listNode1, ListNode listNode2) {
        if (listNode1 == null) {
            return listNode2;
        } else if (listNode2 == null) {
            return listNode1;
        }
        ListNode mergeNode = null;
        if (listNode1.val < listNode2.val) {
            mergeNode = listNode1;
            mergeNode.next = merge(listNode1.next, listNode2);
        } else {
            mergeNode = listNode2;
            mergeNode.next = merge(listNode1, listNode2.next);
        }
        return mergeNode;
    }
}

class ListNode {
    int val;
    ListNode next = null;
    public ListNode(int val) {
        this.val = val;
    }
}
