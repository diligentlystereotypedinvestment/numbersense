class eliminateZero {

	public static String zero(double zero) {
		if (zero % 1 == 0.0) {
			return String.valueOf((int) (zero));
		} else {
			return String.valueOf(zero);
		}
	}

	public static String money(double amount){
		if(((int)(amount * 100) / 100.0) % .1 == 0){
			return String.valueOf((int)(amount * 100) / 100.0) + "0";
		} else{
			return String.valueOf((int)(amount * 100) / 100.0);
		}
	}
}
