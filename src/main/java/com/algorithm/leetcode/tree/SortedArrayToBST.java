package com.algorithm.leetcode.tree;

public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {      //因为给的是一个排序的数组,所以重建后的BST有多种
        if (nums == null) {
            return null;
        }
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int low, int high) {
        if (low > high) {
            return null;
        }
        int middle = (low + high) / 2;      //将中间元素作为根节点
        TreeNode root = new TreeNode(nums[middle]);
        root.left = sortedArrayToBST(nums, low, middle - 1);    //那么数组中在中间元素左边的是左子树,递归调用
        root.right = sortedArrayToBST(nums, middle + 1, high);      //那么数组中在中间元素右边的是右子树,递归调用
        return root;
    }
}
