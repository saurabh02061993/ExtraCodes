package Array;


public class Sample {

	static String reverse(String a) {
		String s = "";
		System.out.println(a.length());
		for (int i = (a.length() - 1); i >= 0; i--) {

			s = s + a.charAt(i);

		}

		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 7;

		// add 3 leading zeros in this number
		String padded = String.format("%02d", number);
		//String rightpadded = StringUtils.rightPad("7", 7, "#");
		System.out.println(padded);

	}
}
