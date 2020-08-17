package Basic;

import java.math.BigInteger;
import java.util.*;

public class ConvertNumberInWords

{
	public void pw(int n, String ch) {
		// System.out.println("reached");
		String one[] = {

				" ", " one", " two", " three", " four", " five", " six", " seven", " eight", " Nine", " ten", " eleven",
				" twelve", " thirteen", " fourteen", "fifteen", " sixteen", " seventeen", " eighteen", " nineteen" };
		String ten[] = { " ", " ", " twenty", " thirty", " forty", " fifty", " sixty", "seventy", " eighty",
				" ninety" };
		if (n > 19) {
			System.out.print(ten[n / 10] + " " + one[n % 10]);
		} else {
			System.out.print(one[n]);
		}
		if (n > 0)
			System.out.print(ch);

	}

	public static void main(String[] args)

	{
		int n = 0;

		Scanner s = new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		n = s.nextInt();
		if (n <= 0)
			System.out.print("Enter numbers greater than 0");
		else {
			ConvertNumberInWords a = new ConvertNumberInWords();
			System.out.print("After conversion number in words is :");

			a.pw((n / 1000000000), " Hundred");
			a.pw((n / 10000000) % 100, " crore");
			a.pw(((n / 100000) % 100), " lakh");
			a.pw(((n / 1000) % 100), " thousand");
			a.pw(((n / 100) % 10), " hundred");
			a.pw((n % 100), " ");
		}
	}
}
