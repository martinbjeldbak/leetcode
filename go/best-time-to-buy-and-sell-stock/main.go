// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
package besttimetobuyandsellstock

import "math"

func maxProfit(prices []int) int {
	maximumProfit := 0
	minimumProfit := math.MaxInt

	for i := 0; i < len(prices); i++ {
		if prices[i] < minimumProfit {
			minimumProfit = prices[i]
		} else if prices[i] > minimumProfit {
			maximumProfit = int(math.Max(float64(prices[i])-float64(minimumProfit), float64(maximumProfit)))
		}
	}
	return maximumProfit
}
