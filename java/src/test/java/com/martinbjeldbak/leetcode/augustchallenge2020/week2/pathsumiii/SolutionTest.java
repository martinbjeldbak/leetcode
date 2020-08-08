package com.martinbjeldbak.leetcode.augustchallenge2020.week2.pathsumiii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    // root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
    //
    //      10
    //     /  \
    //    5   -3
    //   / \    \
    //  3   2   11
    // / \   \
    //3  -2   1
    //
    //Return 3. The paths that sum to 8 are:
    //
    //1.  5 -> 3
    //2.  5 -> 2 -> 1
    //3. -3 -> 11
    void testExample1() {
        TreeNode root = new TreeNode(10,
                new TreeNode(5,
                        new TreeNode(3,
                                new TreeNode(3), new TreeNode(-2)),
                        new TreeNode(2, null, new TreeNode(1))),
                new TreeNode(-3, null, new TreeNode(11)));

        assertEquals(3, subject.pathSum(root, 8));
    }

}