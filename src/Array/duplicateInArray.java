package Array;

import java.util.HashMap;
import java.util.Map;

public class duplicateInArray {

	static void findDuplicate(int arr[], int len) {
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		int flag = 0;
		for (int i = 0; i < len; i++) {

			if (mp.containsKey(arr[i])) {
				int count = mp.get(arr[i]) + 1;
				mp.put(arr[i], count);
				System.out.println(arr[i] + " occured " + count + " times");
				flag = 1;

			}

			mp.put(arr[i], 1);

		}
		if (flag != 1) {
			System.out.println("No duplicate found..");
		}

	}

	public static void main(String[] args) {

		// int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
		int arr[] = { 1, 2, 3, 4 };
		int len = arr.length;

		findDuplicate(arr, len);

	}

}
