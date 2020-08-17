package Array;

public class ProductExceptSelf {

	// Method-1
	static void productExceptSelf(long arr[], int len) {
		long totalProduct = 1;
		for (int i = 0; i < len; i++) {
			totalProduct *= arr[i];

		}
		for (int i = 0; i < len; i++) {
			arr[i] = totalProduct / arr[i];

		}
		for (long h : arr) {
			System.out.print(h + " ");
		}

	}

	// Method-2 (If without dividing operation)
	static void productExceptSelf_M2(int arr[], int len) {

		int a[] = new int[len];
		int b[] = new int[len];
		a[0] = 1;
		b[len - 1] = 1;

		for (int i = 1; i < len; i++) {
			a[i] = a[i - 1] * arr[i - 1];

		}

		for (int i = len - 2; i >= 0; i--) {
			b[i] = b[i + 1] * arr[i + 1];

		}
		for (int i = 0; i < len; i++) {
			int c = a[i] * b[i];
			System.out.print(c + " ");

		}

	}

	public static void main(String[] args) {

		int arr[] = { 1, 3, 8, 2, 5 };
		int len = arr.length;
		productExceptSelf_M2(arr, len);

	}

}
