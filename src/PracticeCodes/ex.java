package PracticeCodes;

public class ex {

	private static String rev(String string) {

		String s = " ";

		for (int i = string.length() - 1; i >= 0; i--) {
			s = s + string.charAt(i);

		}

		return s + "  ";

	}

	public static void main(String[] args) {

		String s = "i love java and C++ ";

		String c[] = s.split(" ");
		String complete_string = "";

		for (int i = c.length - 1; i >= 0; i--) {

			if (i % 2 == 0) {
				String temp;
				temp = c[c.length - 1];
				c[c.length - 1] = c[i];
				c[i] = temp;

				String odd_token = c[c.length - 1];
				complete_string = complete_string + odd_token;

			}
			if ((i) % 2 == 1) {

				String even_token = rev(c[i]);

				complete_string = complete_string + even_token;
			}

		}
		System.out.println(complete_string);
	}

}
