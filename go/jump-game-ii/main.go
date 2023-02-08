package jumpgameii

import "fmt"

func jump(nums []int) int {
	fmt.Printf("Got nums %v\n", nums)
	return jumpRec(nums, 0, 0)
}

func jumpRec(nums []int, start int, numJumps int) int {
	if start >= len(nums)-1 {
		return numJumps
	}
	fmt.Printf("  start: %v, value: %v, numJumps: %v\n", start, nums[start], numJumps)

	maxJumps := nums[start]

	jumps := make([]int, 0, len(nums))

	for i := 1; i <= maxJumps; i++ {
		jumps = append(jumps, jumpRec(nums, start+i, numJumps+1))
	}
	fmt.Printf("  jumps: %v\n", jumps)

	minJumps := 99999
	for _, jump := range jumps {
		if jump < minJumps {
			minJumps = jump
		}
	}
	return minJumps
}
