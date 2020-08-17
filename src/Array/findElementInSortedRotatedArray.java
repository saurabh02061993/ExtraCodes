package Array;

public class findElementInSortedRotatedArray {

	static int findElementSortedRotatedArray(int arr[], int low, int high, int key) {

		while (low <= high) {

			int mid = low + (high - low) / 2;
			if (arr[mid] == key) {
				return mid;
			}
			if (arr[mid] >=arr[low]) {
				if (key >= arr[low] && key < arr[mid]) {
					high = mid - 1;

				} else {
					low = mid + 1;
				}

			} else {
				if (key >= arr[mid] && key < arr[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}

		}

		return -1;

	}

	public static void main(String[] args) {
		int arr[] = { 11,11,11, 12, 23, 45, 80, 2, 3, 4 };
		int low = 0;
		int high = arr.length - 1;
		int key = 12;
		int k=findElementSortedRotatedArray(arr, low, high, key);
		System.out.println(k);

	}

}
