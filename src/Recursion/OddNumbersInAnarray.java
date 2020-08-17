package Recursion;

public class OddNumbersInAnarray {

	public static void fun1(int arr[], int len) {

		if (len == 0) {
			return;
		}
		if (arr[len - 1] % 2 == 1) {

			System.out.println(arr[len - 1]);
			fun1(arr, len - 1);

		} else {
			fun1(arr, len - 1);

		}

	}

	// Second method

	public static void fun(int n[], int k, int i) {

		if (i == k) {
			return;
		}
		if (n[i] % 2 == 1) {

			System.out.println(n[i]);
			fun(n, k, i + 1);

		} else {
			fun(n, k, i + 1);
		}
	}

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 43, 13, 13, 29 };
		int n = arr.length;
		int i = 0;

		System.out.println("output of method 1");
		fun(arr, n, i);

		System.out.println("output of method 2");

		fun1(arr, n);

		

	}

}
