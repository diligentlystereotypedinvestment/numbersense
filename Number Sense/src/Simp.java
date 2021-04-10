public class Simp {

	public static String getFrac(int a, int b, boolean hasDollars){
		if(hasDollars){
			return getFrac(a + "/" + b);
		} else{
			return getFrac(a + "/" + b, false);
		}
	}

	public static String getFrac(String fraction) {
		if(fraction.indexOf("/") == -1){
			return fraction;
		}
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

	public static String getFrac(String fraction, boolean dollarSign) {
		if(fraction.indexOf("/") == -1){
			return fraction;
		}
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
				return "-" + ("\\frac{" + (num / LCMandGCF.GCF(num, den)) + "}{" + (den / LCMandGCF.GCF(num, den)) + "}");
			}
			return ("\\frac{" + (num / LCMandGCF.GCF(num, den)) + "}{" + (den / LCMandGCF.GCF(num, den)) + "}");
		}
		/*
		if (1.0 * den / LCMandGCF.GCF(num, den) == 1.0) {
			return String.valueOf(num / LCMandGCF.GCF(num, den));
		} else {
			return ("\\frac{" + (num / LCMandGCF.GCF(num, den)) + "}{" + (den / LCMandGCF.GCF(num, den)) + "}");
		}
		*/
	}

	public static String getProper(String fraction) {
		int num, den;
		if(fraction.indexOf("\\/") == -1){
			num = Integer.valueOf(fraction.substring(fraction.indexOf("{") + 1, (fraction.indexOf("}"))));
			String secondHalf = fraction.substring(fraction.indexOf("}") + 1);
			den = Integer.valueOf(secondHalf.substring(secondHalf.indexOf("{") + 1, (secondHalf.indexOf("}"))));
		} else{
			num = Integer.valueOf(fraction.substring(0, fraction.indexOf("/")));
			den = Integer.valueOf(fraction.substring(fraction.indexOf("/") + 1));
		}
		if (den / LCMandGCF.GCF(num, den) == 1) {
			return String.valueOf(num / LCMandGCF.GCF(num, den));
		} else {
			int whole = num / den;
			return (whole + " \\frac{" + ((num % den) / LCMandGCF.GCF(num, den)) + "}{" + (den / LCMandGCF.GCF(num, den)) + "}");
		}
	}
}
