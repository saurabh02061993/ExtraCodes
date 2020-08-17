package LeetCode;

import java.util.HashMap;

public class CountOfSubarryswithGivenSum {
	
	
	    public static  int subarraySum(int[] nums, int k) {
	        int count = 0, sum = 0;
	        HashMap < Integer, Integer > map = new HashMap < > ();
	        map.put(0, 1);
	        for (int i = 0; i < nums.length; i++) {
	            sum += nums[i];
	            if (map.containsKey(sum - k))
	                count += map.get(sum - k);
	            map.put(sum, map.getOrDefault(sum, 0) + 1);
	        }
	        return count;
	    }
	

	public static void main(String[] args) {
		int arr[]= {10,-20,2,4,5,78,12,-50,-5-5,19,-29};
		int k=-10;
		
		int count =subarraySum(arr, k);
		System.out.println("The possible max subarray with given sum is : "+count );
		

	}

}
