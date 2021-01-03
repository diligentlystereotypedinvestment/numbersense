class eliminateZero {

	public static String zero(double zero) {
		if (zero % 1 == 0.0) {
			return String.valueOf((int) (zero));
		} else {
			return String.valueOf(zero);
		}
	}

	public static double money(double amount){
		return (int)(amount * 100) / 100.0;
	}
}
