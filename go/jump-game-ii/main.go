package jumpgameii

import (
	"math"
)

func jump(nums []int) (result int) {
	n := len(nums)
	curEnd := 0
	curFar := 0

	for i := 0; i < n-1; i++ {
		curFar = int(math.Max(float64(curFar), float64(i+nums[i])))

		if i == curEnd {
			result++
			curEnd = curFar
		}
	}
	return result
}
