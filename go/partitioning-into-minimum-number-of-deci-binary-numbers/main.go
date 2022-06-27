package main

import "strconv"

func minPartitions(n string) int {
	max, _ := strconv.Atoi(string(n[0]))

	for i := 1; i < len(n); i++ {
		iInt, _ := strconv.Atoi(string(n[i]))

		if iInt > max {
			max = iInt
		}

	}
	return max
}
