package happynumber

import (
	"strconv"
	"strings"
)

// https://leetcode.com/problems/happy-number
func isHappy(n int) bool {
	seen := make(map[int]bool)

	for n != 1 {
		_, ok := seen[n]
		if ok { // we know this will keep looping
			return false
		}

		seen[n] = true
		sumOfDigits := 0

		digits := strings.Split(strconv.Itoa(n), "")

		for _, digitChar := range digits {
			digit, _ := strconv.Atoi(digitChar)
			sumOfDigits += digit * digit
		}

		n = sumOfDigits
	}

	return true
}
