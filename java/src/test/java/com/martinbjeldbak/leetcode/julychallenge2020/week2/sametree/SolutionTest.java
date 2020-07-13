package com.martinbjeldbak.leetcode.julychallenge2020.week2.sametree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    // Input:    1         1
    //          / \       / \
    //         2   3     2   3
    //
    //        [1,2,3],   [1,2,3]
    //
    // Output: true
    void testExample1() {
        TreeNode n1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode n2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        assertTrue(subject.isSameTree(n1, n2));
    }

    @Test
    // Input:    1         1
    //          /           \
    //         2             2
    //
    //        [1,2],     [1,null,2]
    //
    // Output: false
    void testExample2() {
        TreeNode n1 = new TreeNode(1, new TreeNode(2), null);
        TreeNode n2 = new TreeNode(1, null, new TreeNode(2));

        assertFalse(subject.isSameTree(n1, n2));
    }

    @Test
    // Input:    1         1
    //          / \       / \
    //         2   1     1   2
    //
    //        [1,2,1],   [1,1,2]
    //
    // Output: false
    void testExample3() {
        TreeNode n1 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode n2 = new TreeNode(1, new TreeNode(1), new TreeNode(2));

        assertFalse(subject.isSameTree(n1, n2));
    }

}