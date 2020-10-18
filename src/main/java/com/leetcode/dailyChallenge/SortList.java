package com.leetcode.dailyChallenge;

/**
 * https://leetcode-cn.com/problems/sort-list/solution/sort-list-gui-bing-pai-xu-lian-biao-by-jyd/
 */

public class SortList {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        int length = 0;
        ListNode node = head;
        // 计算链表长度
        while (node != null) {
            length++;
            node = node.next;
        }
        // 用来记录排序后链表的head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        // 将链表分割,从长度为1的链表块开始归并,到最后长度为n的链表
        for (int i = 1; i < length; i *= 2) {
            ListNode begin = dummy;
            for (int j = 0; j + i < length; j = j + 2 * i) {
                ListNode first = begin.next, second = first;
                // 找到第二块链表的起始head,即走i步
                for (int k = 0; k < i; k++) second = second.next;

                int f = 0, s = 0;
                while (f < i && s < i && second != null) {
                    if (first.val < second.val) {
                        begin.next = first;
                        begin = begin.next;
                        first = first.next;
                        f++;
                    } else {
                        begin.next = second;
                        begin = begin.next;
                        second = second.next;
                        s++;
                    }
                }

                while (f < i) {
                    begin.next = first;
                    begin = begin.next;
                    first= first.next;
                    f++;
                }
                while (s < i && second != null) {
                    begin.next = second;
                    begin = begin.next;
                    second = second.next;
                    s++;
                }
                begin.next = second;
            }
        }
        return dummy.next;
    }
}
