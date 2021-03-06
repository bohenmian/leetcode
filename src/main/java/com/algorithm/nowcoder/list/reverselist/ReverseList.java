package com.algorithm.nowcoder.list.reverselist;
/**
 * question输入一个链表，从尾到头打印链表每个节点的值。
 */

import java.util.ArrayList;
import java.util.Stack;

class ListNode {
    int value;
    ListNode next = null;

    ListNode(int value) {
        this.value = value;
    }
}

public class ReverseList {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        if (listNode == null) {
            return list;
        }
        while (listNode != null) {
            stack.push(listNode.value);
            listNode = listNode.next;
        }
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
        return list;
    }
}
