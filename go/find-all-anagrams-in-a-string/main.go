package findallanagramsinastring

import "fmt"

func findAnagrams(s string, p string) (result []int) {
	result = make([]int, 0, len(s))

	fmt.Printf("Reviewing %s\n", s)

	for i := 0; i < len(s); i++ {
		fmt.Printf("  i = %v: %v\n", i, string(s[i]))
		contains := true

		for j := 0; j < len(p); j++ {
			if i+j >= len(s) {
				fmt.Printf("%v+%v larger than %v\n", i, j, len(p))
				contains = false
				break
			}

			if !containsChar(p, rune(s[i+j])) {
				fmt.Printf("    breaking\n")
				contains = false
				break
			} else {
				fmt.Printf("    p %v contains %v (index %v+%v=%v)\n", p, string(s[i+j]), i, j, i+j)
			}
		}
		if contains {
			result = append(result, i)
		}
	}

	return result
}

func containsChar(p string, s rune) bool {
	for _, v := range p {
		if v == s {
			return true
		}
	}
	return false
}
