package com.nowcoder.tree.reconstructbinarytree;

/**
 * question
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class ReConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null) {
            return null;
        }
        TreeNode root = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return root;
    }

    private TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
        if (startPre > endPre || startIn > endIn) {
            return null;
        }
        TreeNode root = new TreeNode(pre[startPre]);
        if (startPre == endPre) {
            if (startIn == endIn && pre[startPre] == in[startIn]) {
                //只有一个节点的情况
                return root;
            }
        }
        //TODO 应考虑中序遍历找不到根节点root与先序遍历第一个节点pre[startPre]相等的情况
        //从中序遍历中找到根节点
        for (int rootInOrder = startIn; rootInOrder < endIn; rootInOrder++) {
            if (in[rootInOrder] == pre[startPre]) {
                root.left = reConstructBinaryTree(pre, startPre + 1, startPre + rootInOrder - startIn, in, startIn, rootInOrder - 1);
                root.right = reConstructBinaryTree(pre, startPre + rootInOrder - startIn + 1, endPre, in, rootInOrder + 1, endIn);
            }
        }

        return root;
    }
}
