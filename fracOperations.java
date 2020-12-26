public class fracOperations {
	// class should be pretty obvious
	public static String fracAdd(String frac1, String frac2) {
		int num1 = Integer.valueOf((frac1.substring(0, frac1.indexOf("/"))));
		int denom1 = Integer.valueOf((frac1.substring(frac1.indexOf("/") + 1)));
		int num2 = Integer.valueOf((frac2.substring(0, frac2.indexOf("/"))));
		int denom2 = Integer.valueOf((frac2.substring(frac2.indexOf("/") + 1)));
		return simplify.getFraction((num1 * denom2 + num2 * denom1) + "/" + (denom1 * denom2));
	}

	public static String fracAdd(String frac1, String frac2, boolean latexFormat) {
		int num1 = Integer.valueOf((frac1.substring(0, frac1.indexOf("/"))));
		int denom1 = Integer.valueOf((frac1.substring(frac1.indexOf("/") + 1)));
		int num2 = Integer.valueOf((frac2.substring(0, frac2.indexOf("/"))));
		int denom2 = Integer.valueOf((frac2.substring(frac2.indexOf("/") + 1)));
		return (num1 * denom2 + num2 * denom1) + "/" + (denom1 * denom2);
	}

	public static String fracSub(String frac1, String frac2) {
		int num1 = Integer.valueOf((frac1.substring(0, frac1.indexOf("/"))));
		int denom1 = Integer.valueOf((frac1.substring(frac1.indexOf("/") + 1)));
		int num2 = Integer.valueOf((frac2.substring(0, frac2.indexOf("/"))));
		int denom2 = Integer.valueOf((frac2.substring(frac2.indexOf("/") + 1)));
		return simplify.getFraction((num1 * denom2 - num2 * denom1) + "/" + (denom1 * denom2));
	}

	public static String fracMult(String frac1, String frac2) {
		int num1 = Integer.valueOf((frac1.substring(0, frac1.indexOf("/"))));
		int denom1 = Integer.valueOf((frac1.substring(frac1.indexOf("/") + 1)));
		int num2 = Integer.valueOf((frac2.substring(0, frac2.indexOf("/"))));
		int denom2 = Integer.valueOf((frac2.substring(frac2.indexOf("/") + 1)));
		return simplify.getFraction((num1 * num2) + "/" + (denom1 * denom2));
	}

	public static String fracMult(String frac1, String frac2, boolean latexFormat) {
		int num1 = Integer.valueOf((frac1.substring(0, frac1.indexOf("/"))));
		int denom1 = Integer.valueOf((frac1.substring(frac1.indexOf("/") + 1)));
		int num2 = Integer.valueOf((frac2.substring(0, frac2.indexOf("/"))));
		int denom2 = Integer.valueOf((frac2.substring(frac2.indexOf("/") + 1)));
		return (num1 * num2) + "/" + (denom1 * denom2);
	}

	public static String properAdd(String frac1, String frac2) {
		return simplify.getProper(fracAdd(frac1, frac2, false));
	}

	public static String properMult(String frac1, String frac2) {
		String[] parts1 = frac1.split(" ");
		String[] parts2 = frac2.split(" ");
		String[] answer = new String[4];
		answer[0] = String.valueOf(Integer.valueOf(parts1[0]) * Integer.valueOf(parts2[0])) + "/1";
		answer[1] = fracMult(parts1[0] + "/1", parts2[1], false);
		answer[2] = fracMult(parts2[0] + "/1", parts1[1], false);
		answer[3] = fracMult(parts1[1], parts2[1], false);
		return simplify
				.getProper(fracAdd(fracAdd(answer[0], answer[1], false), fracAdd(answer[2], answer[3], false), false));
	}
}
