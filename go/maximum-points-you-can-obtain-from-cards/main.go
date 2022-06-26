package main

func maxScore(cardPoints []int, k int) int {
	return maxScoreRecursive(cardPoints, k, 0)
}

func maxScoreRecursive(cardPoints []int, k int, curPoints int) int {
	if k == 1 {
		takeBeginCard := curPoints + cardPoints[0]
		takeEndCard := curPoints + cardPoints[len(cardPoints)-1]

		if takeBeginCard > takeEndCard {
			return takeBeginCard
		} else {
			return takeEndCard
		}
	} else {
		takeBeginScore := maxScoreRecursive(cardPoints[1:], k-1, curPoints+cardPoints[0])
		takeEndScore := maxScoreRecursive(cardPoints[:len(cardPoints)-1], k-1, curPoints+cardPoints[len(cardPoints)-1])

		if takeBeginScore > takeEndScore {
			return takeBeginScore
		} else {
			return takeEndScore
		}
	}
}
