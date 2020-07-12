package com.martinbjeldbak.leetcode.julychallenge2020.week1.binarylevelordertraversal2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        System.out.println("Evaluating " + root.val);

        List<List<Integer>> nodeOrder = new ArrayList<>();
        bfs(root, 0, nodeOrder);

        Collections.reverse(nodeOrder);
        return nodeOrder;
    }

    public void bfs(TreeNode node, int level, List<List<Integer>> map) {
        if(node == null)
            return;

        if(level >= map.size()) {
            List<Integer> newLevel = new ArrayList<>();
            newLevel.add(node.val);
            map.add(newLevel);
        } else {
            map.get(level).add(node.val);
        }

        bfs(node.left, level + 1, map);
        bfs(node.right, level + 1, map);
    }

}
