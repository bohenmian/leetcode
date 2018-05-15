package com.algorithm.leetcode.tree;

import java.util.*;

public class LevelOrderBottom {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int nextLevel = 0;  //标记下一层节点的数量
        int toBePrinted = 1;    //将要打印节点的个数(打印从根节点开始,所以toBePrinted的初始值应该为1)
        while (!queue.isEmpty()) {      //题目要求从做到右开始打印,那么当该层节点打印后那么将它的左右节点加入队列
            //不能在while循环中new ArrayList, 因为每次添加一个元素就会归null,但是我们需要添加完一层再归null
            TreeNode node = queue.remove();
            arrayList.add(node.val);
            nextLevel++;        //记录该层需要打印节点的个数
            //将该节点的左右节点入队
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            if (nextLevel == toBePrinted) {
                toBePrinted = queue.size();     //ToBePrinted标志为下一层将要打印的个数
                lists.add(arrayList);
                nextLevel = 0;       //重新归0
                arrayList = new ArrayList<>();
            }
        }
        Collections.reverse(lists);
        return lists;
    }
}
