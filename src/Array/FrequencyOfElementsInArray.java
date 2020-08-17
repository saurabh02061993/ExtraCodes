package Array;

import java.util.*;

public class FrequencyOfElementsInArray {

	static void CountFrequency(int a[]) {
		int len = a.length;
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int k : a) {

			if (hm.containsKey(k)) {
				

				hm.put(k, hm.get(k) + 1);

			}

			else {
				hm.put(k, 1);
			}

		}

		for (Map.Entry mapElement : hm.entrySet()) {
			System.out.println(mapElement.getKey() + "--occurs-- " + mapElement.getValue() + " Times");

		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 6, 5, 6, 6, 6, 62, 1, 1, 2, 2, 2, 2, 9 };
		CountFrequency(arr);

	}

}
