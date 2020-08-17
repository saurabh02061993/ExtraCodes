package String;

import java.util.*;

public class togetherUpperandLowerwithOrder {

	public static void main(String[] args) {

		String str = "BdAcbCaD";
		List a2 = new ArrayList();
		for (char l : str.toCharArray()) {
			a2.add(l);

		}
		List a3 = new ArrayList();
		int z = a2.size();

		for (int i = 0; i < z; i++) {
			char ch = (char) a2.get(i);
			int chInt = ch;
			if (chInt >= 65 && chInt <= 90) {

				a3.add(ch);

				int chn = chInt + 32;
				char chn1 = (char) chn;
				if (a2.contains(chn1)) {

					a3.add(chn1);
				}
			}
			if (chInt >= 97 && chInt <= 122) {
				a3.add(ch);

				int chn2 = chInt - 32;
				char chn3 = (char) chn2;
				if (a2.contains(chn3)) {
					a3.add(chn3);

				}
			}
		}

		Set s = new LinkedHashSet(a3);
		System.out.println(s);
	}
}
