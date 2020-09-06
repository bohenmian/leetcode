package com.leetcode.dailyChallenge;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class GetAllElements {

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        getAllTreeNode(root1, list1);
        getAllTreeNode(root2, list2);
        return mergeList(list1, list2);
    }

    private void getAllTreeNode(TreeNode root, List<Integer> list) {
        if (root == null) return;
        getAllTreeNode(root.left, list);
        list.add(root.val);
        getAllTreeNode(root.right, list);
    }

    private List<Integer> mergeList(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int size1 = list1.size();
        int size2 = list2.size();
        int index1 = 0;
        int index2 = 0;
        while (index1 < size1 && index2 < size2) {
            Integer value1 = list1.get(index1);
            Integer value2 = list2.get(index2);
            if (value1 < value2) {
                result.add(value1);
                index1++;
            } else {
                result.add(value2);
                index2++;
            }
        }
        while (index1 < size1) {
            result.add(list1.get(index1++));
        }
        while (index2 < size2) {
            result.add(list2.get(index2++));
        }
        return result;
    }
}
