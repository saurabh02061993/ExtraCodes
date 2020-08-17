package Basic;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class reverseSentence {

	public static void main(String[] args) {
		Integer a[] = { 1, 2, 6, 7, 8, 5 };
		Arrays.sort(a, Collections.reverseOrder());
		for (int k : a) {
			System.out.print(k + " ");

		}

	}

}
