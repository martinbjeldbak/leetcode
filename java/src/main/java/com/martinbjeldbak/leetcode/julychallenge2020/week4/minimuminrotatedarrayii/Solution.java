package com.martinbjeldbak.leetcode.julychallenge2020.week4.minimuminrotatedarrayii;

import java.util.Arrays;

class Solution {
    // TODO: Attempt to implement using binary search
    public int findMin(int[] nums) {
        int middleIndex = nums.length/2 - (nums.length % 2 == 0 ? 1 : 0);

        if(nums.length == 0) {
            return -1;
        }
        if(nums.length == 1) {
            return nums[0];
        }
        else if(nums.length == 2) {
            return Math.min(nums[0], nums[1]);
        }
        else if(nums[0] < nums[middleIndex]) {
            return Math.min(nums[0], findMin(Arrays.copyOfRange(nums, middleIndex, nums.length)));
        }
        else if(nums[0] >= nums[middleIndex]) {
            int rightMin = Math.min(nums[middleIndex], findMin(Arrays.copyOfRange(nums, middleIndex, nums.length)));
            int[] left = Arrays.copyOfRange(nums, 1, middleIndex);
            int leftMin = Integer.MAX_VALUE;
            if(left.length > 0) {
                leftMin = Math.min(nums[middleIndex], findMin(left));
            }

            return Math.min(leftMin, rightMin);
        }
        return -1;
    }
}
