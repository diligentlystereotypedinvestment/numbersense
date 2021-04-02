import java.util.ArrayList;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class QUp40 {
	public void Gen(ArrayList<String> questions, ArrayList<String> answers, int i) {
		Random rand = new Random();
		int random = rand.nextInt(44) + 1;
		if (random == 15 || random == 16) { // power of numbers
			String printmess = "";
			int base = rand.nextInt(19) + 2;
			int power = 0;
			if (base == 2) {
				power = rand.nextInt(8) + 3;
			} else if (base == 3) {
				power = rand.nextInt(4) + 3;
			} else {
				power = 3;
			}
			printmess = ("(" + i + ") What is " + base + "$^{" + power + "}?$");
			double exponentr = Math.pow(base, power);
			answers.add(String.valueOf(exponentr));
			questions.add(printmess); // System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();

		}
		if (random == 17 || random == 18) { // substitution
			// String printmess = "";
			// int base = rand.nextInt(12) + 2;
			// int power = rand.nextInt(12) + 2;
			// printmess = ("(" + i + ") What is " + base + "^{" + power + "}?$");
			// double exponentr = Math.pow(base, power);
			// answers.add(String.valueOf(exponentr));
			// questions.add(printmess);//System.out.print(printmess);
			// for (int q = 0; q < 60 - printmess.length(); q++) {
			// //System.out.print("\\textunderscore");
			// }
			// //System.out.println();
			// //System.out.println();
			//
		}
		if (random == 19 || random == 20) { // Word Problems
			// String printmess = "";
			// int base = rand.nextInt(12) + 2;
			// int power = rand.nextInt(12) + 2;
			// printmess = ("(" + i + ") What is " + base + "^{" + power + "}?$");
			// double exponentr = Math.pow(base, power);
			// answers.add(String.valueOf(exponentr));
			// questions.add(printmess);//System.out.print(printmess);
			// for (int q = 0; q < 60 - printmess.length(); q++) {
			// //System.out.print("\\textunderscore");
			// }
			// //System.out.println();
			// //System.out.println();
			//
		}

		if (random == 21 || random == 22) { // Inverses
			int choose = rand.nextInt(2) + 1;
			String printmess = "";
			double denominator = (rand.nextInt(500) + 20) / 10;
			if (choose == 0) {
				printmess = ("(" + i + ") What is the mutliplicative reciprocal of " + denominator + "?");
				answers.add(String.valueOf(1.0 / denominator));
			} else {
				denominator = rand.nextInt(21) - 10;
				printmess = ("(" + i + ") What is the additive reciprocal of " + denominator + "?");
				answers.add(String.valueOf(-1 * denominator));
			}
			questions.add(printmess); // System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();

		}
		if (random == 23 || random == 24) { // Absolute value
			Absolute ooo = new Absolute();
			String printmess = ("(" + i + ") $" + "" + ooo.abolute());
			questions.add(printmess); // System.out.print(printmess);
			answers.add(String.valueOf(1.0 * ooo.outsolution));
			/*
			 * for (int q = 0; q < 50 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();

		}
		if (random == 25 || random == 26) { // Proportions
			// Absolute ooo = new Absolute();
			// String printmess = ("$(" + i + ") " + "" + ooo.abolute());
			// questions.add(printmess);//System.out.print(printmess);
			// answers.add(String.valueOf(1.0 * ooo.outsolution));
			// for (int q = 0; q < 50 - printmess.length(); q++) {
			// //System.out.print("\\textunderscore");
			// }
			// //System.out.println();
			// //System.out.println();
			//
		}
		if (random == 27 || random == 28) { // Square roots/ cube roots
			int choose = rand.nextInt(2) + 1;
			String printmess = "";
			int base = 0;
			if (choose == 1) {
				base = rand.nextInt(65) + 1;
				printmess = ("(" + i + ") $\\sqrt{" + Math.pow(base, 2) + "}=$");
			}
			if (choose == 2) {
				base = rand.nextInt(20) + 1;
				printmess = ("(" + i + ") $" + Math.pow(base, 3) + "^{\\frac{1}{3}}=$");
			}
			questions.add(printmess); // System.out.print(printmess);
			answers.add(String.valueOf(1.0 * base));
			/*
			 * for (int q = 0; q < 50 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		}
		if (random == 29 || random == 30) { // Sets
			Set<String> setA = new HashSet<String>();
			Set<String> setB = new HashSet<String>();
			ArrayList<String> array1 = new ArrayList<>();
			ArrayList<String> array2 = new ArrayList<>();
			int length = rand.nextInt(2) + 5;
			for (int q = 0; q < length; q++) {
				array1.add(String.valueOf(rand.nextInt(10)));
			}
			length = rand.nextInt(2) + 5;
			for (int q = 0; q < length; q++) {
				array2.add(String.valueOf(rand.nextInt(7)));
			}
			setA.addAll(array1);
			setB.addAll(array2);
			int choose = rand.nextInt(6) + 1;
			String printmess = "";
			if (choose == 1) { // union
				Set<String> union = new HashSet<String>(setA);
				union.addAll(setB);
				printmess = ("(" + i + ") How many elements are in the union of " + setA + " and " + setB + "?");
				answers.add(String.valueOf(1.0 * union.size()));
			}
			if (choose == 2) { // intercept
				Set<String> intersection = new HashSet<String>(setA);
				intersection.retainAll(setB);
				printmess = ("(" + i + ") How many elements are in the intercept of " + setA + " and " + setB + "?");
				answers.add(String.valueOf(1.0 * (intersection.size())));
			}
			if (choose == 3) { // proper
				printmess = ("(" + i + ") How many proper subsets are in " + setA + "?");
				answers.add(String.valueOf(1.0 * Math.pow(2, setA.size()) - 1));
			}
			if (choose == 4) { // improper
				printmess = ("(" + i + ") How many improper subsets are in " + setA + "?");
				answers.add(String.valueOf(1.0));
			}
			if (choose == 5) { // choose
				// Combinations chose = new Combinations ();
				int chooselength = rand.nextInt(2) + 1;
				int doublechoose = rand.nextInt(2) + 1;
				if (doublechoose == 1) {
					printmess = ("(" + i + ") How many subsets with length " + chooselength + " are there in " + setA
							+ "?");
					answers.add(String.valueOf(1.0 * Combin.choose(setA.size(), chooselength)));
				} else if (doublechoose == 2) {
					printmess = ("(" + i + ") How many subsets with length " + chooselength + " are there in " + setA
							+ " + subsets of length " + (setA.size() - chooselength) + " in " + setA + "?");
					answers.add(String.valueOf(2.0 * Combin.choose(setA.size(), chooselength)));
				}
			}
			if (choose == 6) { // number of subsets
				printmess = ("(" + i + ") How many subsets are there in " + setA + "?");
				answers.add(String.valueOf(1.0 * Math.pow(2, setA.size())));
			}
			questions.add(printmess); // System.out.print(printmess);
			/*
			 * for (int q = 0; q < 50 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		}
		if (random == 31 || random == 32) { // Bases
			int choose = rand.nextInt(3) + 1;
			String printmess = "";
			int base = rand.nextInt(11) + 2;
			int ognumber = 0;
			String newnum = "";
			if (choose == 1) {
				ognumber = rand.nextInt(104) + 5;
				printmess = ("(" + i + ") What is " + ognumber + " in base " + base);
				answers.add(String.valueOf(Baseconvert.newnum(ognumber, base)));
			}
			if (choose == 2) {
				ognumber = rand.nextInt(104) + 5;
				newnum = Baseconvert.newnum(ognumber, base);
				printmess = ("(" + i + ") What is $" + newnum + "_ {" + base + "}$ in base 10");
				answers.add(String.valueOf(1.0 * ognumber));
			}
			if (choose == 3) {
				ognumber = rand.nextInt(104) + 5;
				int choose2 = (int) Math.pow(2, rand.nextInt(3) + 1);
				int secondchoose2 = (int) Math.pow(2, rand.nextInt(3) + 1);
				newnum = Baseconvert.newnum(ognumber, choose2);
				printmess = ("(" + i + ") What is $" + newnum + "_{" + choose2 + "}$ in base " + secondchoose2);
				answers.add(String.valueOf(Baseconvert.newnum(Baseconvert.ognum(newnum, choose2), secondchoose2)));
			}
			questions.add(printmess); // System.out.print(printmess);
			/*
			 * for (int q = 0; q < 50 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();

		}
		if (random == 33 || random == 34) { // Solving Simple Equations// System.out.print(printmess);
			Equations.gen(i, questions, answers);
			/*
			 * for (int q = 0; q < 50 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();

		}

		if (random == 35 || random == 36) { // system of equations
			int problem = rand.nextInt(2);
			if (problem == 0) {
				SystemOfEquations sys = new SystemOfEquations();
				sys.Gen();
				questions.add("(" + i + ") " + sys.getQuestion());
				answers.add(String.valueOf(sys.getAnswer()));
			} else {
				int x1 = rand.nextInt(6) + 1;
				int x2 = rand.nextInt(6) + 1;
				int y1 = rand.nextInt(6) + 1;
				int y2 = rand.nextInt(6) + 1;
				int equal1 = rand.nextInt(10) + 1;
				int equal2 = rand.nextInt(10) + 1;
				String sign1 = "";
				String sign2 = "";
				String solve = "";
				int choose = rand.nextInt(2) + 1;
				if (choose == 1) {
					sign1 = " + ";
				}
				if (choose == 2) {
					sign1 = " - ";
				}
				choose = rand.nextInt(2) + 1;
				if (choose == 1) {
					sign2 = " - ";
				}
				if (choose == 2) {
					sign2 = " + ";
				}
				choose = rand.nextInt(2) + 1;
				if (choose == 1) {
					solve = " x ";
				}
				if (choose == 2) {
					solve = " y ";
				}
				String printmess = "";
				printmess = ("(" + i + ") $" + x1 + "x" + sign1 + y1 + "y = " + equal1 + " , " + x2 + "x" + sign2 + y2
						+ "y = " + equal2 + "$ What is the value of " + solve);
				if (sign2.contains("-") && sign1.contains("+")) {
					if (solve.contains("x")) {
						double ratio = y1 / y2;
						double newequal = equal1 + (ratio * equal2);
						double newx = x1 + (ratio * x2);
						answers.add(String.valueOf(newequal / newx));
					}
					if (solve.contains("y")) {
						double ratio = x1 / x2;
						double newequal = equal1 + (ratio * equal2);
						double newy = y1 + (ratio * y2);
						answers.add(String.valueOf(newequal / newy));
					}
				}
				if (sign2.contains("+") && sign1.contains("+")) {
					if (solve.contains("x")) {
						double ratio = -1.0 * y1 / y2;
						double newequal = equal1 + (ratio * equal2);
						double newx = x1 + (ratio * x2);
						answers.add(String.valueOf(newequal / newx));
					}
					if (solve.contains("y")) {
						double ratio = -1.0 * x1 / x2;
						double newequal = equal1 + (ratio * equal2);
						double newy = y1 + (ratio * y2);
						answers.add(String.valueOf(newequal / newy));
					}
				}
				if (sign2.contains("+") && sign1.contains("-")) {
					if (solve.contains("x")) {
						double ratio = y2 / y1;
						double newequal = equal2 + (ratio * equal1);
						double newx = x2 + (ratio * x1);
						answers.add(String.valueOf(newequal / newx));
					}
					if (solve.contains("y")) {
						double ratio = x2 / x1;
						double newequal = equal2 + (ratio * equal1);
						double newy = y2 - (ratio * y1);
						answers.add(String.valueOf(newequal / newy));
					}
				}
				if (sign2.contains("-") && sign1.contains("-")) {
					if (solve.contains("x")) {
						double ratio = -1.0 * y1 / y2;
						double newequal = equal1 + (ratio * equal2);
						double newx = x1 + (ratio * x2);
						answers.add(String.valueOf(newequal / newx));
					}
					if (solve.contains("y")) {
						double ratio = -1.0 * x1 / x2;
						double newequal = equal1 + (ratio * equal2);
						double newy = y1 + (ratio * y2);
						answers.add(String.valueOf(newequal / newy));
					}
				}
				questions.add(printmess);
			}

		}
		if (random == 37 || random == 38) { // repeating decimal to fraction
			RepeatingFraction.gen(i, questions, answers);
		}
		// power
		if (random == 39 || random == 40) { // I think this is more remainder problems
			int dividend = rand.nextInt(4) + 3;
			int base = rand.nextInt(12) + 2;
			int power = rand.nextInt(12) + 2;
			String printmess = ("(" + i + ") What is the remainder of $" + base + "^{" + power + "}\\div" + dividend
					+ "?$");
			double exponentr = Math.pow(base, power);
			questions.add(printmess);
			answers.add(String.valueOf(exponentr % dividend));

		}
		if (random == 41 || random == 42) { // polynomial
			Polynomial poly = new Polynomial();
			poly.Gen(i);
			questions.add(poly.getQuestion());
			answers.add(String.valueOf(poly.getAnswer()));
		}
		/*
		 * if(random == 43 || random == 44){//exponents OofO exponent = new OofO();
		 * questions.add("(" + i + ") " + exponent.exponent());
		 * answers.add(String.valueOf(exponent.outsolution));
		 * 
		 * }
		 */
		if (random == 43 || random == 44) { // ratios/proportions
			Proportion.gen(questions, answers, i);
		}

		if (random < 15) { // problems before it
			QUp20 questions20 = new QUp20();
			questions20.Gen(questions, answers, i);
		}
	}
}
