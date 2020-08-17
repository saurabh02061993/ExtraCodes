package Sorting;

import java.util.Arrays;

public class BubbleSort {

	// An optimized version of Bubble Sort
	// inplace and stable sorted algorithm
	// On(2)

	static void bubbleSort(int arr[], int n) {

		int i, j, temp;
		boolean swapped;
		for (i = 0; i < n - 1; i++) {
			swapped = false;
			for (j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			if (swapped == false) {

				break;
			}

		}

		System.out.println(Arrays.toString(arr));
	}

	// Driver program
	public static void main(String args[]) {
		int arr[] = { 5, -3, 0, -18, 1, 2, 5, -19, 0 };
		int n = arr.length;
		bubbleSort(arr, n);

	}
}
