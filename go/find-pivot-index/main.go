package main

func pivotIndex(nums []int) int {
	numsSum := 0
	for i := 0; i < len(nums); i++ {
		numsSum += nums[i]
	}

	leftSum := 0
	for i := 0; i < len(nums); i++ {
		if leftSum == numsSum-nums[i]-leftSum {
			return i
		}
		leftSum += nums[i]
	}

	return -1
}
