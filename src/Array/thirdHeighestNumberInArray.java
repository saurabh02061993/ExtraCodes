package Array;

public class thirdHeighestNumberInArray {
	
	
	//// With duplicate
	static void thirdHighestNumberInArray(int arr[], int len) {

		int first = arr[0], second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];

			} else if (arr[i] > second) {
				third = second;
				second = arr[i];

			} else if (arr[i] > third) {
				third = arr[i];
			}

		}
		System.out.println("Third largest element is " + third);

	}

	// If do not want to consider duplicate
	static void thirdHighestNumberInArray_M2(int arr[], int len) {

		int first = arr[0], second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];

			} else if (arr[i] > second && arr[i] < first ) {
				third = second;
				second = arr[i];

			} else if (arr[i] > third && arr[i] < second) {
				third = arr[i];
			}

		}
		System.out.println("Second largest Element is "+second);
		System.out.println("Third largest element is " + third);

	}

	public static void main(String[] args) {
		 int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
		//int arr[] = { 1, 2, 3, 4, 5, 5 };
		int len = arr.length;

		thirdHighestNumberInArray_M2(arr, len);

	}

}
