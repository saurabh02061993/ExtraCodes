package Basic;

import java.util.HashMap;
import java.util.Map;

public class subarraysum {

	public static void main(String[] args) {

		int arr[] = { 5, 7, 8, 3, -1, 5, 1 };
		int n = arr.length;

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int start = 0, end = -1, curr_sum = 0, sum = 6;
		int i=0;
		for ( i = 0; i < n; i++) {

			curr_sum = curr_sum + arr[i];
			if (curr_sum - sum == 0) {

				start = 0;
				end = i;
				break;
			}
			if (hm.containsKey(curr_sum - sum)) {
				start = hm.get(curr_sum-sum)+1;
				end = i;
				break;

			}
			hm.put(curr_sum, i);

		}
		
		if(end==-1) {
			System.out.println("There is no subarray found");
		}
		else {
		System.out.println("sum found at index "+start+" and "+ i+" ");
		}
	}

}
