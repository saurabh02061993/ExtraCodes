package Basic;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

public class palindrome {
	static String isPalindrome(String n) {

		String temp = "";

		for (int i = n.length() - 1; i >= 0; i--) {
			temp = temp + n.charAt(i);
		}

		return temp;

	}

	public static void main(String argc[]) throws IOException {
		System.out.println("Welcome! enter any number: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();

		if (isPalindrome(n).equalsIgnoreCase(n))
			System.out.println("SUCCESS! Yes, Entered Number is palindrome! ");
		else
			System.out.println("FAILURE! No, Not palindrome, Better luck next time! ");
	}

}
