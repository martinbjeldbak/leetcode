package com.martinbjeldbak.leetcode.augustchallenge2020.week2.pascalstriangleii;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/550/week-2-august-8th-august-14th/3421/
class Solution {
    public List<Integer> getRow(int rowIndex) {
        int numRows = rowIndex + 1;
        List<List<Integer>> rows = new ArrayList<>(numRows);

        for(int k = 0; k < numRows; k++) {
            List<Integer> row = new ArrayList<>(k + 1);

            for(int i = 0; i < (k + 1); i++) {
                if(i == 0 || i == k) {
                    row.add(i, 1);
                } else {
                    List<Integer> prevRow = rows.get(k-1);

                    row.add(i, prevRow.get(i-1) + prevRow.get(i));
                }
            }
            rows.add(row);
        }

        return rows.get(rowIndex);
    }
}
