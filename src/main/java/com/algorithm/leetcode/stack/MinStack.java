package com.algorithm.leetcode.stack;

import java.util.Stack;

public class MinStack {

    private Stack<Integer> minStack = new Stack<>();    //记录最小元素的栈
    private Stack<Integer> stack = new Stack<>();       //栈

    public MinStack() {

    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    //注意此处的比较stack和minStack的peek元素不能用==,因为泛型不支持基本类型,所以需要基本类型的包装类,同时对象比较不能用==,==比较的是地址
    public void pop() {
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
