package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UnionInsortedwithoutDuplicate {

	static void UnionArray(int a[], int b[]) {

		int m = a.length;
		int n = b.length;
		Set<Integer> s = new TreeSet<Integer>();

		for (int k : a) {
			s.add(k);
		}
		for (int z : b) {
			s.add(z);
		}

		System.out.println(s);

	}

	// System.out.println(Arrays.toString(result));

	public static void main(String args[]) {
		int arr1[] = { 1, 1, 1, 2, 3 };
		int arr2[] = { 4, 5, 5, 5, 7 };

		UnionArray(arr1, arr2);
	}

}
