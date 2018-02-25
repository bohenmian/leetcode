package com.chinahadoop.list.deleteDuplicateNode;

/**
 * 给定排序的链表,删除重复元素,只保留重复元素第一次出现的结点
 */

public class DeleteDuplicateNode {

    public static void DeleteDuplicateNode(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return;
        }
        ListNode pPre = pHead.next;
        ListNode pCur;
        while (pPre != null) {
            pCur = pPre.next;
            if (pCur != null && pCur.val == pPre.val) {
                pPre.next = pCur.next;
            } else {
                pPre = pCur;
            }
        }
    }

    public static void Print(ListNode p) {
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }

    public static void main(String[] args) {
        ListNode pHead = new ListNode(0);
        int[] data = {2, 3, 3, 5, 7, 8, 8, 8, 9, 9, 30};
        for (int i = data.length - 1; i >= 0; i--) {
            ListNode p = new ListNode(data[i]);
            p.next = pHead.next;
            pHead.next = p;
        }
        DeleteDuplicateNode(pHead);
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
