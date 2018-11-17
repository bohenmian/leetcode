package com.javaPlus.dataStructure.skiplist;

public class SkipListNode<T> {

    public T key;
    public SkipListNode<T>[] next;

    @SuppressWarnings("unchecked")
    public SkipListNode(T key, int n) {
        this.key = key;
        next = new SkipListNode[n];
        for (int i = 0; i < n; i++) {
            next[i] = null;
        }
    }
}
