public class EliminateZero {

	public static String zero(double zero) {
		if (zero % 1 == 0.0) {
			return String.valueOf((int) (zero));
		} else {
			return String.valueOf(zero);
		}
	}

	public static String money(double amount) {
		String money = String.valueOf(amount);
		String afterDeci = money.substring(money.indexOf("."));
		if(afterDeci.length() == 1){
			return money + "00";
		}
		if(afterDeci.length() == 2){
			return money + "0";
		}
		return money;
		/*
		if (((int) (amount * 100) / 100.0) % .1 == 0) {
			return String.valueOf((int) (amount * 100) / 100.0) + "0";
		} else {
			return String.valueOf((int) (amount * 100) / 100.0);
		}
		*/
	}
}
