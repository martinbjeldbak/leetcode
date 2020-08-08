package com.martinbjeldbak.leetcode.problems.pathsum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    void testExample1() {
        TreeNode root = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                        new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8,
                        new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));


        assertTrue(subject.hasPathSum(root, 22));
    }

    @Test
    void testMartinExample1() {
        TreeNode root = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode(7), new TreeNode(1)), null),
                new TreeNode(8,
                        new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));


        assertFalse(subject.hasPathSum(root, 22));
    }

    @Test
    void testMartinExample2() {
        assertTrue(subject.hasPathSum(new TreeNode(1), 1));
    }


    @Test
    void testFailed1() {
        assertFalse(subject.hasPathSum(new TreeNode(), 1));
    }

    @Test
    void testFailed2() {
        assertFalse(subject.hasPathSum(null, 1));
    }

    @Test
    void testFailed3() {
        assertFalse(subject.hasPathSum(new TreeNode(1, new TreeNode(2), null), 1));
    }
}