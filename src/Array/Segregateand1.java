package Array;

public class Segregateand1 {

	// Java code to segregate 0 and 1 

	static void segregate0and1(int arr[]) { 
			int zero = 0; 
			int one = arr.length - 1; 
			
			while (zero < one) { 
				if (arr[zero] == 1) { 
					// swap 
					arr[one] = arr[one]+ arr[zero]; 
					arr[zero] = arr[one]-arr[zero]; 
					arr[one] = arr[one]-arr[zero]; 
					one--; 
				} else { 
					zero++; 
				} 
			} 

		} 
		
	// Driver program 
	public static void main(String[] args) {	 
			
			int[] array = {0, 1, 0, 1, 1, 1}; 
			
			segregate0and1(array); 
			
			for(int a : array){ 
				System.out.print(a+" "); 
			} 
		} 
	} 



