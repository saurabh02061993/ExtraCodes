package Array;

import java.util.Arrays;

public class MergeTwoSortedArrays {
	
	
	
	

	public static void main(String[] args) {
		 int a[] = {10, 20, 30};
		 int b[]= {9, 14,14,11};
		 int res[]=new int[a.length+b.length]; 
		 System.arraycopy(a,0, res, 0, a.length); 
		 System.arraycopy(b,0,res,a.length, b.length);
		 Arrays.sort(res);
		 for(int i:res) {
			 System.out.print(i+" ");
		 }
	}}