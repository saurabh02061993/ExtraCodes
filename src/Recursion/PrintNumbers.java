package Recursion;

//Print numbers using recursion from 1 to n

public class PrintNumbers {

	public static void fun(int n, int i) {

		if (n <= 0) {

			return;
		}

		System.out.print(i + " ");
		
		fun(n - 1, i+1);
		

	}

	public static void fun2(int n) {

		if (n <= 0) {
			return;
		}
		
		System.out.print(n + " ");
		fun2(n - 1);

	}

	public static void main(String[] args) {
		int i = 1;
		System.out.println("Printing numbers from 1 to n");
		fun(20, i = 1);
		System.out.println();
		System.out.println("Printing numbers from n to 1");
		fun2(20);

	}

}
