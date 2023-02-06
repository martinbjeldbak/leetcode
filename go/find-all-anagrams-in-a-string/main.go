package findallanagramsinastring

import (
	"strings"
)

func findAnagrams(s string, p string) (result []int) {
	result = make([]int, 0, len(s))

	// fmt.Printf("Reviewing %s\n", s)

	for i := 0; i < len(s); i++ {
		// fmt.Printf("  i = %v: %v\n", i, string(s[i]))
		continuousMatch := true
		anagram := p

		for j := 0; j < len(p); j++ {
			if i+j >= len(s) {
				// fmt.Printf("%v+%v larger than %v\n", i, j, len(p))
				continuousMatch = false
				break
			}

			anagram, continuousMatch = containsChar(anagram, rune(s[i+j]))

			if !continuousMatch {
				// fmt.Printf("    breaking\n")
				continuousMatch = false
				break
			}

		}
		if continuousMatch {
			result = append(result, i)
		}
	}

	return result
}

func containsChar(p string, s rune) (string, bool) {
	for _, v := range p {
		if v == s {
			return strings.Replace(p, string(v), "", 1), true
		}
	}
	return p, false
}
