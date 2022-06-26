package com.martinbjeldbak.leetcode.julychallenge2020.week4.constructbinarytreefrominorderandpostordertraversal;

import java.util.Arrays;

// https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/547/week-4-july-22nd-july-28th/3403/
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(postorder.length == 0) {
            return null;
        }

        int rootVal = postorder[postorder.length - 1];
        int[] leftSubtreeInOrder, rightSubtreeInOrder, leftSubtreePostOrder, rightSubtreePostOrder;

        for(int i = 0; i < inorder.length; i++) {
            if(inorder[i] == rootVal) {
                leftSubtreeInOrder = Arrays.copyOfRange(inorder, 0, i);
                rightSubtreeInOrder = Arrays.copyOfRange(inorder, i + 1, inorder.length);

                leftSubtreePostOrder = Arrays.copyOfRange(postorder, 0, leftSubtreeInOrder.length);
                rightSubtreePostOrder = Arrays.copyOfRange(postorder, leftSubtreePostOrder.length, postorder.length - 1);

                return new TreeNode(rootVal, buildTree(leftSubtreeInOrder, leftSubtreePostOrder),
                                             buildTree(rightSubtreeInOrder, rightSubtreePostOrder));
            }
        }

        // Should not go here
        return null;
    }
}
