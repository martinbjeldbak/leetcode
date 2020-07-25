package com.martinbjeldbak.leetcode.julychallenge2020.week4.minimuminrotatedarrayii;

import java.util.Arrays;

class Solution {

    // [7, 0, 1, 2] => 7 !<
    public int findMin(int[] nums) {
        int middleIndex = nums.length/2 - (nums.length % 2 == 0 ? 1 : 0);

        if(nums.length == 2) {
            return Math.min(nums[0], nums[1]);
        }
        else if(nums[0] < nums[middleIndex]) {
            return Math.min(nums[0], findMin(Arrays.copyOfRange(nums, middleIndex, nums.length)));
        }
        else if(nums[0] >= nums[middleIndex]) {
            return Math.min(nums[middleIndex], findMin(Arrays.copyOfRange(nums, middleIndex, nums.length)));
        }
        return -1;
    }
}
