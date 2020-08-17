package Array;

public class PrimeNumberFromGivenArray {

	static int fun(int n) {
		// System.out.println("Number is "+n);

		for (int i = 2; i < Math.sqrt(n); i++)
			if (n % i == 0)
				return -1;
		return n;

	}

	public static void main(String[] args) {
		int arr[] = { 2, 10, 12, 34, 17, 3, 29, 11, 45, 13 };
		// int k=0;
		for (int i = 0; i < (arr.length); i++) {
			int n = arr[i];

			int p = fun(n);
			if (p > -1) {
				System.out.println(p + " is prime");
			}
		}

	}

}
