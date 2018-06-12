package com.algorithm.leetcode.list;

public class IsPalindrome {

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if (head == null || head.next == null) {
            return true;
        }
        //当快节点到尾部的时候,慢节点刚好走过一半
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //翻转后部分链表
        ListNode midNode = slow;
        ListNode firstNode = slow.next;
        ListNode cur = firstNode.next;
        //翻转后第一个节点的后一个节点为null
        firstNode.next = null;
        while (cur != null) {
            //断开连接前一定要记录后一个节点
            ListNode nextNode = cur.next;
            cur.next = midNode.next;
            //将节点向后移动
            midNode.next = cur;
            cur = nextNode;
        }

        slow = head;
        fast = midNode.next;
        while (fast != null) {
            if (fast.val != slow.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
}
