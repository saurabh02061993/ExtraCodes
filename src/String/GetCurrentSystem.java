package String;

public class GetCurrentSystem {

	private static String OS = null;

	public static String getOsName() {
		if (OS == null) {
			OS = System.getProperty("os.name").toLowerCase();
		}
		return OS;
	}

	public static boolean isWindows() {
		return getOsName().startsWith("windows");
	}

	public static boolean isMac() {
		return getOsName().startsWith("mac");
	}

	public static void main(String[] args) {

		if (isWindows()) {
			System.out.println("i am on windows");
		}
		if (isMac()) {
			System.out.println("i am on mac");
		}

	}

}
