import java.util.ArrayList;
import java.util.Random;

public class Polynomial {

	private String problem;
	private String answer;
	private int[] coefficients = new int[4];
	private int power;

	public Polynomial(int[] coef){
		coefficients = coef;
		power = coef.length - 1;
	}

	public Polynomial() {
		Random rand = new Random();
		power = 2;
		int choose = rand.nextInt(2);
		if (choose == 0) {
			power = 3;
		}
		problem = "";
		for (int i = power; i > 1; i--) {
			int sign = rand.nextInt(2);
			coefficients[power - i] = rand.nextInt(6) + 1;
			String term = "";
			if (coefficients[power - i] == 1) {
				term = "x^" + i;
			} else {
				term = coefficients[power - i] + "x^" + i;
			}
			if (sign == 0) {
				problem = term + " + " + problem;
			}
			if (sign == 1) {
				problem = term + " - " + problem;
			}
		}
		choose = rand.nextInt(2);
		coefficients[power - 1] = rand.nextInt(6) + 1;
		if (choose == 0) {
			problem = problem + coefficients[power - 1] + "x" + " + ";
		} else {
			problem = problem + coefficients[power - 1] + "x" + " - ";
		}
		coefficients[power] = rand.nextInt(6) + 1;
		problem = "$" + problem + coefficients[power] + "$";
	}

	public void Gen(int i) {//problems over different combinations of the roots, like sum of squares
		int power = this.power;
		Random rand = new Random();
		Polynomial problem = new Polynomial();
		String tempProblem = problem.toString();
		int choose = rand.nextInt(3);
		if (choose == 0) {
			this.problem = "(" + i + ") What is the sum of roots of " + tempProblem + "?";
			answer = Simp.getFrac((-1 * problem.getCoef(1)) + "/" + problem.getCoef(0));
		} else if (choose == 1 && power == 2) {
			int decrimType = rand.nextInt(2);
			if (decrimType == 0) { // 0
				int evenSquare = 2 * (rand.nextInt(4) + 3);
				int ac = (int) Math.pow(evenSquare, 2) / 4;
				int a = PrimeDivisors.factor(ac).get(rand.nextInt(PrimeDivisors.factor(ac).size()));
				int c = ac / a;
				this.problem = "$" + a + "x^2 + " + evenSquare + "x + " + c + "$";
				answer = "0";
			} else if (decrimType == 1) { // 1
				int oddSquare = 2 * (rand.nextInt(4) + 3) + 1;
				int ac = (int) (Math.pow(oddSquare, 2) - 1) / 4;
				int a = PrimeDivisors.factor(ac).get(rand.nextInt(PrimeDivisors.factor(ac).size()));
				int c = ac / a;
				this.problem = "$" + a + "x^2 + " + oddSquare + "x + " + c + "$";
				answer = "1";
			}
			this.problem = "(" + i + ") What is the discriminate of " + problem + "?";
		} else if (choose == 1 && power == 3) {
			this.problem = "(" + i + ") What is the sum of the roots of " + problem + " taken two at a time?";
			answer = Simp.getFrac(problem.getCoef(2) + "/" + problem.getCoef(0));
		} else if (choose == 2) {
			this.problem = "(" + i + ") What is the product of the roots of " + problem;
			answer = Simp.getFrac(problem.getCoef(power) + "/" + (problem.getCoef(0) * (int) Math.pow(-1, power)));
		}
	}

	public void gen(int i){
		int power = this.power;
		Random rand = new Random();
		Polynomial problem = this;
		String tempProblem = problem.toString();
		int choose = rand.nextInt(3);
		while(choose == 1 && power == 2){
			choose = rand.nextInt(3);
		} 
		if (choose == 0) {
			this.problem = "(" + i + ") What is the sum of the critical values of " + tempProblem + "?";
			answer = Simp.getFrac((-1 * problem.getCoef(1)) + "/" + problem.getCoef(0));
		} else if (choose == 1 && power == 3) {
			this.problem = "(" + i + ") What is the sum of the the critical values of " + problem + " taken two at a time?";
			answer = Simp.getFrac(problem.getCoef(2) + "/" + problem.getCoef(0));
		} else if (choose == 2) {
			this.problem = "(" + i + ") What is the product of the the critical values of " + problem;
			answer = Simp.getFrac(problem.getCoef(power) + "/" + (problem.getCoef(0) * (int) Math.pow(-1, power)));
		}
	}

	public static void polynomialRoots(ArrayList<String> questions, ArrayList<String> answers, int i) {
		Polynomial poly = new Polynomial();
		Random rand = new Random();
		int choose = rand.nextInt(2);
		int a = poly.getCoef(0);
		int b = poly.getCoef(1);
		int c = poly.getCoef(2);
		if (choose == 0) {
			questions.add("(" + i + ") What is the lowest root of " + poly + "?");
			answers.add(Simp.getFrac((-1 * b - (int) Math.sqrt(Math.pow(a, 2) - 4 * a * c)) + "/" + (2 * a)));
		}
		if (choose == 1) {
			questions.add("(" + i + ") What is the largest root of " + poly + "?");
			answers.add(Simp.getFrac((-1 * b + (int) Math.sqrt(Math.pow(a, 2) - 4 * a * c)) + "/" + (2 * a)));
		}
	}

	public String getQuestion() {
		return problem;
	}

	public String getAnswer() {
		return answer;
	}

	public int getCoef(int i) {
		return coefficients[i];
	}

	public String toString() {
		return problem;
	}
}
