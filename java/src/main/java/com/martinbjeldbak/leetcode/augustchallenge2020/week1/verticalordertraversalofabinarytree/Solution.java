package com.martinbjeldbak.leetcode.augustchallenge2020.week1.verticalordertraversalofabinarytree;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3415/
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> test = new ArrayList<>();

        if(root.left != null) {
            test.addAll(verticalTraversal(root.left));
        }

        test.add(verticalSliceAt(root));

        if(root.right != null) {
            test.addAll(verticalTraversal(root.right));
        }

        return test;
    }

    private List<Integer> verticalSliceAt(TreeNode root) {
        if(root.left != null && root.left.right != null && root.right != null && root.right.left != null) {
            return List.of(root.val, root.left.right.val, root.right.left.val);
        }
        else if(root.left != null && root.left.right != null) {
            return List.of(root.val, root.left.right.val);
        }
        else if(root.right != null && root.right.left != null) {
            return List.of(root.val, root.right.left.val);
        }
        return List.of(root.val);
    }
}