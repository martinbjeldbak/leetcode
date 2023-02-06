package main

func shuffle(nums []int, n int) []int {
	result := make([]int, n*2)

	resIndex := 0
	for i := 0; i < n; i++ {
		result[resIndex] = nums[i]
		result[resIndex+1] = nums[n+i]
		resIndex += 2
	}
	return result
}
