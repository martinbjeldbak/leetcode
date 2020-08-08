package com.martinbjeldbak.leetcode.augustchallenge2020.week2.pathsumiii;

// https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/550/week-2-august-8th-august-14th/3417/
class Solution {
    public int pathSum(TreeNode root, int sum) {
        return dfs(root, 0, sum);
    }

    private int dfs(TreeNode root, int currentSum, int target) {
        int numPaths = 0;

        if((root.val + currentSum) == target) {
            numPaths += 1;
        }

        if(root.left != null) {
            numPaths += dfs(root.left, root.val + currentSum, target);
            numPaths += dfs(root.left, 0, target);
        }

        if(root.right != null) {
            numPaths += dfs(root.right, root.val + currentSum, target);
            numPaths += dfs(root.right, 0, target);
        }

        return numPaths;
    }
}
