package Array;

public class segregate0Aand1 {
	// Method-1
	static void segregate(int arr[], int len) {

		int low = 0;
		int high = len - 1;
		while (low < high) {

			while (arr[low] == 0 && low < high) {
				low++;
			}
			while (arr[high] == 1 && low < high) {
				high--;
			}

			if (low < high) {
				arr[low] = 0;
				arr[high] = 1;
				low++;
				high--;

			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	// method 2
	static void segregate_M2(int arr[], int len) {

		int low = 0;
		int high = len - 1;
		while (low < high) {

			if (arr[low] == 1) {

				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				high--;

			}

			else {
				low++;
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	public static void main(String[] args) {
		int arr[] = { 2, 0, 2, 0, 0, 0, 2, 2, 0, 2 };
		int arr1[] = { 1, 0, 1, 0, 0, 0, 0, 1, 0, 1 };
		int len = arr.length;
		System.out.println("Method 1 output----");
		segregate(arr, len);
		System.out.println();

		System.out.println("Method 2 output----");
		segregate_M2(arr1, len);
	}

}
