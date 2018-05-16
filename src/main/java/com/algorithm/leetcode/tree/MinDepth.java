package com.algorithm.leetcode.tree;

public class MinDepth {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //特殊情况: 当根节点的左右子树为null时,那么树的最小高度就为
        if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }
        //注意只有当一个节点有左右子树的时候才能后计算它的最小深度
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
