package Array;

//If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
//Note that you cannot sell a stock before you buy one.
//Example 1:
//Input: [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Not 7-1 = 6, as selling price needs to be larger than buying price.

public class stockBuySellInOneTraansaction {
	static void findProfit(int arr[], int len) {

		int j = 0;
		int profit = 0;
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > arr[j]) {
				int diff = arr[i] - arr[j];

				profit = Math.max(diff, profit);
			}
			if (arr[i] < arr[j]) {

				j = i;
			}

		}
		System.out.println(profit);

	}

	public static void main(String[] args) {
		int arr[] = { 7, 1, 5, 3, 6, 4, 5 };
		int len = arr.length;
		findProfit(arr, len);
	}

}
