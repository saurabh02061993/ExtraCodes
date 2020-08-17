package PracticeCodes;
import java.util.Arrays;
import java.util.stream.Collectors;

public class reverseArray {

	public static void main(String[] args) {
		// reverse an array
		int arr[] = { 1, 2, 3, 4, 5 };
		int low = 0;
		int high = arr.length - 1;
		while (low < high) {
			int temp = arr[high];
			arr[high] = arr[low];
			arr[low] = temp;
			low++;
			high--;

		}
		for (int a : arr) {
			System.out.print(a);
		}

	}

}
