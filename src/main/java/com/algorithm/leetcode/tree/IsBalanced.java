package com.algorithm.leetcode.tree;

/**
 * Given a binary tree, determine if it is height-balanced(判断一个树是不是平衡二叉树)
 */

public class IsBalanced {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftDepth = getLength(root.left);       //获取左子树的深度(根节点)
        int rightDepth = getLength(root.right);     //获取右子树的深度(根节点)
        if (Math.abs(leftDepth - rightDepth) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);     //递归判断根节点的左右子树是否满足条件
    }

    //获取树深度的函数
    private int getLength(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getLength(root.left), getLength(root.right)) + 1;
    }
}
