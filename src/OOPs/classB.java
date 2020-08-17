package OOPs;

class classB {
	
	
	
	public static int div(int a ,int b)
	{
		
		
		int res=0;
		try {
			res=a/b;
			
		}
		catch(ArithmeticException e) {
		res=9;
		System.out.println("isde ca"+res);
		return res;}
		
		finally {
			res=99;
			System.out.println("isndi fina"+res);
		}
		return res;
	
	}
	
	
	public static void main(String[] args) {
		
		
		int res=div(4,0);
		System.out.println("this is"+res);
		
		
	

}}
