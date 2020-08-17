package Array;

import java.util.HashMap;

public class SubArrayWithGivenSum {

	/*
	 * Returns true if the there is a subarray of arr[] with sum equal to 'sum'
	 * otherwise returns false. Also, prints the result
	 * 
	 */

	static int subArraySum1(int arr[], int n, int sum) {
		int s = 0;
		int curr_sum = arr[0];
		int i = 1;

		
		for(int j:arr) {
		while (curr_sum < sum) {
			curr_sum = curr_sum + arr[i];
			//System.out.println(curr_sum);
			i++;
		}
		// System.out.println(curr_sum);

		while (curr_sum > sum) {

			curr_sum = (curr_sum - arr[s]);
			//System.out.println(curr_sum);

			s++;
		}

		if (curr_sum == sum) {
			System.out.println("sum found from " + s + " to " + (i - 1) + " .");
			return 1;

		}
		}
		return 0;
		

	}

	static int subArraySum(int arr[], int n, int sum) {
		int curr_sum = arr[0], start = 0, i;

		// Pick a starting point
		for (i = 1; i <= n; i++) {
			// If curr_sum exceeds the sum, then remove the starting elements
			while (curr_sum > sum && start <= i - 1) {
				curr_sum = curr_sum - arr[start];
				start++;
			}

			// If curr_sum becomes equal to sum, then return true
			if (curr_sum == sum) {
				int p = i - 1;
				System.out.println("sum found from " + start + " to " + p + " .");
				return 1;
			}

			// Add this element to curr_sum
			if (i < n)
				curr_sum = curr_sum + arr[i];

		}

		System.out.println("No subarray found");
		return 0;
	}
	
	
	
	public static void subArraySumNegative(int[] arr, int n, int sum) { 
        //cur_sum to keep track of cummulative sum till that point 
        int cur_sum = 0; 
        int start = 0; 
        int end = -1; 
        HashMap<Integer, Integer> hashMap = new HashMap<>(); 
  
        for (int i = 0; i < n; i++) { 
            cur_sum = cur_sum + arr[i]; 
            //check whether cur_sum - sum = 0, if 0 it means 
            //the sub array is starting from index 0- so stop 
            if (cur_sum - sum == 0) { 
                start = 0; 
                end = i; 
                break; 
            } 
            //if hashMap already has the value, means we already  
            // have subarray with the sum - so stop 
            if (hashMap.containsKey(cur_sum - sum)) { 
                start = hashMap.get(cur_sum - sum) + 1; 
                end = i; 
                break; 
            } 
            //if value is not present then add to hashmap 
            hashMap.put(cur_sum, i); 
  
        } 
        // if end is -1 : means we have reached end without the sum 
        if (end == -1) { 
            System.out.println("No subarray with given sum exists"); 
        } else { 
            System.out.println("Sum found between indexes " 
                            + start + " to " + end); 
        } 
  
    } 

	public static void main(String[] args) {

		int arr[] = { 15, 2, -4, 8, 9, 5, 10, 23 };
		int n = arr.length;
		int sum = 13;
		//subArraySum(arr, n, sum);
		//subArraySum1(arr, n, sum);
		subArraySumNegative(arr,n,sum);
	}
}
