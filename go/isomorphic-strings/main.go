package main

func isIsomorphic(s string, t string) bool {
	mappedValues := make([]byte, 0, len(s))
	m := make(map[byte]byte)

	for i := 0; i < len(s); i++ {
		v, present := m[s[i]]

		if present {
			if v != t[i] {
				return false
			}
		} else {
			if alreadyMapped(t[i], mappedValues) {
				return false
			}

			m[s[i]] = t[i]

			mappedValues = append(mappedValues, t[i])
		}
	}

	return true
}

func alreadyMapped(v byte, values []byte) bool {
	for i := 0; i < len(values); i++ {
		if values[i] == v {
			return true
		}
	}

	return false
}
