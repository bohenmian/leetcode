package com.algorithm.chinahadoop.list.findFirstSameNode;

/**
 * 给定两个单链表,计算两个链表的第一个公共结点,若没有公共结点,返回空
 */

public class FindFirstSameNode {

    public static ListNode FindFirstSameNode(ListNode pHead1, ListNode pHead2) {
        ListNode pA = pHead1.next;
        ListNode pB = pHead2.next;
        int nA = getLength(pA);
        int nB = getLength(pB);
        if (nA > nB) {
            ListNode pTemp = pA;
            pA = pB;
            pB = pTemp;
            int temp = nA;
            nA = nB;
            nB = temp;
        }
        for (int i = 0; i < nB - nA; i++) {
            pB = pB.next;
        }
        while (pA != null) {
            if (pA.val == pB.val) {
                return pA;
            }
            pA = pA.next;
            pB = pB.next;
        }
        return null;
    }

    static int getLength(ListNode p) {
        int nLen = 0;
        while (p != null) {
            p = p.next;
            nLen++;
        }
        return nLen;
    }
}

class ListNode {
    int val;

    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}