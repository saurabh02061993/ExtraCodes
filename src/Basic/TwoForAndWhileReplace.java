package Basic;

import java.util.Arrays;

public class TwoForAndWhileReplace {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 2, 3, 4, 5 };

		int[] c = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {

				c[k++] = a[i++];

			} else {
				c[k++] = b[j++];

			}

		}
		System.arraycopy(a, i, c, k, (a.length - i));
		System.arraycopy(b, j, c, k, (b.length - j));
		System.out.println(Arrays.toString(c));

	}

}
