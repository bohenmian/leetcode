package com.algorithm.chinahadoop.list.reverseList;


/**
 * 给定一个链表,翻转该链表从m到n的位置.要求直接翻转而非申请新空间
 * 如给定1->2->3->4->5 , m=2,n=4.返回1->4->3->2->5
 */

public class ReverseList {

    public static void ReverseList(ListNode pHead, int from, int to) {
        if (pHead == null || pHead.next == null) {
            return;
        }
        if (to < from) {
            throw new RuntimeException();
        }
        ListNode pCur = pHead.next;
        int i;
        for (i = 0; i < from - 1; i++) {
            pHead = pCur;
            pCur = pHead.next;
        }
        //pPre待翻转的第一个结点
        ListNode pPre = pCur;
        //pCur待翻转的第二个结点
        pCur = pCur.next;
        to--;
        ListNode pNext;
        for (; i < to; i++) {
            //待翻转的第三个结点
            pNext = pCur.next;
            pCur.next = pHead.next;
            pHead.next = pCur;
            pPre.next = pNext;
            pCur = pNext;
        }
    }

    public static void main(String[] args) {
        ListNode pHead = new ListNode(0);
        for (int i = 0; i < 10; i++) {
            ListNode p = new ListNode((int) (Math.random() * 10));
            p.next = pHead.next;
            pHead.next = p;
        }
        Print(pHead.next);
        ReverseList(pHead, 2, 4);
        Print(pHead.next);
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
