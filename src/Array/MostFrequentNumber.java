package Array;

import java.util.Arrays;

public class MostFrequentNumber {
	static void mostFrequentNumber(int arr[], int n) {
		int size = -1;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > size) {
				size = arr[j];
			}
		}

		int COUNT[] = new int[size + 1];
		// int max1[] = new int[6];

		for (int i = 0; i < n; i++) {
			COUNT[arr[i]]++;

		}

		System.out.println(Arrays.toString(COUNT));
		int max = 0;
		for (int i = 0; i < COUNT.length; i++) {
			if (COUNT[i] > max) {
				max = COUNT[i];
			}

		}

		for (int i = 0; i < COUNT.length; i++) {
			if (COUNT[i] == max) {
				System.out.println(i + " appeared most frequent time");
			}

		}

	}

	public static void main(String[] args) {
		int arr[] = {};
		int n = arr.length;
		mostFrequentNumber(arr, n);

	}

}
