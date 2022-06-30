// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
package besttimetobuyandsellstock

func maxProfit(prices []int) int {
	maximumProfit := 0

	for i := 0; i < len(prices); i++ {
		boughtPrice := prices[i]

		for j := i; j < len(prices); j++ {
			sellPrice := prices[j]

			potentialProfit := sellPrice - boughtPrice

			if potentialProfit > maximumProfit {
				maximumProfit = potentialProfit
			}
		}

	}
	return maximumProfit
}
