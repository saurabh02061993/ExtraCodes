package Basic;

public class FindSecondlargest {

	static void findsecondLargest(int arr[], int flag) {
		
		int n = arr.length;
		if (n < 2) {
			System.out.println("ERROR: Array elements must be sufficient to proceed further");
			return;
		}

		int prev = 0, curr = 0;

		for (int i = 0; i < n; i++) {

			if (arr[i] > curr) {

				prev = curr;
				curr = arr[i];
			} else if (prev < arr[i] && prev != curr) {
				prev = arr[i];

			}

		}
		if (flag == 0) {
			System.out.println("largest is " + curr + " and second largest is " + prev);
		}
		if (flag == 1) {
			char a = (char) curr;
			char b = (char) prev;
			System.out.println("largest is " + a + " and second largest is " + b);
		}
	}

	public static void main(String[] args) {

		int arr[] = { 15, 18, 45, 98, 23, 12, 90 };
		int arr1[] = { 'a', 'x', 'g', 'j', 'p' };
		int flag = 0;
		System.out.println("***********First oytput***********\n");

		findsecondLargest(arr, flag);

		System.out.println("\n***********Second oytput***********\n");
		flag = 1;
		findsecondLargest(arr1, flag);
	}

}
