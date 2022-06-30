package longestpalindrome

func longestPalindrome(s string) int {
	count := 0
	charCounts := make(map[string]int)

	for i := 0; i < len(s); i++ {
		charCounts[string(s[i])]++
	}

	for _, v := range charCounts {
		count += v / 2 * 2
	}

	// if we have a straggler we can place in middle
	if count < len(s) {
		count++
	}

	return count
}
