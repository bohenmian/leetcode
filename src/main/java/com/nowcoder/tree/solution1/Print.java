package com.nowcoder.tree.solution1;

/**
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Print {
    ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        if (pRoot == null) {
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        queue.add(pRoot);
        int nextLevel = 0;
        int toBePrinted = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            arrayList.add(node.val);
            nextLevel++;
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            if (nextLevel == toBePrinted) {
                toBePrinted = queue.size();
                nextLevel = 0;
                lists.add(arrayList);
                arrayList = new ArrayList<>();
            }
        }
        return lists;
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
