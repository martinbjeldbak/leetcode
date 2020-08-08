package com.martinbjeldbak.leetcode.problems.pathsum;

// https://leetcode.com/problems/path-sum/
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        return dfs(root, sum);
    }

    private boolean dfs(TreeNode root, int currentSum) {
        if(root == null)
            return false;
        if(root.val == currentSum && root.left == null && root.right == null)
            return true;

        return dfs(root.left, currentSum - root.val) ||
               dfs(root.right, currentSum - root.val);
    }
}
