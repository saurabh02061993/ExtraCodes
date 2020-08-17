package Array;

public class LargestSumContiguousArray {

	// Java program to print largest contiguous
	// array sum

	static void maxSubArraySum(int a[], int size) {
		int max_so_far = Integer.MIN_VALUE, curr_max = 0, start = 0, end = 0, s = 0;

		for (int i = 0; i < size; i++) {
			curr_max += a[i];
			if (curr_max < 0) {
				curr_max = 0;
				s = i + 1;
			}

			if (max_so_far < curr_max) {
				max_so_far = curr_max;
				start = s;
				end = i;
			}

		}
		System.out.println("Maximum contiguous sum is " + max_so_far);
		System.out.println("Starting index " + start);
		System.out.println("Ending index " + end);

	}
	
	
	
	
	
	

	public static void main(String[] args) {
		int a[] = { 3,5,-15,7,5,-3,12,-9 };
		//int a[] = {1,-1,7,2};
		
		
		int n = a.length;
		maxSubArraySum(a, n);
	}
}
