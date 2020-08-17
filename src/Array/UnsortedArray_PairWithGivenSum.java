package Array;

import java.util.HashMap;
import java.util.Map;

public class UnsortedArray_PairWithGivenSum {

	// Method 1: Quadratic time O(n*n)
	static void PairWithGivenSum_1(int arr[], int len, int target) {
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println("pair found at " + arr[i] + " and " + arr[j]);
				}
			}
		}

	}

	// Method-2: Liner time
	static void PairWithGivenSum_2(int arr[], int len, int target) {

		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();

		for (int i = 0; i < len; i++) {
			if (mp.containsKey(target - arr[i])) {
				int index = mp.get(target - arr[i]);
				System.out.println("pair found at " + arr[index] + " and " + arr[i]);

			}

			mp.put(arr[i], i);
		}

	}

	public static void main(String[] args) {

		int arr[] = { 1, 4, 8, 2, 7,7, 6 };
		int len = arr.length;
		int target = 14;
		PairWithGivenSum_2(arr, len, target);

	}

}
