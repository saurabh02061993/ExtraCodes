package String;

public class GivenTwoStringsareRotated {

	static boolean fun(String str1, String str2) {

		String concat = str1 + str1;
		System.out.println(concat);
		int val =concat.indexOf(str2);
		System.out.println(val);
		
		return val>=0 ? true:false;
		//second method : faster one (contains is faster)
		
		/*
		 * if (concat.contains(str2)) { return true; }
		 */

		

	}

	public static void main(String[] args) {

		String a = "ABCDE";
		String b = "CDEAB";
		boolean ans = fun(a, b);
		System.out.println("Rotaion of each other is : " + ans);
	}

}
