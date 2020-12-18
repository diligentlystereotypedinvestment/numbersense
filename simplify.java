public class simplify{
    int num;
    int den;
    
    public simplify(String fraction){
        num = Integer.valueOf(fraction.substring(0, fraction.indexOf("/")));
        den = Integer.valueOf(fraction.substring(fraction.indexOf("/") + 1));
    }
    
    public String getFraction(){
        LCMandGCF GCF = new LCMandGCF();
        return ("\\frac{" + (num/GCF.GCF(num, den)) + "}{" + (den/GCF.GCF(num, den)) + "}");
    }
}
