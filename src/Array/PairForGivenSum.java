package Array;

import java.util.*;

public class PairForGivenSum {

	// Method-1

	static void FindingPairforgivenSum(int[] ipArray, int Sum) {
		int flag = 0;

		for (int i = 0; i < ipArray.length; i++) {
			for (int j = i + 1; j < ipArray.length; j++) {

				if (ipArray[i] + ipArray[j] == Sum) {

					System.out.println("pair for given sum found at indexes : " + i + " " + j);
					flag++;
					break;
				}

			}

		}
		if (flag == 0) {
			System.out.println("There is no sum found");
		}

	}

	// Method-2

	static void FindingPairforgivenSum1(int[] InputArray, int Sum) {

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int count = 0;

		for (int i = 0; i < InputArray.length; i++) {

			int val = Sum - InputArray[i];

			if (hm.containsKey(val)) {

				int n = hm.get(val);
				System.out.println("pair found at indexes " + n + " and " + i);

			}

			hm.put(InputArray[i], i);

		}

	}

	// method 3
	// return index array of the pair

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {

		int[] InputArray = { 1, 3 };
		int Sum = 4;
		FindingPairforgivenSum(InputArray, Sum);
		// FindingPairforgivenSum1(InputArray, Sum);
		// int k[]=twoSum(InputArray, Sum);
		// System.out.print("Method 3: Pair found at index ");
		/*
		 * for(int i:k) { System.out.print(i+" "); }
		 */

	}

}
