package com.algorithm.leetcode.list;

/**
 * 断开节点链的时候,需要记录该节点的下一个节点和当前节点
 */

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        //如果链表只有一个节点,那么直接返回即可
        if (head.next == null) {
            return head;
        }
        //用来记录翻转以后的头结点
        ListNode pReverseHead = null;
        //当前节点
        ListNode pNode = head;
        //尾节点
        ListNode pTail = null;
        while (pNode != null) {
            ListNode pNext = pNode.next;
            if (pNext == null) {
                pReverseHead = pNode;
            }
            //pTail记录的是该节点的前一个节点
            pNode.next = pTail;
            //记录当前节点,方便翻转的时候使用
            pTail = pNode;
            //将该节点往后移动
            pNode = pNext;
        }
        return pReverseHead;
    }
}
