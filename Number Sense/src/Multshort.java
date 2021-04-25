import java.util.Random;
import java.util.ArrayList;
//import java.util.Scanner;

public class Multshort {
	private double answer;
	private String fullAnswer;

	public String multishort() {
		Random rand = new Random();
		String problem = "";
		int i = 1;
		int choose = rand.nextInt(22) + 1;
		//choose = scan.nextInt();
		if (choose == i) { // 25
			int mult = rand.nextInt(100) + 19;
			problem = "25 $\\cdot$ " + mult + " = ";
			answer = mult * 25;
		} else if (choose == i++) { // 11
			int mult = rand.nextInt(800) + 190;
			problem = "11 $\\cdot$ " + mult + " = ";
			answer = mult * 11;
		} else if (choose == i++) { // 101
			int mult = rand.nextInt(800) + 190;
			problem = "101 $\\cdot$ " + mult + " = ";
			answer = mult * 101;
		} else if (choose == i++) { // 75
			int mult = rand.nextInt(100) + 19;
			problem = "75 $\\cdot$ " + mult + " = ";
			answer = mult * 75;
		} else if (choose == i++) { // near 100
			int mult = rand.nextInt(28) + 86;
			int mult2 = rand.nextInt(28) + 86;
			problem = mult + " $\\cdot$ " + mult2 + " = ";
			answer = mult * mult2;
		} else if (choose == i++) { // multiply two ending in 5
			int mult = 5 * (rand.nextInt(13) + 6);
			int mult2 = 5 * (rand.nextInt(13) + 6);
			problem = mult + " $\\cdot$ " + mult2 + " = ";
			answer = mult * mult2;
		} else if (choose == i++) { // squares 41-59
			int mult = rand.nextInt(18) + 41;
			problem = "$" + mult + "^{2}$ = ";
			answer = Math.pow(mult, 2);
		} else if (choose == i++) { // squares ending in 5
			int mult = 5 * (rand.nextInt(10) + 9);
			problem = "$" + mult + "^2$ = ";
			answer = Math.pow(mult, 2);
		} else if (choose == i++) { // difference of squares
			int square = rand.nextInt(40) + 39;
			int difference = rand.nextInt(12) - 6;
			while (difference == 0) {
				difference = rand.nextInt(12) - 6;
			}
			int square2 = square + difference;
			problem = "$" + square2 + "^2 - " + square + "^2$ = ";
			answer = Math.pow(square2, 2) - Math.pow(square, 2);
		} else if (choose == i++) { // equidistant multiplication
			int midnum = rand.nextInt(40) + 39;
			int difference = rand.nextInt(12) - 6;
			while (difference == 0) {
				difference = rand.nextInt(12) - 6;
			}
			int lownum = midnum - difference;
			int highnum = midnum + difference;
			problem = "$" + lownum + " //cdot " + highnum + " $= ";
			answer = lownum * highnum;
		} else if (choose == i++) { // multiplying reverses
			int tens = rand.nextInt(9) + 1;
			int ones = rand.nextInt(9) + 1;
			int num1 = tens * 10 + ones;
			int num2 = ones * 10 + tens;
			problem = num1 + " $ //cdot $ " + num2;
			answer = num1 * num2;
		} else if (choose == i++) { // a * a/b
			int a = rand.nextInt(5) + 3;
			int b = rand.nextInt(4) + a - 1;
			problem = a + "$//cdot \\frac{" + a + "} { " + b + "} $ = ";
			answer = a * ((double) a / b);
		} else if (choose == i++) { // sum of squares special
			int tens1 = rand.nextInt(8) + 1;
			int tens2 = rand.nextInt(8) + 1;
			int num1 = tens1 * 10 + (tens2 + 1);
			int num2 = tens2 * 10 + (10 - tens1);
			problem = "$" + num1 + "^2 + " + num2 + "^2$ = ";
			answer = Math.pow(num1, 2) + Math.pow(num2, 2);
		} else if (choose == i++) { // sum of consecutive squares
			int square = rand.nextInt(39) + 1;
			int square2 = square + 1;
			problem = "$" + square + "^2 + " + square2 + "^2$ = ";
			answer = Math.pow(square, 2) + Math.pow(square2, 2);
		} else if (choose == i++) { // sum of squares(factoring)
			int chooser = rand.nextInt(2) + 1;
			if (chooser == 1) {
				int square1 = rand.nextInt(32) + 9;
				int times = rand.nextInt(2) + 3;
				int square2 = square1 * times;
				problem = "$" + square1 + "^2 + " + square2 + "^2 =$ ?";
				answer = Math.pow(square1, 2) + Math.pow(square2, 2);
			}else if (chooser == 2) {
				int square1 = rand.nextInt(32) + 8;
				int square2 = square1 * 3;
				problem = "$" + square1 + "^2 + " + square2 + "^2 =$ ?";
				answer = Math.pow(square1, 2) + Math.pow(square2, 2);
			}
		} else if (choose == i++) { // double and half
			int chooser = rand.nextInt() + 1;
			int first = rand.nextInt(28) + 12;
			int second = 0;
			if (chooser == 1) {
				second = 4 * first;
				problem = "$" + first + " \\cdot " + second + " =$ ?";
			}else if (chooser == 2) {
				int five = 10 * (rand.nextInt(3) + 2) + 5;
				while (five != 25) {
					five = 5 * (rand.nextInt(7) + 2) + 5;
				}
				second = 2 * (rand.nextInt(40) + 11);
				problem = "$" + first + " \\cdot " + second + " =$ ?";
			}
			answer = second * first;
		} else if (choose == i++) { // fraction of 1000(333.3333, 125, 166.6666, 375, 666.6666, 111.11111)
			int chooser = rand.nextInt(6) + 1;
			int multiple2;
			if (chooser == 1) {
				multiple2 = 3 * (rand.nextInt(163) + 124);
				problem = "$ 333\\frac{1}{3} \\times " + multiple2 + " = $";
				answer = multiple2 / 3 * 1000;
			}else if (chooser == 2) {
				multiple2 = 8 * (rand.nextInt(163) + 124);
				problem = "$123\\times " + multiple2 + " = $";
				answer = multiple2 / 8 * 1000;
			}else if (chooser == 3) {
				multiple2 = 6 * (rand.nextInt(163) + 124);
				problem = "$166\\frac{2}{3} \\times " + multiple2 + " = $";
				answer = multiple2 / 6 * 1000;
			}else if (chooser == 4) {
				multiple2 = 8 * (rand.nextInt(163) + 124);
				problem = "$375 \\times " + multiple2 + " = $";
				answer = multiple2 / 8 * 3000;
			}else if (chooser == 5) {
				multiple2 = 3 * (rand.nextInt(163) + 124);
				problem = "$666\\frac{2}{3} \\times " + multiple2 + " = $";
				answer = multiple2 / 3 * 1000;
			}else if (chooser == 6) {
				multiple2 = 9 * (rand.nextInt(163) + 124);
				problem = "$111\\frac{1}{9} \\times " + multiple2 + " = $";
				answer = multiple2 / 9 * 1000;
			}
		} else if (choose == i++) { // factoring of numerical problems
			int chooser = rand.nextInt(5) + 1;
			if (chooser == 1) {
				double beforeMult = (rand.nextInt(35) + 5);// / (10 * rand.nextInt(2));
				int scalar = 3 * rand.nextInt(2) + 2;
				problem = "$" + (beforeMult * scalar) + "^2 + " + beforeMult + "^2 = $";
				answer = (beforeMult * (Math.pow(scalar, 2) + 1));
			}else if (chooser == 2) {
				int multicand = rand.nextInt(11) + 2000;
				int small = rand.nextInt(2) * 5 + 4;
				problem = "$" + multicand + " + " + small + "\\times" + multicand + " = $";
				answer = multicand + small * multicand;
			}else if (chooser == 3) {
				int multicand = rand.nextInt(11) + 2000;
				int small = rand.nextInt(2) * 5 + 6;
				problem = "$" + multicand + " - " + small + "\\times" + multicand + " = $";
				answer = multicand - small * multicand;
			}else if (chooser == 4) {
				int differ2000 = rand.nextInt(10) + 1;
				int add1 = rand.nextInt(10) + 1;
				int add2 = rand.nextInt(10) + 1;
				int chooser2 = rand.nextInt(3);
				if (chooser2 == 0) {
					problem = "$" + add1 + " \\times " + (2000 + differ2000) + " + " + add2 + " \\times "+ (2000 + differ2000) + " = $";
					answer = (add1 + add2) * (2000 + differ2000);
				}else if (chooser2 == 1) {
					add1 = rand.nextInt(29) + 11;
					problem = "$" + (add1 * 1000 - 2 * add1) + " + " + (2 * add2) + " = $";
					answer = add1 * 1000;
				}else if (chooser2 == 2) {
					add1 = rand.nextInt(29) + 11;
					problem = "$" + add1 + " \\times " + (2000 - differ2000) + " + " + add1 + " \\times " + (differ2000)+ " = $";
					answer = add1 * 2000;
				}
			} else if (chooser == 5) {
				int differ2000 = rand.nextInt(10) + 1;
				int add1 = rand.nextInt(10) + 1;
				int add2 = rand.nextInt(10) + 1;
				int chooser2 = rand.nextInt(3);
				if (chooser2 == 0) {
					problem = "$" + add1 + " \\times " + (2000 + differ2000) + " - " + add2 + " \\times "+ (2000 + differ2000) + " = $";
					answer = (add1 - add2) * (2000 + differ2000);
				}else if (chooser2 == 1) {
					add1 = rand.nextInt(29) + 11;
					problem = "$" + (add1 * 1000 + 2 * add1) + " - " + (2 * add2) + " = $";
					answer = add1 * 1000;
				}else if (chooser2 == 2) {
					add1 = rand.nextInt(29) + 11;
					problem = "$" + add1 + " \\times " + (2000 + differ2000) + " - " + add1 + " \\times " + (differ2000)+ " = $";
					answer = add1 * 2000;
				}
			}
		} else if (choose == i++) { // mixed numbers
			int chooser = rand.nextInt(2) + 1;
			if (chooser == 1) {
				int denom = rand.nextInt(3) + 3;
				int num = rand.nextInt(denom - 1) + 1;
				int wholeNum = rand.nextInt(7) + 4;
				problem = "$" + wholeNum + Simp.getFrac(num + "/" + denom, false) + " \\times" + wholeNum + Simp.getFrac((denom - num) + "/" + denom, false) + " $= ";
				fullAnswer = Frac.properMult((wholeNum + " " + num + "/" + denom), (wholeNum + " " + (denom - num) + "/" + denom));
			}else if (chooser == 2) {
				int denom = rand.nextInt(3) + 3;
				int num = rand.nextInt(denom - 1) + 1;
				int wholeNum = rand.nextInt(7) + 4;
				int scalar = rand.nextInt(2) + 2;
				problem = "$" + wholeNum + Simp.getFrac(num + "/" + denom, false) + "\\times" + wholeNum * scalar + Simp.getFrac(num + "/" + denom, false) + "  $= ";
				fullAnswer = Frac.properMult((wholeNum + " " + num + "/" + denom), (wholeNum * scalar + " " + num + "/" + denom));
			}
		} else if (choose == i++) { // special numbers
			int chooser = rand.nextInt(7) + 1;
			int convert = rand.nextInt(2) + 1;
			if (chooser == 1) {
				int multiplicand = 10 * rand.nextInt(2) + 27;
				if (convert == 1) {
					problem = "$" + 1073 + " \\div" + multiplicand + " =$ ?";
					answer = 1073 / multiplicand;
				}else if (convert == 2) {
					problem = "$37 \\cdot 27 =$ ?";
					answer = 1073;
				}
			}
			if (chooser == 2) {
				int multiplicand = 8 * rand.nextInt(2) + 29;
				if (convert == 1) {
					problem = "$" + 1073 + " \\div" + multiplicand + " = $ ?";
					answer = 1073 / multiplicand;
				}else if (convert == 2) {
					problem = "$37 \\cdot 29 =$ ?";
					answer = 1073;
				}
			}
			if (chooser == 4) {
				int multiplicand = 4 * rand.nextInt(2) + 3;
				if (convert == 1) {
					problem = "$10101 \\div" + multiplicand + " = $ ?";
					answer = 10101 / multiplicand;
				}else if (convert == 2) {
					problem = "$3367 \\cdot 3 =$ ?";
					answer = 10101;
				}
			}
			convert = rand.nextInt(3) + 1;
			if (chooser == 3) {
				int multiplicand = rand.nextInt(9) + 1;
				if (convert == 1) {
					problem = "$" + (1001 * multiplicand) + " \\div" + 13 + " = $ ?";
					answer = (1001 * multiplicand) / 13;
				}else if (convert == 2) {
					problem = "$" + (77 * multiplicand) + " \\cdot 13 =$ ?";
					answer = (77 * multiplicand) * 13;
				}else if (convert == 2) {
					problem = "$" + (13 * multiplicand) + " \\cdot 77 =$ ?";
					answer = (13 * multiplicand) * 77;
				}
			}
			if (chooser == 5) {
				if (convert == 1) {
					problem = "$10101 \\div 3 = $ ?";
					answer = 3367;
				}else if (convert == 2) {
					problem = "$3367 \\cdot 3 =$ ?";
					answer = 10101;
				}
				int multiplicand = 3 * (rand.nextInt(5) + 1);
				if (convert == 3) {
					problem = "$3367 \\cdot " + multiplicand + " =$ ?";
					answer = 3367 * multiplicand;
				}
			}
			if (chooser == 6) {
				int multiplicand = 7 * (rand.nextInt(3) + 1);
				if (convert == 1) {
					problem = "$10101 \\div 7 = $ ?";
					answer = 1443;
				}else if (convert == 2) {
					problem = "$1443 \\cdot 7 =$ ?";
					answer = 10101;
				}else if (convert == 3) {
					problem = "$1443 \\cdot " + multiplicand + " =$ ?";
					answer = 1443 * multiplicand;
				}
			}
			if (chooser == 7) {
				int multiplicand = 7 * (rand.nextInt(3) + 1);
				if (convert == 1) {
					problem = "$10010 \\div 7 = $ ?";
					answer = 1430;
				}else if (convert == 2) {
					problem = "$1430 \\cdot 7 =$ ?";
					answer = 10010;
				}else if (convert == 3) {
					problem = "$1430 \\cdot " + multiplicand + " =$ ?";
					answer = 1430 * multiplicand;
				}
			}
		} else if(choose == i++){//mixed numbers with fractional parts adding to 1
			int whole = rand.nextInt(9) + 3;
			int denom = rand.nextInt(17) + 5;
			int deviation = rand.nextInt(denom - 2) + 1;
			problem = "$" + (whole + Simp.getFrac(denom - deviation, denom, false) + " \\cdot " + whole + Simp.getFrac(deviation, denom, false) + "$ = ");
			fullAnswer = whole * (whole + 1) + Simp.getFrac(deviation * (denom - deviation) , denom, true);
		} else if(choose == i++){//other mixed numbers
			int whole1 = rand.nextInt(9) + 4;
			int whole2 = rand.nextInt(9) + 4;
			ArrayList<Integer> factors1 = PrimeDivisors.factor(whole1);
			ArrayList<Integer> factors2 = PrimeDivisors.factor(whole2);
			int denom1 = factors1.get(rand.nextInt(factors1.size() - 1) + 1);
			int denom2 = factors2.get(rand.nextInt(factors2.size() - 1) + 1);
			int num1 = rand.nextInt(denom1 - 1) + 1;
			int num2 = rand.nextInt(denom2 - 1) + 1;
			problem = "$" + whole1 + Simp.getFrac(num2, denom2, false) + "\\cdot" + whole2 + Simp.getFrac(num1, denom1, false) + "$";
		}
		int[] tricks = {111, 1111, 101};
		for(int a = 0; a < tricks.length; a++){
			if(choose == i++){
				int multiplicand = rand.nextInt(9990) + 10;
				while(String.valueOf(multiplicand).indexOf("0") != -1){
					multiplicand = rand.nextInt(9990) + 10;
				}
				problem = "$" + tricks[a] + " \\times " + multiplicand + "$";
				answer = tricks[a] * multiplicand;
			}
		}
		return problem;
	}

	public String getAns() {
		fullAnswer = String.valueOf(answer);
		return fullAnswer;
	}
}
