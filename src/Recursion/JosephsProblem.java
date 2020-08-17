package Recursion;

public class JosephsProblem {
	// Given n person in a circle and every k th person is killed find the surviver.

	static int fun(int n, int k) {
		if (n == 1) {

			return n;

		}

		return (fun(n - 1, k) + k - 1) % n + 1;

	}

	public static void main(String[] args) {
		System.out.println(fun(7, 3));

	}

}
