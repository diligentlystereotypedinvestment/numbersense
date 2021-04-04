import java.util.Random;
import java.util.ArrayList;

public class Combin {
	private boolean comb;
	private int n;
	private int k;

	public Combin(int n, int k, boolean isComb) {
		this.n = n;
		this.k = k;
		this.comb = isComb;
	}

	public int toAns() {
		// int n = combina.getN();
		// int k = combina.getK();
		if (comb) {
			return BinomialTheorem.factorial(n) / (BinomialTheorem.factorial(k) * BinomialTheorem.factorial(n - k));
		}
		return BinomialTheorem.factorial(n) / (BinomialTheorem.factorial(n - k));
	}

	public static int choose(int n, int k) {
		return new Combin(n, k, true).toAns();
	}

	public boolean isComb() {
		return comb;
	}

	public int getN() {
		return n;
	}

	public int getK() {
		return k;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void setK(int k) {
		this.k = k;
	}

	public static Combin random(Range range1) {
		Random rand = new Random();
		boolean comb = rand.nextBoolean();
		int n = range1.gen();
		int k = rand.nextInt(n - 1) + 1;
		return new Combin(n, k, comb);
	}

	public static void gen(ArrayList<String> questions, ArrayList<String> answers, int i) {
		Random rand = new Random();
		int problem = rand.nextInt(2);
		if (problem == 0) {
			Combin problemC = random(new Range(3, 9));
			questions.add("(" + i + ") $" + problemC + "$ = ");
			answers.add(String.valueOf(problemC.toAns()));
		}
		if (problem == 1) {
			OofO comb = new OofO();
			comb.equation(new Combin(2,1,true), new Range(3, 8), new Range(3, 6), new Range(3, 6), 2);
			questions.add("(" + i + ") $" + comb.getQuest() + "$");
			answers.add(comb.getAns());
		}
	}

	public String toString() {
		if (comb) {
			return "_{" + n + "}C_{" + k + "}";
		}
		return "_{" + n + "}P_{" + k + "}";
	}
}
