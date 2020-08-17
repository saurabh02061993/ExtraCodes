package Recursion;

public class SumOfAllElementsInArray {

	// first method
	public static int fun1(int arr[], int k) {

		if (k == 0) {
			return 0;
		}
		return arr[k - 1] + fun1(arr, k - 1);

	}

	// Second method

	public static int fun(int n[], int k, int i) {

		if (i == k) {
			return 0;
		}
		return n[i] + fun(n, k, i + 1);

	}

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40 };
		int n = arr.length;
		int i = 0;
		int k = fun(arr, n, i);

		int q = fun1(arr, n);
		System.out.println(k);

		System.out.println("output of method 2");
		System.out.println(q);

	}

}
