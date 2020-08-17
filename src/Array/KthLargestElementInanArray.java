package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class KthLargestElementInanArray {

	
	//using Min heap
	public static int FindKthLargest(List<Integer> ints, int k) {

		PriorityQueue<Integer> pq = new PriorityQueue<>(ints.subList(0, k));
		System.out.println("Queue is after inserting K elements  " + pq);

		for (int i = k; i < ints.size(); i++) {
			// if current element is more than the root of the heap
			if (ints.get(i) > pq.peek()) {

				int h = pq.poll();
				System.out.println("polled " + h + "for i as " + ints.get(i));
				pq.add(ints.get(i));
			}
		}

		return pq.peek();
	}
	
	

	public static void main(String[] args) {

		// KthLargestElement()

		Integer arr[] = {45,11,23,46,12,34,56,1,90,43};
		// List<Integer> ints = Arrays.asList(7, 4, 6, 3, 9, 1);
		List<Integer> ints = new ArrayList<Integer>(Arrays.asList(arr));
		int k = 3;

		System.out.println("K'th largest element in the array is " + FindKthLargest(ints, k));
	}

}
