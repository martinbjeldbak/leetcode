package main

func pivotIndex(nums []int) int {
	for i := 0; i < len(nums); i++ {
		leftSum := 0
		for l := 0; l < i; l++ {
			leftSum += nums[l]
		}

		rightSum := 0
		for r := i + 1; r < len(nums); r++ {
			rightSum += nums[r]
		}

		if leftSum == rightSum {
			return i
		}
	}

	return -1
}
