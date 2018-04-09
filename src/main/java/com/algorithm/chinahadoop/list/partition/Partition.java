package com.algorithm.chinahadoop.list.partition;

/**
 * 给定一个链表和一个X值,将链表划分成两部分,使得划分后小于X的结点在前,大于X的结点在后.在这两部分中要保持原链表中的出现顺序
 * 1->4->3->2->5->2和X=3,返回1->2->2->4->3->5
 */

public class Partition {

    public static ListNode Partition(ListNode pHead, int pivotKey) {
        ListNode pLeftHead = new ListNode(0);
        ListNode left = pLeftHead;
        ListNode pRightHead = new ListNode(0);
        ListNode right = pRightHead;
        ListNode p = pHead.next;
        while (p != null) {
            if (p.val < pivotKey) {
                left.next = p;
                left = p;
            } else {
                right.next = p;
                right = p;
            }
            p = p.next;
        }
        left.next = pRightHead.next;
        right.next = null;
        pHead.next = pLeftHead.next;
        return pHead;
    }

    public static void Print(ListNode p) {
        while (p != null) {
            System.out.print(p.val);
            p = p.next;
        }
        System.out.printf("\n");
    }

    public static void main(String[] args) {
        ListNode pHead = new ListNode(0);
        pHead.next = null;
        for (int i = 0; i < 10; i++) {
            ListNode p = new ListNode((int) (Math.random() * 10));
            p.next = pHead.next;
            pHead.next = p;
        }
        Partition(pHead, 4);
        Print(pHead.next);
    }

}

class ListNode {
    int val;

    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}
