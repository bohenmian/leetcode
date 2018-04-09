package com.algorithm.chinahadoop.list.twoListAdd;


/**
 * 给定两个链表，分别表示两个非负整数。他们的数字逆序存储在链表中，且每个结点只存储一个数字，计算两个数的和，并且返回该链表
 * 如输入 2->4->3, 5->6->4 输出7->0->8
 */

public class TwoListAdd {

    public static ListNode Add(ListNode pHead1, ListNode pHead2) {
        if (pHead1.next == null || pHead2.next == null) {
            return null;
        }
        ListNode pSum = new ListNode(0);
        ListNode pTail = pSum;
        ListNode p1 = pHead1.next;
        ListNode p2 = pHead2.next;
        ListNode pCur;
        int carry = 0;
        int value;
        while (p1 != null && p2 != null) {
            value = p1.val + p2.val + carry;
            carry = value / 10;
            value %= 10;
            pCur = new ListNode(value);
            pTail.next = pCur;
            pTail = pCur;
            p1 = p1.next;
            p2 = p2.next;
        }
        ListNode p = p1 != null ? p1 : p2;
        while (p != null) {
            value = p.val + carry;
            carry = value / 10;
            value %= 10;
            pCur = new ListNode(value);
            pTail.next = pCur;
            pTail = pCur;
            p = p.next;
        }
        if (carry != 0) {
            pTail.next = new ListNode(carry);
        }
        return pSum;
    }

    public static void main(String[] args) {
        ListNode pHead1 = new ListNode(0);
        int i;
        for (i = 0; i < 6; i++) {
            ListNode p = new ListNode((int) (Math.random() * 10));
            p.next = pHead1.next;
            pHead1.next = p;
        }
        ListNode pHead2 = new ListNode(0);
        for (i = 0; i < 9; i++) {
            ListNode p = new ListNode((int) (Math.random() * 10));
            p.next = pHead2.next;
            pHead2.next = p;

        }
        Print(pHead1.next);
        Print(pHead2.next);
        ListNode pSum = Add(pHead1, pHead2);
        Print(pSum.next);
    }

    public static void Print(ListNode p) {
        while (p != null) {
            System.out.print(p.val);
            p = p.next;
        }
        System.out.printf("\n");
    }
}


class ListNode {
    int val;

    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}