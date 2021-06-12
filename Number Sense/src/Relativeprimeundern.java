public class Relativeprimeundern {
	double count(int base) {
		double multiply = 1.0;
		for (int i = 1; i <= PrimeDivisors.prime(base).size() - 1; i++) {
			multiply = multiply * (PrimeDivisors.prime(base).get(i) - 1.0) / (PrimeDivisors.prime(base).get(i));
		}
		return (multiply * base);
	}

	double sum(int base) {
		double multiply = 1.0;
		for (int i = 1; i <= PrimeDivisors.prime(base).size() - 1; i++) {
			multiply = multiply * (PrimeDivisors.prime(base).get(i) - 1.0) / (PrimeDivisors.prime(base).get(i));
		}
		return (multiply * base * base / 2);
	}
}
