package PracticeCodes;

public class RotateAnarry {

	static int[] reversearr(int arr[], int s, int e) {

		int low = s;
		int high = e;
		while (low < high) {
			int temp = arr[high];
			arr[high] = arr[low];
			arr[low] = temp;
			low++;
			high--;

		}

		return arr;

	}

	public static void main(String[] args) {
		int k[] = { 1, 2, 3, 4, 5 };

		int d = 3;
		int n = k.length - 1;
		reversearr(k, 0, d - 1);

		reversearr(k, d, n);

		reversearr(k, 0, n);

		for (int a : k) {
			System.out.print(a);
		}
	}

}
