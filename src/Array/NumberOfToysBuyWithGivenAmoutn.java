package Array;

import java.util.Arrays;

public class NumberOfToysBuyWithGivenAmoutn {

	// Java Program to maximize the
	// number of toys with K amount

	// This functions returns
	// the required number of toys
	static int maximum_toys(int cost[], int N, int total) {
		int count = 0, sum = 0;

		// sort the cost array
		Arrays.sort(cost);
		for (int i = 0; i < N; i++) {

			// Check if we can buy ith toy or not
			if (sum + cost[i] <= total) {
				sum = sum + cost[i];
				// Increment count
				count++;
			}
		}
		return count;
	}

	// Driver Code
	public static void main(String[] args) {
		int K = 50;
		int cost[] = { 1, 12, 5, 111, 200, 1000, 10, 9, 12, 15 };
		int N = cost.length;

		System.out.print(maximum_toys(cost, N, K));
	}
}
