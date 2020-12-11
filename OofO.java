import java.util.Random;

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
		String finalmess = "";
		outsolution = solution;
		if (operands.length == 2) {
			return (String.valueOf(firstmess) + "$");
		}
		if (operands.length == 3) {
			return (String.valueOf(secondmess) + "$");
		}
		if (operands.length == 4) {
			return (String.valueOf(thirdmess) + "$");
		}
		if (operands.length == 5) {
			return (String.valueOf(fourthmess) + "$");
		}
		return finalmess;

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
		String finalmess = "";
		outsolution = solution;
		if (operands.length == 2) {
			return (String.valueOf(firstmess) + "$");
		}
		if (operands.length == 3) {
			return (String.valueOf(secondmess) + "$");
		}
		if (operands.length == 4) {
			return (String.valueOf(thirdmess) + "$");
		}
		if (operands.length == 5) {
			return (String.valueOf(fourthmess) + "$");
		}
		return finalmess;

	}
}
