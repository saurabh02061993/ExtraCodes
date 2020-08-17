package PracticeCodes;

public class countLetters {

	public static void main(String[] args) {

		String a = "aabccccffpoasssddd" + "@";
		char p[] = a.toCharArray();
		int count = 1;
		String k = "";

		for (int i = 0; i < a.length() - 1; i++) {

			if (p[i] == p[i + 1]) {
				count++;

			} else {

				if (count != 1) {
					k = k + p[i] + count;
					count = 1;

				} else {

					k = k + p[i] + count;
				}

			}

		}
		System.out.println(k);

	}

}
