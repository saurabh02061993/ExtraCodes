package Array;

public class RotateAnarrayAtGivenIndex {

	static void LeftRotateArray(int arr[], int index, int len) {
		int index1 = index;
		int extraArray[] = new int[len];
		int end1 = len - index;
		// System.out.println(end);
		int i;
		for (i = 0; i < end1; i++) {
			extraArray[i] = arr[index++];
		}

		for (int j = 0; j < index1; j++) {
			// System.out.println(j);

			extraArray[i++] = arr[j];

		}

		for (int l : extraArray) {
			System.out.print(l + " ");
		}

	}

	// Method :2 o(n) and o(1) space

	static void leftRotate(int arr[], int n, int k) {

		int mod = k % n;

		for (int i = 0; i < n; i++)
			System.out.print(arr[(i + mod) % n] + " ");

		System.out.println();
	}

	static void RightRotate(int arr[], int n, int k) {

		int mod = k % n;
		// System.out.println(k);

		for (int i = 0; i < n; i++)
			System.out.print(arr[(i + mod) % n] + " ");

		System.out.println();
	}

	public static void main(String[] args) {
		{
			RotateAnarrayAtGivenIndex rotate = new RotateAnarrayAtGivenIndex();
			int arr[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
			int n = arr.length;

			rotate.RightRotate(arr, n, 2);

			rotate.leftRotate(arr, n, 2); /* rotating array taking less time and memory */
			// rotate.LeftRotateArray(arr, 5, n); /* Frequent Traversal increasing time and
			// memo */

		}

	}

}
