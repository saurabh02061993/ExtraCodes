package LeetCode;

public class mergeTwoSotedArray {

	// method by leetcode
	public static void merge1(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
		int j = n - 1;

		while (i >= 0 && j >= 0) {
			if (nums1[i] < nums2[j]) {
				nums1[i + j + 1] = nums2[j--];
			} else {
				nums1[i + j + 1] = nums1[i--];
			}
		}

		while (j >= 0) {
			nums1[i + j + 1] = nums2[j--];
		}
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = 0;
		int j = 0;
		int k = 0;
		int ex[] = new int[m + n];

		while (i < m && j < n) {

			if (nums1[i] > nums2[j]) {
				ex[k++] = nums2[j++];

				

			} else if (nums1[i] < nums2[j]) {
				ex[k++] = nums1[i++];

			

			} else {

				//System.out.println("here");
				ex[k++] = nums2[j];
			
				j++;
				

			}

		}
		if (i < m) {
			//System.out.println("i mein");
			System.arraycopy(nums1, i, ex, k, m - i);
		}
		if (j < n) {
			System.arraycopy(nums2, j, ex, k, n - j);

		}
		// int c[] = ex.clone();

		for (int h : ex) {
			System.out.print(h + " ");
		}

	}

	public static void main(String[] args) {
		int a[] = {2,3};
		int b[] = { 1,2,3,4,4};
		int o = a.length;
		int t = b.length;
		merge(a, o, b, t);
		//merge1(a, o, b, t);

	}

}
