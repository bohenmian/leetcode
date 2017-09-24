package com.nowcoder.list;

import org.junit.Test;
import static org.junit.Assert.*;


public class ReverseListTest {

    private ReverseList reverseList = new ReverseList();
    @Test
    public void printListFromTailToHead() throws Exception {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        reverseList.printListFromTailToHead(node1);
    }

}