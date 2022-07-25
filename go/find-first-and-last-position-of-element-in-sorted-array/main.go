// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array

package findfirstandlastpositionofelementinsortedarray

func searchRange(nums []int, target int) []int {
	startingPos := -1
	endingPos := -1

	for i, v := range nums {
		if v == target && startingPos == -1 {
			startingPos = i
		}

		if v == target {
			endingPos = i
		}

	}

	return []int{startingPos, endingPos}
}
