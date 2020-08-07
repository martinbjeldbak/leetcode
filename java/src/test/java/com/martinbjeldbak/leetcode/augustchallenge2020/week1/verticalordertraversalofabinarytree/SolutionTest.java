package com.martinbjeldbak.leetcode.augustchallenge2020.week1.verticalordertraversalofabinarytree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    // Without loss of generality, we can assume the root node is at position (0, 0):
    // Then, the node with value 9 occurs at position (-1, -1);
    // The nodes with values 3 and 15 occur at positions (0, 0) and (0, -2);
    // The node with value 20 occurs at position (1, -1);
    // The node with value 7 occurs at position (2, -2).
    void testExample1() {
        TreeNode root = new TreeNode(3, new TreeNode(9),
                                            new TreeNode(20,
                                                    new TreeNode(15),
                                                    new TreeNode(7)));

        assertEquals(List.of(List.of(9), List.of(3, 15), List.of(20), List.of(7)), subject.verticalTraversal(root));
    }

    @Test
    // The node with value 5 and the node with value 6 have the same position according to the given scheme.
    // However, in the report "[1,5,6]", the node value of 5 comes first since 5 is smaller than 6.
    void testExample2() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7)));

        assertEquals(List.of(List.of(4), List.of(2), List.of(1, 5, 6), List.of(3), List.of(7)), subject.verticalTraversal(root));
    }
}