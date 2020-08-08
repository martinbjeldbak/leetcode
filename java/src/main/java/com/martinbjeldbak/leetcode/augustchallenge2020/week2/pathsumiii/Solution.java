package com.martinbjeldbak.leetcode.augustchallenge2020.week2.pathsumiii;

// https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/550/week-2-august-8th-august-14th/3417/
class Solution {
    public int pathSum(TreeNode root, int sum) {
        return dfs(root, sum, sum);
    }

    private int dfs(TreeNode root, int currentSum, int target) {
        if(root == null)
            return 0;
        if(root.val == currentSum)
            return 1;

        return dfs(root.left, currentSum - root.val, target) +
                dfs(root.left, target, target) +
                dfs(root.right, currentSum - root.val, target) +
                dfs(root.right, target, target);
    }
}
