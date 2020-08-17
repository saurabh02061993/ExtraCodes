package Array;

import java.io.*;

public class RemovingDuplicateElementsInOneSpaceandNTime {

	static void printDuplicates(int arr[], int n) {
		int i;

		int flag = 0;

		for (i = 0; i < n; i++) {

			if (arr[arr[i] % n] >= n) {

				if (arr[arr[i] % n] < 2 * n) {
					System.out.print(arr[i] % n + " ");
					flag = 1;
				}
			}

			arr[arr[i] % n] += n;
		}

		if (!(flag > 0))
			System.out.println("-1");
	}

	public static void main(String[] args) {
		int arr[] = { 1, 6, 5, 8, 8, 3, 1, 3, 6, 6 };

		int arr_size = arr.length;
		printDuplicates(arr, arr_size);
	}
}
