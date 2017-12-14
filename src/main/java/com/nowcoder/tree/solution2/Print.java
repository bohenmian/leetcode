package com.nowcoder.tree.solution2;

/**
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 */

import java.util.ArrayList;
import java.util.Stack;

public class Print {

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        int level = 1;
        //入栈奇数行
        Stack<TreeNode> stack1 = new Stack<>();
        stack1.push(pRoot);
        //入栈偶数行
        Stack<TreeNode> stack2 = new Stack<>();
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        while (!stack1.empty() || !stack2.empty()) {
            if (level % 2 != 0) {
                ArrayList<Integer> arrayList = new ArrayList<>();
                while (!stack1.empty()) {
                    TreeNode node = stack1.pop();
                    if (node != null) {
                        arrayList.add(node.val);
                        //奇数层从左到右
                        stack2.push(node.left);
                        stack2.push(node.right);
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayLists.add(arrayList);
                    level++;
                }
            } else {
                ArrayList<Integer> arrayList = new ArrayList();
                while (!stack2.empty()) {
                    TreeNode node = stack2.pop();
                    if (node != null) {
                        arrayList.add(node.val);
                        //偶数层从右到左
                        stack1.push(node.right);
                        stack1.push(node.left);
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayLists.add(arrayList);
                    level++;
                }
            }
        }
        return arrayLists;
    }
}

class TreeNode {
    int val = 0;

    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
