package com.algorithm.nowcoder.list.clone;

/**
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */

public class Clone {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }
        CloneNodes(pHead);
        ConnectRandomNodes(pHead);
        return ReConnectNodes(pHead);
    }

    private void CloneNodes(RandomListNode pHead) {
        RandomListNode pNode = pHead;
        while (pNode != null) {
            RandomListNode pCloneNode = new RandomListNode(0);
            pCloneNode.label = pNode.label;
            pCloneNode.next = pNode.next;
            pCloneNode.random = null;

            pNode.next = pCloneNode;
            pNode = pCloneNode.next;
        }
    }

    private void ConnectRandomNodes(RandomListNode pHead) {
        RandomListNode pNode = pHead;
        while (pNode != null) {
            RandomListNode pCloneNode = pNode.next;
            if (pNode.random != null) {
                pCloneNode.random = pNode.random.next;
            }
            pNode = pCloneNode.next;
        }
    }

    private RandomListNode ReConnectNodes(RandomListNode pHead) {
        RandomListNode pNode = pHead;
        RandomListNode pCloneNode = null;
        RandomListNode pCloneHead = null;
        if (pNode != null) {
            pCloneNode = pCloneHead = pNode.next;
            pNode.next = pCloneNode.next;
            pNode = pNode.next;
        }
        while (pNode != null) {
            pCloneNode.next = pNode.next;
            pCloneNode = pCloneNode.next;
            pNode.next = pCloneNode.next;
            pNode = pNode.next;
        }
        return pCloneHead;
    }
}

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    public RandomListNode(int label) {
        this.label = label;
    }
}
