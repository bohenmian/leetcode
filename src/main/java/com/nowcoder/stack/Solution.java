package com.nowcoder.stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数
 */

import java.util.Stack;

public class Solution {

    private static Stack<Integer> stack = new Stack<>();
    private static Stack<Integer> minStack = new Stack<>();


    public void push(int node) {
        stack.push(node);
        if (minStack.empty() || node < minStack.peek()) {
            minStack.push(node);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
