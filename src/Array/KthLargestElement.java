package Array;

import java.util.PriorityQueue;

public class KthLargestElement {
	
	
	
	public static int findKthLargestUsingPriorityQueue(int[] nums, int k) {
        int p = 0;
        int numElements = nums.length;
        // create priority queue where all the elements of nums will be stored
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        // place all the elements of the array to this priority queue
        for (int n : nums) {
            pq.add(n);
        }
      System.out.println(pq);
        // extract the kth largest element
        while (numElements - k + 1 > 0) {
            p = pq.poll();
            System.out.println("polled  "+p);
            k++;
        }

        return p;
    }

	

	public static void main(String[] args) {
		
		int[] numbers ={2, 3, 5, 4, 1, 12, 11, 13, 16, 7};
        System.out.println(findKthLargestUsingPriorityQueue(numbers, 5));
       // System.out.println(findKthLargestUsingPriorityQueue(numbers, 1));
		

	}

}
