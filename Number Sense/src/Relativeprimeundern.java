public class Relativeprimeundern {
	double count(int base) {
		PrimeDivisors prime = new PrimeDivisors();
		double multiply = 1.0;
		for (int i = 1; i <= prime.prime(base).size() - 1; i++) {
			multiply = multiply * (prime.prime(base).get(i) - 1.0) / (prime.prime(base).get(i));
		}
		return (multiply * base);
	}

	double sum(int base) {
		PrimeDivisors prime = new PrimeDivisors();
		double multiply = 1.0;
		for (int i = 1; i <= prime.prime(base).size() - 1; i++) {
			multiply = multiply * (prime.prime(base).get(i) - 1.0) / (prime.prime(base).get(i));
		}
		return (multiply * base * base / 2);
	}
}
