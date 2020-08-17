package Basic;

import java.lang.*;

//Problem statement: if Try throws exception 

public class Exception {

	public static int fun() {

		try {
			System.out.println("in try");
			int s = 100 / 0;

			return 0;

			//System.out.println(s);

		} catch (ArithmeticException e) {
			// System.out.println("");
			// System.out.println(e.getMessage());
			System.out.println("dfghjk");
			try {
				System.out.println("gfhjgkjl;kljkfhdgsdfgjhklkjfhdsgdfjgkhl");
				int k=100/0;

			}

			catch (ArithmeticException e1) {
				System.out.println("caught---------------");

			}

			

			// return 10;

		}

		finally {

			// System.out.println('k'); // int l = 7 / 0;
			System.out.println("in finally");
			return 3;

		}

	}

	public static void main(String[] args) {

		int a = 10;
		int k = fun();
		System.out.println(k);

	}

}
