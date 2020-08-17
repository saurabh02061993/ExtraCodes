package Recursion;

public class SumOfthedigitsofthegivenNumber {

	public static int fun(int n) {

		if (n <= 0) {
			return 0;
		}
		

		return fun(n / 10) + n % 10;
		
		

	}

	public static void main(String[] args) {

		int num = 2345;
		int k = fun(num);
		System.out.println(k);

	}

}
