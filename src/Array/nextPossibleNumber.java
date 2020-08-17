package Array;

import java.util.ArrayList;
import java.util.List;

public class nextPossibleNumber {

	static void nextNumberArrange(int arr[], int len) {
		int i = 0, j = 0;

		for (i = 0; i < len; i++) {
			int next = -1;

			for (j = i + 1; j < len; j++) {

				if (arr[j] > arr[i]) {
					next = arr[j];
					break;

				}

			}
			System.out.println(arr[i] + " -- " + next);

		}

		// System.out.println(list);

	}

	public static void main(String[] args) {
		int arr[] = { 10, 45, 23, 61, 5, 4, 1 };
		int len = arr.length;
		nextNumberArrange(arr, len);

	}
}
