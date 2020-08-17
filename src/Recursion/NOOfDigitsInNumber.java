package Recursion;

public class NOOfDigitsInNumber {
	
	
	//Methodn2: Covert the no in string and count

	public static int fun(int n) {

		if (n <= 0) {
			return 0;
		}
		
		return 1 + fun(n / 10);

	}

	public static void main(String[] args) {

		int num = 26783;
		int k = fun(num);
		System.out.println(k);

	}

}
