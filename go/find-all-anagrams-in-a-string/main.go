package findallanagramsinastring

import (
	"reflect"
)

func findAnagrams(s string, p string) (result []int) {
	result = make([]int, 0, len(s))
	freqP := make(map[rune]int)
	freqS := make(map[rune]int)

	for _, v := range p {
		freqP[v]++
	}

	// fmt.Printf("Reviewing %s\n", s)

	for i := 0; i < len(s); i++ {

		freqS = map[rune]int{}

		for j := 0; j < len(p); j++ {
			if i+j >= len(s) {
				break
			}
			freqS[rune(s[i+j])]++
		}

		if reflect.DeepEqual(freqP, freqS) {
			result = append(result, i)
		}
	}

	return result
}
