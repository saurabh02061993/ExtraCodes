package Array;



 
public class MaximumOrMinimumSumSubarrayOfGivenKwindow {

	static int maxSumofGivenWindow(int a[], int k) {
		int n = a.length;
		int res = 0, curr_sum = 0;
		for (int i = 0; i < k; i++) {

			res = res + a[i];

		}
	
		curr_sum = res;
		for (int i = k; i < n; i++) {
			curr_sum = curr_sum + a[i] - a[i - k];
			res = Math.max(res, curr_sum);   //if it is asked to calculate the minimum sum then use Math.min

		}
	
		return res;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 6, 5, 8, 8, 3, 1, 3, 6, 6 };
		int sum = maxSumofGivenWindow(arr, 4);
		System.out.println("The maximum sum of the subarray of given window size is :" + sum);

	}

}
