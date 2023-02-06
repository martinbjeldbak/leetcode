package permutationinstring

import "reflect"

func checkInclusion(s1 string, s2 string) bool {
	freqS1 := make(map[rune]int)
	freqS2 := make(map[rune]int)

	for _, v := range s1 {
		freqS1[v]++
	}

	for i := 0; i < len(s2); i++ {
		freqS2 = map[rune]int{}

		for j := 0; j < len(s1); j++ {
			if i+j >= len(s2) {
				break
			}
			freqS2[rune(s2[i+j])]++
		}

		if reflect.DeepEqual(freqS1, freqS2) {
			return true
		}
	}

	return false
}
