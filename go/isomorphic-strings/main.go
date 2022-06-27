package main

func isIsomorphic(s string, t string) bool {
	m := make(map[byte]byte)
	mappedValues := make(map[byte]bool)

	for i := 0; i < len(s); i++ {
		v, present := m[s[i]]

		if present {
			if v != t[i] {
				return false
			}
		} else {
			_, p := mappedValues[t[i]]
			if p {
				return false
			}

			m[s[i]] = t[i]

			mappedValues[t[i]] = true
		}
	}

	return true
}
