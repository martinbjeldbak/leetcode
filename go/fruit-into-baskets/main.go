package main

// import "fmt"

func basketSum(baskets map[int]int) (sum int) {
	for _, v := range baskets {
		sum += v
	}
	return sum
}

func totalFruit(fruits []int) int {
	// fmt.Printf("Reviewing %v\n", fruits)
	baskets := make(map[int]int)
	maxPickable := 0
	sum := 0

	for i := 0; i < len(fruits); i++ {
		fruitType := fruits[i]

		// fmt.Printf("  i:%v got fruit %v\n", i, fruitType)

		_, inBasket := baskets[fruitType]
		if !inBasket && len(baskets) == 2 {
			sum = basketSum(baskets)
			if sum > maxPickable {
				maxPickable = sum
			}

			prevType := fruits[i-1]
			// Count previous entries
			prevCount := 0
			for j := i - 1; j > 0; j-- {
				if fruits[j] != prevType {
					break
				}
				prevCount++
			}
			baskets[prevType] = prevCount
			for fruitType := range baskets {
				if fruitType != prevType {
					// fmt.Printf("  dropped basket %v\n", fruitType)
					delete(baskets, fruitType)
				}
			}
		}

		baskets[fruitType]++
		// fmt.Printf("  %v\n", baskets)
	}

	// Final check to see if bigger
	sum = basketSum(baskets)
	if sum > maxPickable {
		maxPickable = sum
	}

	return maxPickable
}
