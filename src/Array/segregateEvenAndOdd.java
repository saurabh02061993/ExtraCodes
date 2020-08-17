package Array;

public class segregateEvenAndOdd {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };

		int n = arr.length;
		int i = 0, j = 0, k = n;
		while (i < n) {
			if (arr[i] % 2 != 0) {
				j = arr[i];
				arr[i] = arr[n - 1];
				arr[n - 1] = j;
				j--;
				i++;

			}

		}
		for(int l:arr) {
			System.out.print(l+" ");
		}

	}

}
