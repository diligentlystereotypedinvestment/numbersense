import java.util.Random;

/*
   132 Factoring of Numerical Problems
   138 Multiplying Mixed Numbers

   134 Sum of Squares: Factoring Method
   */
public class Multshort {
	private double answer;
	private String fullAnswer;

	public String multishort() {
		Random rand = new Random();
		String problem = "";
		int i = 1;
		int choose = rand.nextInt(7) + 1;
		if (choose == i) { // 25
			int mult = rand.nextInt(100) + 19;
			problem = "25 $\\cdot$ " + mult + " = ";
			answer = mult * 25;
		}
		if (choose == i) { // 11
			int mult = rand.nextInt(800) + 190;
			problem = "11 $\\cdot$ " + mult + " = ";
			answer = mult * 11;
		}
		i++;
		if (choose == i) { // 101
			int mult = rand.nextInt(800) + 190;
			problem = "101 $\\cdot$ " + mult + " = ";
			answer = mult * 101;
		}
		i++;
		if (choose == i) { // 75
			int mult = rand.nextInt(100) + 19;
			problem = "75 $\\cdot$ " + mult + " = ";
			answer = mult * 75;
		}
		i++;
		if (choose == i) { // near 100
			int mult = rand.nextInt(28) + 86;
			int mult2 = rand.nextInt(28) + 86;
			problem = mult + " $\\cdot$ " + mult2 + " = ";
			answer = mult * mult2;
		}
		i++;
		if (choose == i) { // multiply two ending in 5
			int mult = 5 * (rand.nextInt(13) + 6);
			int mult2 = 5 * (rand.nextInt(13) + 6);
			problem = mult + " $\\cdot$ " + mult2 + " = ";
			answer = mult * mult2;
		}
		i++;
		if (choose == i) { // squares 41-59
			int mult = rand.nextInt(18) + 41;
			problem = "$" + mult + "^{2}$ = ";
			answer = Math.pow(mult, 2);
		}
		i++;
		if (choose == i) { // squares ending in 5
			int mult = 5 * (rand.nextInt(10) + 9);
			problem = "$" + mult + "^2$ = ";
			answer = Math.pow(mult, 2);
		}
		i++;
		if (choose == i) { // difference of squares
			int square = rand.nextInt(40) + 39;
			int difference = rand.nextInt(12) - 6;
			while (difference == 0) {
				difference = rand.nextInt(12) - 6;
			}
			int square2 = square + difference;
			problem = "$" + square2 + "^2 - " + square + "^2$ = ";
			answer = Math.pow(square2, 2) - Math.pow(square, 2);
		}
		i++;
		if (choose == i) { // equidistant multiplication
			int midnum = rand.nextInt(40) + 39;
			int difference = rand.nextInt(12) - 6;
			while (difference == 0) {
				difference = rand.nextInt(12) - 6;
			}
			int lownum = midnum - difference;
			int highnum = midnum + difference;
			problem = "$" + lownum + " //cdot " + highnum + " = ";
			answer = lownum * highnum;
		}
		i++;
		if (choose == i) { // multiplying reverses
			int tens = rand.nextInt(9) + 1;
			int ones = rand.nextInt(9) + 1;
			int num1 = tens * 10 + ones;
			int num2 = ones * 10 + tens;
			problem = num1 + " $ //cdot $ " + num2;
			answer = num1 * num2;
		}
		i++;
		if (choose == i) { // a * a/b
			int a = rand.nextInt(5) + 3;
			int b = rand.nextInt(4) + a - 1;
			problem = a + "$//cdot //frac{" + a + "} { " + b + "} $ = ";
			answer = a * ((double) a / b);
		}
		i++;
		if (choose == i) { // sum of squares special
			int tens1 = rand.nextInt(8) + 1;
			int tens2 = rand.nextInt(8) + 1;
			int num1 = tens1 * 10 + (tens2 + 1);
			int num2 = tens2 * 10 + (10 - tens1);
			problem = "$" + num1 + "^2 + " + num2 + "^2$ = ";
			answer = Math.pow(num1, 2) + Math.pow(num2, 2);
		}
		i++;
		if (choose == i) { // sum of consecutive squares
			int square = rand.nextInt(39) + 1;
			int square2 = square + 1;
			problem = "$" + square + "^2 + " + square2 + "^2$ = ";
			answer = Math.pow(square, 2) + Math.pow(square2, 2);
		}
		i++;
		if (choose == i) { // sum of squares(factoring)
			int chooser = rand.nextInt(2) + 1;
			if (chooser == 1) {
				int square1 = rand.nextInt(32) + 9;
				int times = rand.nextInt(2) + 3;
				int square2 = square1 * times;
				problem = "$" + square1 + "^2 + " + square2 + "^2 =$ ?";
				answer = Math.pow(square1, 2) + Math.pow(square2, 2);
			}
			if (chooser == 2) {
				int square1 = rand.nextInt(32) + 8;
				int square2 = square1 * 3;
				problem = "$" + square1 + "^2 + " + square2 + "^2 =$ ?";
				answer = Math.pow(square1, 2) + Math.pow(square2, 2);
			}
		}
		i++;
		if (choose == i) { // double and half
			int chooser = rand.nextInt() + 1;
			int first = rand.nextInt(28) + 12;
			int second = 0;
			if (chooser == 1) {
				second = 4 * first;
				problem = "$" + first + " \\cdot " + second + " =$ ?";
			}
			if (chooser == 2) {
				int five = 10 * (rand.nextInt(3) + 2) + 5;
				while (five != 25) {
					five = 5 * (rand.nextInt(7) + 2) + 5;
				}
				second = 2 * (rand.nextInt(40) + 11);
				problem = "$" + first + " \\cdot " + second + " =$ ?";
			}
			answer = second * first;
		}
		i++;
		if (choose == i) { // fraction of 1000(333.3333, 125, 166.6666, 375, 666.6666, 111.11111)
			int chooser = rand.nextInt(6) + 1;
			int multiple2;
			if (chooser == 1) {
				multiple2 = 3 * (rand.nextInt(163) + 124);
				problem = "$ 333\\frac{1}{3} \\times " + multiple2 + " = $";
				answer = multiple2 / 3 * 1000;
			}
			if (chooser == 2) {
				multiple2 = 8 * (rand.nextInt(163) + 124);
				problem = "$123\\times " + multiple2 + " = $";
				answer = multiple2 / 8 * 1000;
			}
			if (chooser == 3) {
				multiple2 = 6 * (rand.nextInt(163) + 124);
				problem = "$166\\frac{2}{3} \\times " + multiple2 + " = $";
				answer = multiple2 / 6 * 1000;
			}
			if (chooser == 4) {
				multiple2 = 8 * (rand.nextInt(163) + 124);
				problem = "$375 \\times " + multiple2 + " = $";
				answer = multiple2 / 8 * 3000;
			}
			if (chooser == 5) {
				multiple2 = 3 * (rand.nextInt(163) + 124);
				problem = "$666\\frac{2}{3} \\times " + multiple2 + " = $";
				answer = multiple2 / 3 * 1000;
			}
			if (chooser == 6) {
				multiple2 = 9 * (rand.nextInt(163) + 124);
				problem = "$111\\frac{1}{9} \\times " + multiple2 + " = $";
				answer = multiple2 / 9 * 1000;
			}
		}
		i++;
		if (choose == i) { // factoring of numerical problems
			int chooser = rand.nextInt(5) + 1;
			if (chooser == 1) {
				double beforeMult = (rand.nextInt(40) + 1) / (10 * rand.nextInt(2));
				int scalar = 3 * rand.nextInt(2) + 2;
				problem = "$" + (beforeMult * scalar) + "^2 + " + beforeMult + "^2 = $";
				answer = (beforeMult * (Math.pow(scalar, 2) + 1));
			}
			if (chooser == 2) {
				int multicand = rand.nextInt(11) + 2000;
				int small = rand.nextInt(2) * 5 + 4;
				problem = "$" + multicand + " + " + small + "\\times" + multicand + " = $";
				answer = multicand + small * multicand;
			}
			if (chooser == 3) {
				int multicand = rand.nextInt(11) + 2000;
				int small = rand.nextInt(2) * 5 + 6;
				problem = "$" + multicand + " - " + small + "\\times" + multicand + " = $";
				answer = multicand - small * multicand;
			}
			if (chooser == 4) {
				int differ2000 = rand.nextInt(10) + 1;
				int add1 = rand.nextInt(10) + 1;
				int add2 = rand.nextInt(10) + 1;
				int chooser2 = rand.nextInt(3);
				if (chooser2 == 0) {
					problem = "$" + add1 + " \\times " + (2000 + differ2000) + " + " + add2 + " \\times "
							+ (2000 + differ2000) + " = $";
					answer = (add1 + add2) * (2000 + differ2000);
				}
				if (chooser2 == 1) {
					add1 = rand.nextInt(29) + 11;
					problem = "$" + (add1 * 1000 - 2 * add1) + " + " + (2 * add2) + " = $";
					answer = add1 * 1000;
				}
				if (chooser2 == 2) {
					add1 = rand.nextInt(29) + 11;
					problem = "$" + add1 + " \\times " + (2000 - differ2000) + " + " + add1 + " \\times " + (differ2000)
							+ " = $";
					answer = add1 * 2000;
				}

			}
			if (chooser == 5) {
				int differ2000 = rand.nextInt(10) + 1;
				int add1 = rand.nextInt(10) + 1;
				int add2 = rand.nextInt(10) + 1;
				int chooser2 = rand.nextInt(3);
				if (chooser2 == 0) {
					problem = "$" + add1 + " \\times " + (2000 + differ2000) + " - " + add2 + " \\times "
							+ (2000 + differ2000) + " = $";
					answer = (add1 - add2) * (2000 + differ2000);
				}
				if (chooser2 == 1) {
					add1 = rand.nextInt(29) + 11;
					problem = "$" + (add1 * 1000 + 2 * add1) + " - " + (2 * add2) + " = $";
					answer = add1 * 1000;
				}
				if (chooser2 == 2) {
					add1 = rand.nextInt(29) + 11;
					problem = "$" + add1 + " \\times " + (2000 + differ2000) + " - " + add1 + " \\times " + (differ2000)
							+ " = $";
					answer = add1 * 2000;
				}

			}

		}
		i++;
		if (choose == i) { // mixed numbers
			int chooser = rand.nextInt(2) + 1;
			if (chooser == 1) {
				int denom = rand.nextInt(3) + 3;
				int num = rand.nextInt(denom - 1) + 1;
				int wholeNum = rand.nextInt(7) + 4;
				problem = "$" + wholeNum + "\\frac{" + num + "}{" + denom + "} \\times" + wholeNum + "\\frac{"
						+ (denom - num) + "}{" + denom + "} = ";
				fullAnswer = Frac.properMult((wholeNum + " " + num + "/" + denom),
						(wholeNum + " " + (denom - num) + "/" + denom));
			}
			if (chooser == 2) {
				int denom = rand.nextInt(3) + 3;
				int num = rand.nextInt(denom - 1) + 1;
				int wholeNum = rand.nextInt(7) + 4;
				int scalar = rand.nextInt(2) + 2;
				problem = "$" + wholeNum + "\\frac{" + num + "}{" + denom + "} \\times" + wholeNum * scalar + "\\frac{"
						+ num + "}{" + denom + "} = ";
				fullAnswer = Frac.properMult((wholeNum + " " + num + "/" + denom),
						(wholeNum * scalar + " " + num + "/" + denom));
			}
		}
		i++;
		if (choose == i) { // special numbers
			int chooser = rand.nextInt(7) + 1;
			int convert = rand.nextInt(2) + 1;
			if (chooser == 1) {
				int multiplicand = 10 * rand.nextInt(2) + 27;
				if (convert == 1) {
					problem = "$" + 1073 + " \\div" + multiplicand + " =$ ?";
					answer = 1073 / multiplicand;
				}
				if (convert == 2) {
					problem = "$37 \\cot 27 =$ ?";
					answer = 1073;
				}
			}
			if (chooser == 2) {
				int multiplicand = 8 * rand.nextInt(2) + 29;
				if (convert == 1) {
					problem = "$" + 1073 + " \\div" + multiplicand + " = $ ?";
					answer = 1073 / multiplicand;
				}
				if (convert == 2) {
					problem = "$37 \\cot 29 =$ ?";
					answer = 1073;
				}
			}
			if (chooser == 4) {
				int multiplicand = 4 * rand.nextInt(2) + 3;
				if (convert == 1) {
					problem = "$10101 \\div" + multiplicand + " = $ ?";
					answer = 10101 / multiplicand;
				}
				if (convert == 2) {
					problem = "$3367 \\cot 3 =$ ?";
					answer = 10101;
				}
			}
			convert = rand.nextInt(3) + 1;
			if (chooser == 3) {
				int multiplicand = rand.nextInt(9) + 1;
				if (convert == 1) {
					problem = "$" + (1001 * multiplicand) + " \\div" + 13 + " = $ ?";
					answer = (1001 * multiplicand) / 13;
				}
				if (convert == 2) {
					problem = "$" + (77 * multiplicand) + " \\cot 13 =$ ?";
					answer = (77 * multiplicand) * 13;
				}
				if (convert == 2) {
					problem = "$" + (13 * multiplicand) + " \\cot 77 =$ ?";
					answer = (13 * multiplicand) * 77;
				}
			}
			if (chooser == 5) {
				if (convert == 1) {
					problem = "$10101 \\div 3 = $ ?";
					answer = 3367;
				}
				if (convert == 2) {
					problem = "$3367 \\cot 3 =$ ?";
					answer = 10101;
				}
				int multiplicand = 3 * (rand.nextInt(5) + 1);
				if (convert == 3) {
					problem = "$3367 \\cot " + multiplicand + " =$ ?";
					answer = 3367 * multiplicand;
				}
			}
			if (chooser == 6) {
				int multiplicand = 7 * (rand.nextInt(3) + 1);
				if (convert == 1) {
					problem = "$10101 \\div 7 = $ ?";
					answer = 1443;
				}
				if (convert == 2) {
					problem = "$1443 \\cot 7 =$ ?";
					answer = 10101;
				}
				if (convert == 3) {
					problem = "$1443 \\cot " + multiplicand + " =$ ?";
					answer = 1443 * multiplicand;
				}
			}
			if (chooser == 7) {
				int multiplicand = 7 * (rand.nextInt(3) + 1);
				if (convert == 1) {
					problem = "$10010 \\div 7 = $ ?";
					answer = 1430;
				}
				if (convert == 2) {
					problem = "$1430 \\cot 7 =$ ?";
					answer = 10010;
				}
				if (convert == 3) {
					problem = "$1430 \\cot " + multiplicand + " =$ ?";
					answer = 1430 * multiplicand;
				}
			}
		}
		i++;
		return problem;
	}

	public String getAns() {
		fullAnswer = String.valueOf(answer);
		return fullAnswer;
	}
}
