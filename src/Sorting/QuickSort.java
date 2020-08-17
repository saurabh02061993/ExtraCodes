
package Sorting;

public class QuickSort {

	static int array[];
	static int length;

	public static void sort(int[] inputArr) {

		if (inputArr == null || inputArr.length == 0) {
			return;
		}
		array = inputArr;
		length = inputArr.length;
		quickSort(0, length - 1);
	}

	static void quickSort(int lowerIndex, int higherIndex) {

		int i = lowerIndex;
		int j = higherIndex;

		int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];

		while (i <= j) {

			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}

		if (lowerIndex < j)
			quickSort(lowerIndex, j);
		if (i < higherIndex)
			quickSort(i, higherIndex);
	}

	public static void main(String a[]) {

		int[] input = { 24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12 };
		sort(input);
		for (int i : input) {
			System.out.print(i);
			System.out.print(" ");
		}
	}
}
