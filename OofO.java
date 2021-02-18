import java.util.Random;
import java.util.ArrayList;

public class OofO {
	public double outsolution = 0;

	public String fstringmess() {
		Random rand = new Random();
		int Operations = rand.nextInt(3) + 2;
		double[] operands = new double[Operations];
		double solution = 0;
		for (int i = 0; i < Operations; i++) {
			operands[i] = rand.nextInt(15) + 1;
		}
		int mathsign = rand.nextInt(4) + 1;
		String firstmess = "";
		if (operands.length >= 2) {
			if (mathsign == 1) {
				firstmess = ("(" + String.valueOf(operands[0]) + "+" + String.valueOf(operands[1]) + ")");
				solution = operands[0] + operands[1];
			}
			if (mathsign == 2) {
				firstmess = ("(" + String.valueOf(operands[0]) + "-" + String.valueOf(operands[1]) + ")");
				solution = operands[0] - operands[1];
			}
			if (mathsign == 3) {
				firstmess = ("(" + String.valueOf(operands[0]) + "\\cdot" + String.valueOf(operands[1]) + ")");
				solution = operands[0] * operands[1];
			}
			if (mathsign == 4) {
				firstmess = ("(" + String.valueOf(operands[0]) + "\\div" + String.valueOf(operands[1]) + ")");
				solution = operands[0] / operands[1];
			}
		}
		String secondmess = "";
		mathsign = rand.nextInt(4) + 1;
		if (operands.length >= 3) {
			if (mathsign == 1) {
				secondmess = ("(" + firstmess + "+" + String.valueOf(operands[2]) + ")");
				solution = solution + operands[2];
			}
			if (mathsign == 2) {
				secondmess = ("(" + firstmess + "-" + String.valueOf(operands[2]) + ")");
				solution = solution - operands[2];
			}
			if (mathsign == 3) {
				secondmess = ("(" + firstmess + "\\cdot" + String.valueOf(operands[2]) + ")");
				solution = solution * operands[2];
			}
			if (mathsign == 4) {
				secondmess = ("(" + firstmess + "\\div" + String.valueOf(operands[2]) + ")");
				solution = solution / operands[2];
			}
		}
		String thirdmess = "";
		mathsign = rand.nextInt(4) + 1;
		int length = 3;
		if (operands.length >= (length + 1)) {
			if (mathsign == 1) {
				thirdmess = ("(" + secondmess + "+" + String.valueOf(operands[length]) + ")");
				solution = solution + operands[length];
			}
			if (mathsign == 2) {
				thirdmess = ("(" + secondmess + "-" + String.valueOf(operands[length]) + ")");
				solution = solution - operands[length];
			}
			if (mathsign == 3) {
				thirdmess = ("(" + secondmess + "\\cdot" + String.valueOf(operands[length]) + ")");
				solution = solution * operands[length];
			}
			if (mathsign == 4) {
				thirdmess = ("(" + secondmess + "\\div" + String.valueOf(operands[length]) + ")");
				solution = solution / operands[length];
			}
		}
		String fourthmess = "";
		mathsign = rand.nextInt(4) + 1;
		length = 4;
		if (operands.length >= (length + 1)) {
			if (mathsign == 1) {
				fourthmess = ("(" + secondmess + "+" + String.valueOf(operands[length]) + ")");
				solution = solution + operands[length];
			}
			if (mathsign == 2) {
				fourthmess = ("(" + secondmess + "-" + String.valueOf(operands[length]) + ")");
				solution = solution - operands[length];
			}
			if (mathsign == 3) {
				fourthmess = ("(" + secondmess + "\\cdot" + String.valueOf(operands[length]) + ")");
				solution = solution * operands[length];
			}
			if (mathsign == 4) {
				fourthmess = ("(" + secondmess + "\\div" + String.valueOf(operands[length]) + ")");
				solution = solution / operands[length];
			}
		}
		outsolution = solution;
		if (operands.length == 2) {
			return ("$" + String.valueOf(firstmess) + "$");
		}
		if (operands.length == 3) {
			return ("$" + String.valueOf(secondmess) + "$");
		}
		if (operands.length == 4) {
			return ("$" + String.valueOf(thirdmess) + "$");
		}
		if (operands.length == 5) {
			return ("$" + String.valueOf(fourthmess) + "$");
		}
		return "";
	}

	public String remainder() {
		Random rand = new Random();
		int Operations = 3;
		int[] operands = new int[Operations];
		double solution = 0;
		for (int i = 0; i < Operations; i++) {
			operands[i] = rand.nextInt(15);
		}
		int mathsign = rand.nextInt(4) + 1;
		String firstmess = "";
		if (operands.length >= 2) {
			if (mathsign == 1) {
				firstmess = ("(" + String.valueOf(operands[0]) + "+" + String.valueOf(operands[1]) + ")");
				solution = operands[0] + operands[1];
			}
			if (mathsign == 2) {
				firstmess = ("(" + String.valueOf(operands[0]) + "-" + String.valueOf(operands[1]) + ")");
				solution = operands[0] - operands[1];
			}
			if (mathsign == 3) {
				firstmess = ("(" + String.valueOf(operands[0]) + "\\cdot" + String.valueOf(operands[1]) + ")");
				solution = operands[0] * operands[1];
			}
			if (mathsign == 4) {
				firstmess = ("(" + String.valueOf(operands[0]) + "\\div" + String.valueOf(operands[1]) + ")");
				solution = operands[0] / operands[1];
			}
		}
		String secondmess = "";
		mathsign = rand.nextInt(4) + 1;
		if (operands.length >= 3) {
			if (mathsign == 1) {
				secondmess = ("(" + firstmess + "+" + String.valueOf(operands[2]) + ")");
				solution = solution + operands[2];
			}
			if (mathsign == 2) {
				secondmess = ("(" + firstmess + "-" + String.valueOf(operands[2]) + ")");
				solution = solution - operands[2];
			}
			if (mathsign == 3) {
				secondmess = ("(" + firstmess + "\\cdot" + String.valueOf(operands[2]) + ")");
				solution = solution * operands[2];
			}
			if (mathsign == 4) {
				secondmess = ("(" + firstmess + "\\div" + String.valueOf(operands[2]) + ")");
				solution = solution / operands[2];
			}
		}
		String thirdmess = "";
		mathsign = rand.nextInt(4) + 1;
		int length = 3;
		if (operands.length >= (length + 1)) {
			if (mathsign == 1) {
				thirdmess = ("(" + secondmess + "+" + String.valueOf(operands[length]) + ")");
				solution = solution + operands[length];
			}
			if (mathsign == 2) {
				thirdmess = ("(" + secondmess + "-" + String.valueOf(operands[length]) + ")");
				solution = solution - operands[length];
			}
			if (mathsign == 3) {
				thirdmess = ("(" + secondmess + "\\cdot" + String.valueOf(operands[length]) + ")");
				solution = solution * operands[length];
			}
			if (mathsign == 4) {
				thirdmess = ("(" + secondmess + "\\div" + String.valueOf(operands[length]) + ")");
				solution = solution / operands[length];
			}
		}
		String fourthmess = "";
		mathsign = rand.nextInt(4) + 1;
		length = 4;
		if (operands.length >= (length + 1)) {
			if (mathsign == 1) {
				fourthmess = ("(" + secondmess + "+" + String.valueOf(operands[length]) + ")");
				solution = solution + operands[length];
			}
			if (mathsign == 2) {
				fourthmess = ("(" + secondmess + "-" + String.valueOf(operands[length]) + ")");
				solution = solution - operands[length];
			}
			if (mathsign == 3) {
				fourthmess = ("(" + secondmess + "\\cdot" + String.valueOf(operands[length]) + ")");
				solution = solution * operands[length];
			}
			if (mathsign == 4) {
				fourthmess = ("(" + secondmess + "\\div" + String.valueOf(operands[length]) + ")");
				solution = solution / operands[length];
			}
		}
		outsolution = solution;
		if (operands.length == 2) {
			return ("$" + String.valueOf(firstmess) + "$");
		}
		if (operands.length == 3) {
			return ("$" + String.valueOf(secondmess) + "$");
		}
		if (operands.length == 4) {
			return ("$" + String.valueOf(thirdmess) + "$");
		}
		if (operands.length == 5) {
			return ("$" + String.valueOf(fourthmess) + "$");
		}
		return "";
	}

	public String exponent(){
		Random rand = new Random();
		int base = rand.nextInt(6) + 3;
		int[] exponent = new int[3];
		for (int i = 0; i < 3; i++) {
			exponent[i] = rand.nextInt(10) + 2;
		}
		String question = "$" + base + "^{" + exponent[0] + "}";
		double solution = 0;
		for(int i = 1; i < 3; i++){
			int mathsign = rand.nextInt(2);
			if(mathsign == 0){
				question = question + "\\times" + base + "^{" + exponent[i] + "}";
				solution = exponent[i] + solution;
			}
			if(mathsign == 1){
				question = question + "\\div" + base + "^{" + exponent[i] + "}";
				solution = exponent[i] - solution;
			}
		}
		question = question + "$";
		outsolution = solution;
		return question;
	}

	public static void baseGen(ArrayList<String> questions, ArrayList<String> answers, int i){
		Random rand = new Random();
		int sign = rand.nextInt(4);
		int first, second;
		int base = rand.nextInt(7) + 3;
		if(sign == 0){//addition
			first = rand.nextInt(100) + 40;
			second = rand.nextInt(100) + 40;
			questions.add("(" + i + ") $" + baseconvert.newnum(first, base) + "_" + base + " + " + baseconvert.newnum(second, base) + "_" + base + "= \\hrulefill_" + base + "$");
			answers.add(baseconvert.newnum(first + second, base));
		}
		if(sign == 1){//subtraction
			first = rand.nextInt(100) + 40;
			second = rand.nextInt(100) + 40;
			if(second > first){
				int temp = first;
				first = second;
				second = temp;
			}
			questions.add("(" + i + ") $" + baseconvert.newnum(first, base) + "_" + base + " - " + baseconvert.newnum(second, base) + "_" + base + "= \\hrulefill_" + base + "$");
			answers.add(baseconvert.newnum(first - second, base));
		}
		if(sign == 2){//multiplication
			first = rand.nextInt(100) + 40;
			second = base - (rand.nextInt(base - 1) + 1);
			questions.add("(" + i + ") $" + baseconvert.newnum(first, base) + "_" + base + " \\cdot " + baseconvert.newnum(second, base) + "_" + base + "= \\hrulefill_" + base + "$");
			answers.add(baseconvert.newnum(first * second, base));
		}
		if(sign == 3){//division
			second = base - (rand.nextInt(base - 1) + 1);
			first = (rand.nextInt(40) + 40) * second;
			questions.add("(" + i + ") $" + baseconvert.newnum(first, base) + "_" + base + "\\div" + baseconvert.newnum(second, base) + "_" + base + "= \\hrulefill_" + base + "$");
			answers.add(baseconvert.newnum(first / second, base));
		}
	}
}
