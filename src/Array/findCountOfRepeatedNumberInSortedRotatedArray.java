package Array;

public class findCountOfRepeatedNumberInSortedRotatedArray {

	// method-1

	static int findLeftMostOccurenceIndex(int arr[], int l, int r, int x) {

		if (l > r) {
			return -1;
		}
		int mid = (l + r) / 2;
		if (mid == 0 || (x != arr[mid - 1]) && arr[mid] == x) {
			return mid;

		} else if (x <= arr[mid]) {
			return findLeftMostOccurenceIndex(arr, l, mid - 1, x);

		} else {

			return findLeftMostOccurenceIndex(arr, mid + 1, r, x);
		}

	}

	static int findRightMostOccurenceIndex(int arr[], int l, int r, int x) {

		if (l > r) {
			return -1;
		}
		int mid = (l + r) / 2;
		if ((mid == arr.length - 1 || x < arr[mid + 1]) && arr[mid] == x) {
			return mid;

		} else if (x < arr[mid]) {
			return findRightMostOccurenceIndex(arr, l, mid - 1, x);

		} else {

			return findRightMostOccurenceIndex(arr, mid + 1, r, x);
		}

	}

	static int findFirstIndexOfNumber(int arr[], int low, int high, int key) {

		while (low <= high) {

			int mid = low + (high - low) / 2;
			if (arr[mid] == key && (mid == low || arr[mid - 1] != key)) {
				return mid;
			}

			if (key > arr[mid]) {
				low = mid + 1;
				// System.out.println("printing" +arr[low]);
			} else {
				// System.out.println("here-1");
				high = mid - 1;
			}

		}

		return -1;

	}

	static int findlastIndexOfNumber(int arr[], int low, int high, int key) {
//{ 1, 2, 2, 3, 3, 3, 3 };
		while (low < high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == key && (mid == high || arr[mid + 1] != key)) {
				return mid;

			}

			if (key >= arr[mid]) {
				low = mid + 1;
				// System.out.println("printing" +arr[low]);
			} else {
				// System.out.println("here-1");
				high = mid - 1;
			}

		}

		return -1;

		// return -1;

	}

	static int findCountInSortedRoated(int arr[], int low, int high, int key) {

		/*
		 * int firstIndex = findFirstIndexOfNumber(arr, low, high, key);
		 * System.out.println(firstIndex); int lastIndex = findlastIndexOfNumber(arr,
		 * low, high, key); System.out.println(lastIndex); int count = lastIndex -
		 * firstIndex;
		 */

		// method -1
		int k = findLeftMostOccurenceIndex(arr, low, high, key);
		int p = findRightMostOccurenceIndex(arr, low, high, key);

		System.out.println("The left most index of the " + key + " is " + k);
		System.out.println("The left most index of the " + key + " is " + p);
		int occurance = (p - k) + 1;

		System.out.println("The occurance of the element " + key + " is " + occurance);

		return occurance;
	}

	public static void main(String[] args) {
		// int arr[] = { 11, 11, 11, 12, 23, 45 };
		int arr[] = { 1, 2, 2, 2, 2, 2, 2, 6, 6, 6 };
		int low = 0;
		int high = arr.length - 1;
		int key = 6;
		int k = findCountInSortedRoated(arr, low, high, key);
		System.out.println(k + 1);

	}

}
