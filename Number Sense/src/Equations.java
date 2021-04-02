import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Equations {

	public static void gen(int i, ArrayList<String> questions, ArrayList<String> answers) {
		Random rand = new Random();
		char variable1 = (char) (rand.nextInt(26) + 97);
		char variable2 = (char) (rand.nextInt(26) + 97);
		while (variable2 == (variable1)) {
			variable2 = (char) (rand.nextInt(26) + 97);
		}
		int variableVal = rand.nextInt(14) + 3;
		int choose = rand.nextInt(2);
		int[] coef = { rand.nextInt(14) - 5, rand.nextInt(14) - 5, rand.nextInt(14) - 5 };
		for (int a = 0; a < coef.length; a++) {
			while (coef[a] == 0) {
				coef[a] = rand.nextInt(14) - 5;
			}
		}
		// System.out.println(Arrays.toString(coef) +
		// "asdasdasdasdasatwetsrwrsegsdgbfhrtwetrdgdsgsg");
		int signRand = rand.nextInt(2);
		char sign = '+';
		if (signRand == 1) {
			sign = '-';
		}
		if (choose == 0) { // two variable with one being substituted
			questions.add("(" + i + ") What is the value of $" + variable1 + " $ if $" + coef[0] + variable1 + " = "
					+ coef[1] + variable2 + " " + sign + " " + coef[2] + "$ and $" + variable2 + " = " + variableVal
					+ "$?");
			answers.add(Simp.getFraction((variableVal * coef[1] + coef[2]) + "/" + coef[0]));
		}
		if (choose == 1) { // one variable
			questions.add("(" + i + ") What is the value of $" + variable1 + "$ if $" + coef[0] + " = " + coef[1]
					+ variable1 + " " + sign + " " + coef[2] + "$?");
			if (sign == '+') {
				answers.add(Simp.getFraction((coef[0] + coef[2]) + "/" + coef[1]));
			} else {
				answers.add(Simp.getFraction((coef[0] - coef[2]) + "/" + coef[1]));
			}
		}
	}

	public static void genInequal(int i, ArrayList<String> questions, ArrayList<String> answers) {
		Random rand = new Random();
		char variable = (char) (rand.nextInt(26) + 97);
		// char variable2 = (char)(rand.nextInt(26) + 97);
		// while(variable2 == (variable1)){
		// variable2 = (char)(rand.nextInt(26) + 97);
		// }
		String direction = "";
		int directionChoose = rand.nextInt(4);
		if (directionChoose == 0) {
			direction = ">";
		}
		if (directionChoose == 1) {
			direction = "<";
		}
		if (directionChoose == 2) {
			direction = "\\geq";
		}
		if (directionChoose == 3) {
			direction = "\\leq";
		}
		// int variableVal = rand.nextInt(14) + 3;
		int[] coef = { rand.nextInt(14) - 5, rand.nextInt(14) - 5, rand.nextInt(14) - 5 };
		for (int a = 0; a < coef.length; a++) {
			while (coef[a] == 0) {
				coef[a] = rand.nextInt(14) - 5;
			}
		}
		String question = "(" + i + ") $" + coef[0] + variable + " + " + coef[1] + direction + coef[2] + ", " + variable;
		if (coef[0] < 0 && directionChoose == 0) {
			questions.add(question + "<$");
		}
		if (coef[0] < 0 && directionChoose == 1) {
			questions.add(question + ">$");
		}
		if (coef[0] < 0 && directionChoose == 2) {
			questions.add(question + "\\leq$");
		}
		if (coef[0] < 0 && directionChoose == 3) {
			questions.add(question + "\\geq$");
		}
		answers.add(Simp.getFraction((coef[2] - coef[1]) + "/" + coef[0]));
	}
}
