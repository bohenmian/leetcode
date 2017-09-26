package com.nowcoder.tree.reconstructbinarytree;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReConstructBinaryTreeTest {

    private ReConstructBinaryTree reConstructBinaryTree = new ReConstructBinaryTree();

    @Test
    public void reConstructBinaryTree() throws Exception {
        int[] preOrder={1,2,4,7,3,5,6,8};
        int[] inOrder={4,7,2,1,5,3,8,6};
        TreeNode node = reConstructBinaryTree.reConstructBinaryTree(preOrder, inOrder);
    }
}