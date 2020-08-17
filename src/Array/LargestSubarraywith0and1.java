package Array;

import java.util.HashMap;

public class LargestSubarraywith0and1 {

	// Returns largest subarray with equal number of 0s and 1s

	static int maxLen(int arr[], int n) {

		HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

		int curr_sum = 0; // Initialize sum of elements
		int max_len = 0; // Initialize result
		int ending_index = -1;
		int start_index = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = (arr[i] == 0) ? -1 : 1;
		}

		for (int i = 0; i < n; i++) {

			curr_sum += arr[i];

			if (curr_sum == 0) {
				max_len = i + 1;
				ending_index = i;
			}

			if (hM.containsKey(curr_sum + n)) {
				if (max_len < i - hM.get(curr_sum + n)) {
					max_len = i - hM.get(curr_sum + n);
					ending_index = i;
				}
			} else // Else put this sum in hash table
				hM.put(curr_sum + n, i);
		}

		for (int i = 0; i < n; i++) {
			arr[i] = (arr[i] == -1) ? 0 : 1;
		}

		int end = ending_index - max_len + 1;
		System.out.println(end + " to " + ending_index);

		return max_len;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 0, 0, 1, 0, 1, 1 };
		int n = arr.length;

		maxLen(arr, n);
	}
}
