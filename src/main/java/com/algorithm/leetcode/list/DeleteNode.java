package com.algorithm.leetcode.list;

public class DeleteNode {

    //注意这里给的是链表中要删除的节点,并不给的链表
    public void deleteNode(ListNode node) {
        //用删除节点的后一个节点的值覆盖当前节点的值
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
