package com.algorithm.leetcode.tree;

public class IsSameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        //遍历过程中如果发现值不相等则返回false
        if (p.val != q.val) {
            return false;
        }
        //递归遍历树的所有节点,判断树的每个节点是否相等
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
