public class simplify {

	public static String getFraction(String fraction) {
		int num = Integer.valueOf(fraction.substring(0, fraction.indexOf("/")));
		int den = Integer.valueOf(fraction.substring(fraction.indexOf("/") + 1));

		if (1.0 * den / LCMandGCF.GCF(num, den) == 1.0) {
			return String.valueOf(num / LCMandGCF.GCF(num, den));
		} else {
			return ("$\\frac{" + (num / LCMandGCF.GCF(num, den)) + "}{" + (den / LCMandGCF.GCF(num, den)) + "}$");
		}
	}

	public static String getFraction(String fraction, boolean dollarSign) {
		int num = Integer.valueOf(fraction.substring(0, fraction.indexOf("/")));
		int den = Integer.valueOf(fraction.substring(fraction.indexOf("/") + 1));

		if (den / LCMandGCF.GCF(num, den) == 1) {
			return String.valueOf(num / LCMandGCF.GCF(num, den));
		} else {
			return ("\\frac{" + (num / LCMandGCF.GCF(num, den)) + "}{" + (den / LCMandGCF.GCF(num, den)) + "}");
		}
	}

	public static String getProper(String fraction) {
		int num = Integer.valueOf(fraction.substring(0, fraction.indexOf("/")));
		int den = Integer.valueOf(fraction.substring(fraction.indexOf("/") + 1));
		if (den / LCMandGCF.GCF(num, den) == 1) {
			return String.valueOf(num / LCMandGCF.GCF(num, den));
		} else {
			int whole = num / den;
			return (whole + " \\frac{" + ((num % den) / LCMandGCF.GCF(num, den)) + "}{"
					+ (den / LCMandGCF.GCF(num, den)) + "}");
		}
	}
}
