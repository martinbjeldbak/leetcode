package minimummovestoequalarrayelementsii

import (
	"math"
	"sort"
)

func minMoves2(nums []int) int {
	sort.Ints(nums)
	median := nums[len(nums)/2]

	numMoves := 0
	for i := 0; i < len(nums); i++ {
		numMoves += int(math.Abs(float64(nums[i] - median)))
	}

	return numMoves
}
