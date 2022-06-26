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

    @Test
    // [1,-2,-3,1,3,-2,null,-1]
    // 3
    //        1
    //     -2   -3
    //    1  3  -2
    //  -1
    void testFailed1() {
        TreeNode root = new TreeNode(1,
                new TreeNode(-2,
                        new TreeNode(1,
                                new TreeNode(-1), null),
                        new TreeNode(3)),
                new TreeNode(-3,
                        new TreeNode(-2), null));

        assertEquals(1, subject.pathSum(root, 3));
    }

    @Test
    void testMartin1() {
        assertEquals(0, subject.pathSum(new TreeNode(), 1));
    }

    @Test
    void testMartin2() {
        assertEquals(0, subject.pathSum(null, 1));
    }

    @Test
    void testMartin3() {
        assertEquals(0, subject.pathSum(null, 1));
    }
}