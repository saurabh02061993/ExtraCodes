package Array;

public class MergeTwoSortedArraysUsingLoops {

	private static void main(String[] args) {
		int arr1[] = { 1, 3, 5, 8 };
		int arr2[] = { 2, 4, 5, 9,10,11,11 };
		int len1 = arr1.length;
		int len2 = arr2.length;

		int result[] = new int[len1 + len2];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < len1 && j < len2) {

			if (arr1[i] < arr2[j]) {
				result[k++] = arr1[i++];
			}

			else {
				result[k++] = arr2[j++];
			}

		}
		//Method: 1
		System.arraycopy(arr1, i, result, k, len1-i);
		System.arraycopy(arr2, j, result, k, len2-j);
		

			
		  
		 

		for (int p : result) {
			System.out.print(p + " ");
		}

	}

}
