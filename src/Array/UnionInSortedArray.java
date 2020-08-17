package Array;

import java.util.Arrays;

public class UnionInSortedArray {

	// Java program to find union of two
	// sorted arrays (Handling Duplicates)

	static void UnionArray(int a[], int b[]) {
		// Taking max element present in either array
		int result[] = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				result[k++] = a[i];
				i++;
			} else {
				result[k++] = b[j];
				j++;
			}
		}
		System.arraycopy(a, i, result, k, (a.length - i));
		System.arraycopy(b, j, result, k, (b.length - j));

		System.out.println(Arrays.toString(result));

	}

	// Driver Code
	public static void main(String args[]) {
		int arr1[] = { 1, 2, 2, 2, 3 };
		int arr2[] = { 2, 3, 4, 5 };

		UnionArray(arr1, arr2);
	}
}
