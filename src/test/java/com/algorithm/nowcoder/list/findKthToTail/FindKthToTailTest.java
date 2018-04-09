package com.algorithm.nowcoder.list.findKthToTail;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindKthToTailTest {

    private FindKthToTail findKthToTail = new FindKthToTail();

    @Test
    public void test_naFindKthToTailme_when_list_is_null() throws Exception {
        ListNode head = null;
        ListNode result = findKthToTail.FindKthToTail(head, 1);
        assertEquals(result, null);
    }

    @Test
    public void test_naFindKthToTailme_when_k_is_0() throws Exception {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        ListNode result = findKthToTail.FindKthToTail(head, 0);
        assertEquals(result, null);
    }

    @Test
    public void test_test_naFindKthToTailme_when_k_more_than_list() throws Exception {
        ListNode head = new ListNode(1);
        ListNode node = new ListNode(2);
        head.next = node;
        ListNode result = findKthToTail.FindKthToTail(head, 3);
        assertEquals(result, null);
    }

    @Test
    public void naFindKthToTailme() throws Exception {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        ListNode result = findKthToTail.FindKthToTail(head, 1);
        assertEquals(result.val, 4);
    }
}