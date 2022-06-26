package main

func maxScore(cardPoints []int, k int) int {
	windowSize := len(cardPoints) - k
	sums := make([]int, 0, len(cardPoints))

	if k == len(cardPoints) {
		return sumArray(cardPoints)
	}

	for i := 0; i+windowSize-1 < len(cardPoints); i++ {
		l := sumArray(cardPoints[:i])
		r := sumArray(cardPoints[i+windowSize:])

		sums = append(sums, l+r)
	}

	return maxInArray(sums)
}

func sumArray(a []int) int {
	sum := 0
	for i := 0; i < len(a); i++ {
		sum += a[i]
	}
	return sum
}

func maxInArray(a []int) int {
	max := a[0]
	for i := 1; i < len(a); i++ {
		if a[i] > max {
			max = a[i]
		}
	}
	return max
}
