package com.algorithm.leetcode.list;

public class GetIntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthOfA = getLength(headA);
        int lengthOfB = getLength(headB);
        if (lengthOfA > lengthOfB) {        //无法确定哪个链表长,做一次预处理
            ListNode pTemp = headA;
            headA = headB;
            headB = pTemp;
            int n = lengthOfA;
            lengthOfA = lengthOfB;
            lengthOfB = n;
        }
        for (int i = 0; i < lengthOfB - lengthOfA; i++) {      //让长的链表先空转多出的长度
            headB = headB.next;
        }
        while (headA != null) {
            if (headA.val != headB.val) {   //如果两个链表相等,那么他们的值也应该相等
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    //计算链表的长度
    static int getLength(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
