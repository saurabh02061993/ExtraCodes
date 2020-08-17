package Array;

import java.util.ArrayList;

public class stockBuySell {

	public static int maxProfit(int[] price) {
		// store maximum profit gained
		int profit = 0;

		// initialize local minimum to first element's index
		int j = 0;

		// start from second element
		//int price[] = { 1, 4, 6, 8, 1, 3, 2, 3 };
		for (int i = 1; i < price.length; i++) {
			// update local minimum if decreasing sequence is found
			if (price[i - 1] > price[i]) {
				j = i;
				//System.out.println("here   "+price[i]);
			}

			// sell shares if current element is peak
			// i.e. (previous <= current > next)
			if (price[i - 1] <= price[i] && (i + 1 == price.length || price[i] > price[i + 1])) {
				profit += (price[i] - price[j]);
				System.out.printf("Buy on day %d and sell on day %d\n", j, i);
			}
		}

		return profit;
	}

	// different version of stock buy sell
	public static int maximizeProfit(int[] arrStockPrice) {
		if (arrStockPrice == null || arrStockPrice.length < 2) {
			return 0;
		}

		int lowestStockPriceTillNow = arrStockPrice[0];
		int maxProfitTillNow = 0;

		for (int i = 0; i < arrStockPrice.length; i++) {

			if (arrStockPrice[i] < lowestStockPriceTillNow) {
				lowestStockPriceTillNow = arrStockPrice[i];
			} else {
				if (arrStockPrice[i] - lowestStockPriceTillNow > maxProfitTillNow) {
					maxProfitTillNow = arrStockPrice[i] - lowestStockPriceTillNow;
				}
			}
		}
		return maxProfitTillNow;
	}

	public static void main(String args[]) {
		stockBuySell stock = new stockBuySell();

		// stock prices on consecutive days
		int price[] = { 1, 4, 6, 8, 1, 3, 2, 3 };
		int n = price.length;

		// fucntion call
		System.out.println(maxProfit(price));
		//System.out.println(maximizeProfit(price));

	}
}
