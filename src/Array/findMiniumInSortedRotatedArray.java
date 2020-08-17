package Array;

public class findMiniumInSortedRotatedArray {

	static int findMinOnSortedRotated(int arr[], int low, int high) {

		while (low <= high) {

			int mid = low + (high - low) / 2;
			if (arr[mid - 1] > arr[mid]) {

				return arr[mid];
			}
			if (arr[mid + 1] < arr[mid]) {
				return arr[mid + 1];
			}
			if (arr[low] < arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}
		return -1;
	}

	public static void main(String[] args) {

		int arr[] = { 12, 13, 14, 15, 16, 0 };
		int high = arr.length - 1;
		int low = 0;
		int p = findMinOnSortedRotated(arr, low, high);
		System.out.println("min is : " + p);

	}

}
