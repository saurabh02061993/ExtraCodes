package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class tripletWithGivenSum {

//Method 1

	static void triplrtsSum(int[] arr, int len, int sum) {

		List<Object> list = new ArrayList<Object>();

		for (int i = 0; i < len - 2; i++) {
			for (int j = i + 1; j < len - 1; j++) {
				for (int k = j + 1; k < len; k++) {

					if (arr[i] + arr[j] + arr[k] == sum) {

						list.add(arr[i]);

						list.add(arr[j]);

						list.add(arr[k]);
						list.add("|");

						// System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);

					}
				}

			}
		}

		System.out.println(list);

	}

	// Method-2

	static void triplrtsSum_M2(int[] arr, int len, int sum) {
		for (int i = 0; i < len - 2; i++) {
			for (int j = i + 1; j < len - 1; j++) {
				for (int k = j + 1; k < len; k++) {

					if (arr[i] + arr[j] + arr[k] == sum) {

						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
					}
				}

			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 2, 5, 4, 9, 7, 1, 5 };
		int len = arr.length;
		int sum = 14;
		triplrtsSum(arr, len, sum);
	}

}
