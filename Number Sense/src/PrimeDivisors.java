import java.util.ArrayList;

public class PrimeDivisors {
	public static ArrayList<Integer> prime(int num) {
		ArrayList<Integer> list1 = new ArrayList<>();
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				if (IsPrime.prime(i)) {
					list1.add(i);
				}
			}
		}
		return list1;
	}

	public static int primesum(int base) {
		int sum = 0;
		for(int i: prime(base)){
			sum += i;
		}
		return sum;
		/*
		for (int i = 1; i <= base / 2; i++) {
			if (base % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
		*/
	}

	public static ArrayList<Integer> factor(int num) {
		ArrayList<Integer> list1 = new ArrayList<>();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				list1.add(i);
			}
		}
		return list1;
	}
}
