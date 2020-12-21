public class simplify{
    
    public static String getFraction(String fraction){
        int num = Integer.valueOf(fraction.substring(0, fraction.indexOf("/")));
        int den = Integer.valueOf(fraction.substring(fraction.indexOf("/") + 1));
        LCMandGCF GCF = new LCMandGCF();
        if(den/GCF.GCF(num, den) == 1){
            return String.valueOf(num/GCF.GCF(num, den));
        } else{
            return ("$\\frac{" + (num/GCF.GCF(num, den)) + "}{" + (den/GCF.GCF(num, den)) + "}$");
        }
    }
    public static String getFraction(String fraction, boolean dollarSign){
        int num = Integer.valueOf(fraction.substring(0, fraction.indexOf("/")));
        int den = Integer.valueOf(fraction.substring(fraction.indexOf("/") + 1));
        LCMandGCF GCF = new LCMandGCF();
        if(den/GCF.GCF(num, den) == 1){
            return String.valueOf(num/GCF.GCF(num, den));
        } else{
            return ("\\frac{" + (num/GCF.GCF(num, den)) + "}{" + (den/GCF.GCF(num, den)) + "}");
        }
    }
    public static String getProper(String fraction){
        int num = Integer.valueOf(fraction.substring(0, fraction.indexOf("/")));
        int den = Integer.valueOf(fraction.substring(fraction.indexOf("/") + 1));
        LCMandGCF GCF = new LCMandGCF();
        if(den/GCF.GCF(num, den) == 1){
            return String.valueOf(num/GCF.GCF(num, den));
        } else{
            int whole = num/den;
            return (whole + " \\frac{" + ((num % den)/GCF.GCF(num, den)) + "}{" + (den/GCF.GCF(num, den)) + "}");
        }
    }
}
