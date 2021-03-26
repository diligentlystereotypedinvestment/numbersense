public class IsPrime {
	boolean prime(int base) {
		for (int i = 2; i <= base / 2; i++) {
			if (base % i == 0) {
				return false;
			}
		}
		return true;
	}
}
