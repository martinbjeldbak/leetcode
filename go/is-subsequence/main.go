package issubsequence

func isSubsequence(s string, t string) bool {
	sIndex := 0

	if s == "" {
		return true
	}

	for i := 0; i < len(t); i++ {
		if sIndex >= len(s) {
			break
		}

		if t[i] == s[sIndex] {
			sIndex++
		}
	}

	return sIndex == len(s)
}
