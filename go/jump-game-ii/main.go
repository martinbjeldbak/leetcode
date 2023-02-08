package jumpgameii

import "fmt"

func jump(nums []int) (result int) {
	fmt.Printf("Got nums %v\n", nums)
	minJumpStore := make(map[int]int)
	result = jumpRec(nums, 0, 0, minJumpStore)

	fmt.Printf("Jumpstore %v\n", minJumpStore)

	return result
}

func jumpRec(nums []int, start int, numJumps int, minJumpStore map[int]int) int {
	// If we already have computed, return it
	minJ, exists := minJumpStore[start]
	if exists {
		return minJ
	}

	if start >= len(nums)-1 {
		return numJumps
	}
	fmt.Printf("  start: %v, value: %v, numJumps: %v\n", start, nums[start], numJumps)

	maxJumps := nums[start]

	jumps := make([]int, 0, maxJumps)

	for i := 1; i <= maxJumps; i++ {
		minimumJumps := jumpRec(nums, start+i, numJumps+1, minJumpStore)

		jumps = append(jumps, minimumJumps)
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
