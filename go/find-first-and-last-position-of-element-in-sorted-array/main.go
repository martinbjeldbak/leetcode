// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array

package findfirstandlastpositionofelementinsortedarray

func searchRange(nums []int, target int) []int {
	startingPos := findLeft(nums, target)
	endingPos := findRight(nums, target)

	return []int{startingPos, endingPos}
}

// Binary search
func findLeft(nums []int, target int) int {
	result := -1
	l := 0             // start
	r := len(nums) - 1 // end

	for l <= r {
		m := (l + r) / 2

		if nums[m] < target {
			l = m + 1
		} else if nums[m] > target {
			r = m - 1
		} else {
			result = m
			r = m - 1
		}
	}

	return result
}

// Binary search
func findRight(nums []int, target int) int {
	result := -1
	l := 0             // start
	r := len(nums) - 1 // end

	// Binary search for starting pos value
	for l <= r {
		m := (l + r) / 2

		if nums[m] < target {
			l = m + 1
		} else if nums[m] > target {
			r = m - 1
		} else {
			result = m
			l = m + 1
		}
	}

	return result
}
