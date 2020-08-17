package Recursion;

public class NumberOf1onesInADigits {

	// Counts no of ones in a digit //time complexity is log10 n

	public static int fun(int n) {

		if (n <= 0) {
			return 0;
		}
		if (n % 10 == 1) {

			return 1 + fun(n / 10);
		}

		return fun(n / 10);

	}

	public static void main(String[] args) {

		int num = 261783;
		int k = fun(num);
		System.out.println(k);

	}
}
