package Array;

public class IntersectionOfTwoSortedArrays {

	static void IntersectionOfSortedArray(int arr1[], int arr2[], int m, int n) {

		int i = 0, j = 0;
		while (i < m && j < n) {

			if (arr1[i] < arr2[j]) {
				i++;

			} else if (arr2[j] < arr1[i]) {
				j++;

			}

			else {
				System.out.print(arr1[i] + " ");
				i++;
				j++;

			}

		}

	}

	public static void main(String[] args) {

		int arr1[] = { 2, 3, 4, 5, 7,12 };
		int arr2[] = {2, 10,12,11,23,12,1,3 };
		int len1 = arr1.length;
		int len2 = arr2.length;

		IntersectionOfSortedArray(arr1, arr2, len1, len2);

	}

}
