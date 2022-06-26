package main

func runningSum(nums []int) []int {
	runningSum := make([]int, len(nums))
	curSum := 0

	for i := 0; i < len(nums); i++ {
		curSum += nums[i]
		runningSum[i] = curSum
	}

	return runningSum
}
