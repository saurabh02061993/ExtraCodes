package Basic;

import java.util.*;

public class findIntersectionOftwoArrays {

	static void findIntersectionOftwoArrays(int arr1[], int arr2[]) {

		Set<Integer> s1 = new TreeSet<Integer>();
		for (int k : arr1) {

			s1.add(k);

		}
		for (int l : arr2) {

			if (s1.add(l) == false) {
				System.out.println(l);

			}
		}

	}

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 4, 5, 6, 7 };
		findIntersectionOftwoArrays(arr1, arr2);

	}

}
