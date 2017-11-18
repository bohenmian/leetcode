package com.nowcoder.list.mergeList;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MergeTest {
    private Merge merge = new Merge();

    @Test
    public void test_merge_when_listnode1_null() throws Exception {
        ListNode listNode1 = null;
        ListNode listNode2 = new ListNode(1);
        ListNode result = merge.merge(listNode1, listNode2);
        assertEquals(result.val, 1);
    }

    @Test
    public void test_merge_when_listnode1_and_listnode2_null() throws Exception {
        ListNode listNode1 = null;
        ListNode listNode2 = null;
        ListNode result = merge.merge(listNode1, listNode2);
        assertEquals(result, null);
    }

    @Test
    public void merge() throws Exception {
        int i = 1;
        ListNode listNode1 = new ListNode(1);
        ListNode node1 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        listNode1.next = node1;
        listNode2.next = node2;
        ListNode result = merge.merge(listNode1, listNode2);
        while (result != null) {
            assertEquals(result.val, i);
            i++;
            result = result.next;
        }
    }
}