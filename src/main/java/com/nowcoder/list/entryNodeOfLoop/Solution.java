package com.nowcoder.list.entryNodeOfLoop;

/**
 * 一个链表中包含环，请找出该链表的环的入口结点。
 */

public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode meetNode = meetingNode(pHead);
        if (meetNode == null) {
            return null;
        }
        int nodesCount = 1;
        ListNode pNode = meetNode;
        while (pNode.next != meetNode) {
            pNode = pNode.next;
            nodesCount++;
        }
        pNode = pHead;
        for (int i = 0; i < nodesCount; i++) {
            pNode = pNode.next;
        }
        ListNode node = pHead;
        while (pNode != node) {
            pNode = pNode.next;
            node = node.next;
        }
        return node;
    }

    private ListNode meetingNode(ListNode pHead) {
        if (pHead == null) {
            return null;
        }
        ListNode pSlow = pHead.next;
        if (pSlow == null) {
            return null;
        }
        ListNode pFast = pSlow.next;
        while (pFast != null && pSlow != null) {
            if (pFast == pSlow) {
                return pFast;
            }
            //pSlow一次走一步,pFast一次走两步,如果链表有环则相遇
            pSlow = pSlow.next;
            pFast = pFast.next;
            if (pFast != null) {
                pFast = pFast.next;
            }
        }
        return null;
    }
}

class ListNode {
    int val;

    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}
