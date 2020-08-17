 package String;

import java.util.*;

public class NumberOfInsertionsToformApalindrome {

	// Method-1

	// Java program to find minimum number
	// of insertions to make a string
	// palindrome

	// Function will return number of
	// characters to be added
	static int minInsertion(String str) {
		// To store string length
		int n = str.length();

		// To store number of characters
		// occurring odd number of times
		int res = 0;

		// To store count of each
		// character
		int[] count = new int[26];

		// To store occurrence of each
		// character
		for (int i = 0; i < n; i++)
			count[str.charAt(i) - 'a']++;

		// To count characters with odd
		// occurrence
		for (int i = 0; i < 26; i++) {
			if (count[i] % 2 == 1)
				res++;
		}

		// As one character can be odd return
		// res - 1 but if string is already
		// palindrome return 0
		return (res == 0) ? 0 : res - 1;
	}

	public static void main(String[] args) {
		String str = "abcde";
		List<Character> list = new ArrayList();

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (list.contains(str.charAt(i))) {
				list.remove((Character) str.charAt(i));

			} else {
				list.add(str.charAt(i));
				count++;
			}

		}

		int k = list.size();
		System.out.println("Minimum insertion required to make Palindrome is " + (k - 1));

		System.out.print("method-2 output ");
		System.out.print(minInsertion(str));

	}

}
