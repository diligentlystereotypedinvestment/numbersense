public class simp {

	public static String getFraction(String fraction) {
		int num = Integer.valueOf(fraction.substring(0, fraction.indexOf("/")));
		int den = Integer.valueOf(fraction.substring(fraction.indexOf("/") + 1));
		boolean negative = false;
		if((num < 0)^(den < 0)){
			negative = true;
		}
		num = Math.abs(num);
		den = Math.abs(den);

		if (1.0 * den / LCMandGCF.GCF(num, den) == 1.0) {
			if(negative){
				return "-" + String.valueOf(num / LCMandGCF.GCF(num, den));
			}
			return String.valueOf(num / LCMandGCF.GCF(num, den));
		} else {
			if(negative){
				return "-" + ("$\\frac{" + (num / LCMandGCF.GCF(num, den)) + "}{" + (den / LCMandGCF.GCF(num, den)) + "}$");
			}
			return ("$\\frac{" + (num / LCMandGCF.GCF(num, den)) + "}{" + (den / LCMandGCF.GCF(num, den)) + "}$");
		}
	}

	public static String getFraction(String fraction, boolean dollarSign) {
		int num = Integer.valueOf(fraction.substring(0, fraction.indexOf("/")));
		int den = Integer.valueOf(fraction.substring(fraction.indexOf("/") + 1));

		if (1.0 * den / LCMandGCF.GCF(num, den) == 1.0) {
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

	public static void main(String[] args) {
		System.out.println(simp.getFraction(2 + "/" + -3));
	}
}
