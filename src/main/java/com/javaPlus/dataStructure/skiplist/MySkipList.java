package com.javaPlus.dataStructure.skiplist;

import java.util.Objects;
import java.util.Random;

public class MySkipList<T> {
    private SkipListEntry<T> head;  // First element of the top level
    private SkipListEntry<T> tail; // Last element of the top level

    private int nodes;   // number of the entries in the skip list
    private int listLevel;   // skip list height
    private Random random;   // coin toss
    private static final double PROBABILITY = 0.5;


    public void clear() {
        head = new SkipListEntry<>(SkipListEntry.HEAD_KEY, null);
        tail = new SkipListEntry<>(SkipListEntry.TAIL_KEY, null);
        horizontalLink(head, tail);
        listLevel = 0;
        nodes = 0;
    }

    public boolean isEmpty() {
        return nodes == 0;
    }

    public int size() {
        return nodes;
    }

    /**
     *
     * 这个方法返回的p节点是最底层的节点
     * @param key
     * @return 如果key对应的value在skip list中,那么则返回该value值;如果该key对应的value值不在skip list中,那么返回小于该key值的最近一个节点
     */
    @SuppressWarnings("unchecked")
    private SkipListEntry<T> findEntry(Integer key) {
        SkipListEntry<T> p;
        p = head;
        while (true) {
            while (p.right.key != SkipListEntry.TAIL_KEY &&
                    p.right.key.compareTo(key) <= 0) {
                p = p.right;
            }
            if (p.down != null) {
                p = p.down;
            } else {
                break;
            }
        }
        return p;
    }

    /**
     *
     * @param key
     * @return
     */
    public T getValue(Integer key) {
        SkipListEntry<T> p;
        return (p = findEntry(key)).key.equals(key) ? p.value : null;
    }

    @SuppressWarnings("unchecked")
    public T put(Integer key, T value) {
        SkipListEntry<T> p, q;
        p = findEntry(key);
        // 如果在skip list中找到key对应的value值,则修改该value值
        if (p.key.equals(key)) {
            T oldValue = p.value;
            p.value = value;
            return oldValue;
        }

        q = new SkipListEntry<>(key, value);
        // 如果在skip list中不存在key值的节点,那么进行新增操作
        backLink(p, q);

        // 下面的操作是判断新增的节点是否需要向更高层攀升
        int currentLevel = 0;
        while (random.nextDouble() < PROBABILITY) {
            // 如果skip list到达跳跃表的最大高度,则新建空白层
            if (currentLevel >= listLevel) {
                listLevel++;
                SkipListEntry<T> p1 = new SkipListEntry<>(SkipListEntry.HEAD_KEY, null);
                SkipListEntry<T> p2 = new SkipListEntry<>(SkipListEntry.TAIL_KEY, null);
                horizontalLink(p1, p2);
                vertiacallLink(p1, head);
                vertiacallLink(p2, tail);
                head = p1;
                tail = p2;
            }
            // 从p向左扫描含有高层节点的节点(最底层)
            while (p.up == null) {
                p = p.left;
            }
            p = p.up;

            // 注意：除了最底层节点以外,新增的节点都不需要value值
            SkipListEntry<T> e = new SkipListEntry<>(key, null);
            // 在上层连接左右节点
            backLink(p, e);
            // 在上下层之间连接上下节点
            vertiacallLink(e, q);
            q = e;
            currentLevel++;
        }
        nodes++;
        // 在skip list中不存在时返回null
        return null;
    }

    @SuppressWarnings("unchecked")
    public T remove(Integer key) {
        SkipListEntry<T> p, q;
        p = findEntry(key);
        if (!p.key.equals(key)) {
            return null;
        }
        T oldValue = p.value;
        while (p != null) {
            q = p.up;
            p.left.right = p.right;
            p.right.left = p.left;
            // 升向上层节点,删除上层节点
            p = q;
        }
        return oldValue;
    }



    /**
     * 在节点node1后插入node2
     * @param node1
     * @param node2
     */
    private void backLink(SkipListEntry<T> node1, SkipListEntry<T> node2) {
        node2.left = node1;
        node2.right = node1.right;
        node1.right.left = node2;
        node1.right = node2;
    }

    /**
     * 水平连接两个节点
     * @param node1
     * @param node2
     */
    private void horizontalLink(SkipListEntry<T> node1, SkipListEntry<T> node2) {
        node1.right = node2;
        node2.left = node1;
    }

    /**
     * 垂直连接两个节点
     * @param node1
     * @param node2
     */
    private void vertiacallLink(SkipListEntry<T> node1, SkipListEntry<T> node2) {
        node1.down = node2;
        node2.up = node1;
    }

    static class SkipListEntry<T> {
        private Integer key;
        private T value;
        SkipListEntry up, down, left, right;
        private static final int HEAD_KEY = Integer.MIN_VALUE;
        private static final int TAIL_KEY = Integer.MAX_VALUE;

        public SkipListEntry(Integer key, T value) {
            this.key = key;
            this.value = value;
        }

        public Integer getKey() {
            return key;
        }

        public void setKey(Integer key) {
            this.key = key;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            SkipListEntry<?> that = (SkipListEntry<?>) o;
            return Objects.equals(key, that.key) &&
                    Objects.equals(value, that.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }
    }

}
