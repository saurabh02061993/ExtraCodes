package Basic;

public class abcd {
	
	// Convert char array to String in Java
	
		public static void main(String[] args)
		
		{
			
			
			int j=0;
			String str="saurabh";
			char[] chars = str.toCharArray();
			char arr[]=new char[chars.length];
			for(char a1:chars) {
			int k= a1;
			//System.out.print(k+" ");
			int k1=k+3;
			arr[j++]= (char) k1;
			}
			String s= new String(arr);
			System.out.println(s);
			

			
			
		}


	

}
