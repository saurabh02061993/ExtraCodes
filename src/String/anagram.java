package String;

public class anagram {

	public static boolean isAnagram(String s, String t) {

		int count[] = new int[256];

		if (s.length() != t.length()) {
			return false;
		}
		int i;
		for (i = 0; i < s.length() && i < t.length(); i++) {
			count[s.charAt(i)]++;
			count[t.charAt(i)]--;
		}

		// If both strings are of different length.
		// Removing this condition will make the program
		// fail for strings like "aaca" and "aca"
		if (s.length() != t.length())
			return false;

		// Compare count arrays
		for (i = 0; i < 256; i++)
			if (count[i] >= 1)
				return false;

		return true;
	}

	public static void main(String[] args) {
		String s = "aa";
		String t = "bb";

		System.out.println(isAnagram(s, t));

	}
}