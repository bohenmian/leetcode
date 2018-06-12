package com.algorithm.leetcode.common;

import java.util.Stack;

public class MyQueue {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
    int front;

    public void push(int x) {
        if (stack1.empty()) {
            front = x;
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack2.push(x);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public void pop() {
        stack1.pop();
    }

    public int peek() {
        return stack1.peek();
    }


    public boolean empty() {
        return stack1.empty();
    }

}
