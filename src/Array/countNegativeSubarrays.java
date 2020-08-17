package Array;

public class countNegativeSubarrays {

	static void countNagativeSubarray(int arr[], int len) {
		int count = 0;

		for (int i = 1; i < len; i++) {
			int sum = 0;

			for (int j = i -1; j < arr.length; j++) {
				if (arr[i] + arr[j] < 0) {
					System.out.println("Negative sum found between "+arr[i]+" "+arr[j]);
					

					count++;
				}

			}

		}
		System.out.println("Total negative subarrays are : "+ count);

	}

	public static void main(String[] args) {
		int arr[] = { 4, -13,10,-21};
		// int arr[] = { 1, 2, 3, 4, 5, 5 };
		int len = arr.length;

		countNagativeSubarray(arr, len);

	}

}
