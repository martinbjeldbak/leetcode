package longestcommonprefix

// import "fmt"

func longestCommonPrefix(strs []string) string {
	if len(strs) == 0 {
		return ""
	}

	shortestString := strs[0]
	for _, s := range strs {
		if len(s) < len(shortestString) {
			shortestString = s
		}
	}
	longestPrefix := make([]rune, 0, len(shortestString))
	mismatch := false

	// fmt.Printf("Found shortest string %v\n", shortestString)
	for i, char := range shortestString {
		// fmt.Printf("Reviewing %v: %v\n", i, string(char))

		for _, s := range strs {
			// fmt.Printf("  comparing %v\n", s)
			if s == shortestString {
				continue
			}
			if rune(s[i]) != char {
				mismatch = true
				break
			}
		}
		if mismatch {
			break
		}

		// fmt.Printf("Appending %v\n", string(char))
		longestPrefix = append(longestPrefix, char)
	}

	return string(longestPrefix)
}
