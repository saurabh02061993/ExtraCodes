package Recursion;

public class AllSubsetOfInputs {
	
	// Print all subset of String

	public static void fun(String is, String os, int i) {
		
		if (i == is.length()) {
			//if(os !="") {
			System.out.print(os+" ");
			return;
			}			
		//}
		fun(is, os + is.charAt(i), i + 1);
		fun(is, os, i + 1);
		//fun(is, os + is.charAt(i), i + 1);
		
	}

	public static void main(String[] args) {
		String is0 = "ABC";
		String os = "";
		int k = 0;
		fun(is0, os, k);

	}

}
