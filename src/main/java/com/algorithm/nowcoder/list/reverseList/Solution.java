package com.algorithm.nowcoder.list.reverseList;

/**
 * 输入一个链表，反转链表后，输出链表的所有元素。
 */

public class Solution {

    public ListNode ReverseList(ListNode pHead) {
        if (pHead == null) {
            return null;
        }
        ListNode pReverseHead = null;
        ListNode pNode = pHead;
        ListNode pPrev = null;
        while (pNode != null) {
            ListNode pNext = pNode.next;
            if (pNext == null) {
                pReverseHead = pNode;
            }
            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }
        return pReverseHead;
    }

}

class ListNode {
    int val;

    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}
