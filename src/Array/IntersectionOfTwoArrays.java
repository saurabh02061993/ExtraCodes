package Array;

import java.util.*;
import java.util.TreeSet;

public class IntersectionOfTwoArrays {

	static void IntersectArray(int a[], int b[]) {

		 Set<Integer> set1 = new TreeSet<Integer>();
		    for(int i: a){
		        set1.add(i);
		    }
		    
		    
		 
		    Set<Integer> set2 = new TreeSet<Integer>();
		    for(int i: b){
		        if(set1.contains(i)){
		            set2.add(i);
		        }
		    }
		    System.out.println(set2);
		 
		  
	}
		

	public static void main(String[] args) {

		int arr1[] = { 1, 1, 2, 1, 2, 3,6,7,8,9,9,22,12,2};
		int arr2[] = { 4, 5, 0, 5, 7, 2, 7, 3,3 };

		IntersectArray(arr1, arr2);
		
		//Method 2: with duplicate
		
		List list1 = new ArrayList();
		for(int k:arr1) {
			list1.add(k);
		}
		
		List list2 = new ArrayList();
		for(int j:arr2) {
			list2.add(j);
		}
		
		list1.retainAll(list2);
		System.out.println(list1);
		
		
		
		
	}

}
