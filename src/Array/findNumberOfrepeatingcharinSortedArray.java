package Array;

public class findNumberOfrepeatingcharinSortedArray {

	static int findLeftMostOccurenceIndex(int arr[], int l, int r, int x) {

		if (l > r) {
			return -1;
		}
		int mid = (l + r) / 2;
		if (x == arr[mid] && (arr[mid] == 0 || arr[mid - 1] != x)) {
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
		if (x == arr[mid] && (arr[mid] == (r - 1) || arr[mid + 1] != x)) {
			return mid;

		} else if (x < arr[mid]) {
			return findRightMostOccurenceIndex(arr, l, mid - 1, x);

		} else {

			return findRightMostOccurenceIndex(arr, mid + 1, r, x);
		}

	}

	public static void main(String[] args) {

		int arr[] = { 2,2,2,2, 3, 4, 5, 6, 6, 6, 66,6,6, 7 };
		int n = arr.length;
		int x = 2;
		int l = 0;
		int k = findLeftMostOccurenceIndex(arr, l, n, x);
		int p = findRightMostOccurenceIndex(arr, l, n, x);

		System.out.println("The left most index of the " + x + " is " + k);
		System.out.println("The left most index of the " + x + " is " + p);
		int occurance = (p - k) + 1;

		System.out.println("The occurance of the element " + x + " is " + occurance);

	}

}
