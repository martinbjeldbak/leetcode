package com.martinbjeldbak.leetcode.augustchallenge2020.week2.pathsumiii;

// https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/550/week-2-august-8th-august-14th/3417/
class Solution {
    public int pathSum(TreeNode root, int sum) {
        if(root == null)
            return 0;

        return dfs(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int dfs(TreeNode root, int leftoverSum) {
        if(root == null)
            return 0;

        return (root.val == leftoverSum ? 1 : 0) +
                dfs(root.left, leftoverSum - root.val) +
                dfs(root.right, leftoverSum - root.val);
    }
}
