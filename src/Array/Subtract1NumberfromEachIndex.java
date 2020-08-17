package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Given an array with numbers 1-5, how would you subtract one number from each index?  

//Given an array with numbers 1-5, how would you subtract one number from every EVEN number in each index?  

public class Subtract1NumberfromEachIndex {
			
	

	
	
	
	
	public static void main(String[] args) {
		
		
		
		
		Integer arr[]= {12,14,13,45,8};
		Arrays.asList(arr).stream().filter(i->i%2==0).map(s->s-1).forEach(System.out::println);
		
		
		
		
		//Arrays.asList(arr).stream().filter(i->i%2==0).map(s->s+1).forEach(System.out::println);
		//Arrays.asList(arr).stream().forEach(System.out::println);
		//Arrays.asList(arr).stream().map(i->i+3).forEach(System.out::println);
		
	}

}
