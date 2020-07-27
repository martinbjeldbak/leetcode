package com.martinbjeldbak.leetcode.julychallenge2020.week4.constructbinarytreefrominorderandpostordertraversal;

import com.sun.source.tree.Tree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    // For example, given
    //
    // inorder = [9,3,15,20,7]
    // postorder = [9,15,7,20,3]
    // Return the following binary tree:
    //
    //    3
    //   / \
    //  9  20
    //    /  \
    //   15   7
    void testExample1() {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertEquals(root, subject.buildTree(new int[] { 9, 3, 15, 20, 7 }, new int[] { 9, 15, 7, 20, 3 }));
    }

    @Test
    void testMartinExample1() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4, null, new TreeNode(8)), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        assertEquals(root, subject.buildTree(new int[] { 4, 8, 2, 5, 1, 6, 3, 7 }, new int[] { 8, 4, 5, 2, 6, 7, 3, 1 }));
    }

    @Test
    void testMartinExample2() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertEquals(root, subject.buildTree(new int[] { 2, 1, 3 }, new int[] { 2, 3, 1 }));
    }

    @Test
    void testMartinExample3() {
        TreeNode root = new TreeNode(1);
        assertEquals(root, subject.buildTree(new int[] { 1 }, new int[] { 1 }));
    }
}