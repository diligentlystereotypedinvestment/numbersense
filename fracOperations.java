public class fracOperations{
    //class should be pretty obvious
    public static String fracAdd(String frac1, String frac2){
        int num1 = Integer.valueOf((frac1.substring(0, frac1.indexOf("/"))));
        int denom1 = Integer.valueOf((frac1.substring(frac1.indexOf("/") + 1)));
        int num2 = Integer.valueOf((frac2.substring(0, frac2.indexOf("/"))));
        int denom2 = Integer.valueOf((frac2.substring(frac2.indexOf("/") + 1)));
        return simplify.getFraction((num1 * denom2 + num2 * denom1) + "/" + (denom1 * denom2));
    }
    public static String fracSub(String frac1, String frac2){
        int num1 = Integer.valueOf((frac1.substring(0, frac1.indexOf("/"))));
        int denom1 = Integer.valueOf((frac1.substring(frac1.indexOf("/") + 1)));
        int num2 = Integer.valueOf((frac2.substring(0, frac2.indexOf("/"))));
        int denom2 = Integer.valueOf((frac2.substring(frac2.indexOf("/") + 1)));
        return simplify.getFraction((num1 * denom2 - num2 * denom1) + "/" + (denom1 * denom2));
    }
    public static String fracMult(String frac1, String frac2){
        int num1 = Integer.valueOf((frac1.substring(0, frac1.indexOf("/"))));
        int denom1 = Integer.valueOf((frac1.substring(frac1.indexOf("/") + 1)));
        int num2 = Integer.valueOf((frac2.substring(0, frac2.indexOf("/"))));
        int denom2 = Integer.valueOf((frac2.substring(frac2.indexOf("/") + 1)));
        return simplify.getFraction((num1 * num2 ) + "/" + (denom1 * denom2));
    }
    public static void main(String[] args){
    System.out.println(fracOperations.fracSub("1/3","1/1"));
    }
}
