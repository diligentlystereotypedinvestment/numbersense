import java.util.Random;

public class sequences {

	private String question;
	private String answer;

	public void questionGen(int i) { // reciprocals of triangle numbers, general arithmetic, geometric, even, odd,
		// square, cube, alternating square, first m integers
		Random rand = new Random();
		int choose = rand.nextInt(9) + 1;
		if (choose == 1) { // first m integers
			int length = rand.nextInt(30) + 10;
			question = ("(" + i + ") 1 + 2 + 3 + \\ldots " + length + " = ");
			answer = String.valueOf((length * (length + 1)) / 2);
		}
		if (choose == 2) { // first m even integers
			int length = rand.nextInt(15) + 5;
			question = ("(" + i + ") 2 + 4 + 6 + \\ldots " + length * 2 + " = ");
			answer = String.valueOf(length * (length + 1));
		}
		if (choose == 3) { // first m odd integers
			int length = 2 * (rand.nextInt(15) + 5) + 1;
			question = ("(" + i + ") 1 + 3 + 5 + \\ldots " + length + " = ");
			answer = String.valueOf((int) Math.pow((length - 1) / 2, 2));
		}
		if (choose == 4) { // general arithmetic
			int length = rand.nextInt(3) + 5;
			int interval = rand.nextInt(7) + 3;
			int beginning = rand.nextInt(15) + 3;
			int finalnum = (interval * (length - 1) + beginning);
			question = ("(" + i + ") " + beginning + " + " + (interval + beginning) + " + " + (interval * 2 + beginning)
					+ " + \\ldots " + finalnum + " = ");
			answer = String.valueOf(((finalnum + beginning) / 2) * ((finalnum - beginning) / interval + 1));
		}
		if (choose == 5) { // geometric
			int denom = rand.nextInt(3) + 2;
			int num = rand.nextInt(denom - 1) + 1;
			int beginning = rand.nextInt(16) + 1;
			question = ("(" + i + ") " + beginning + " + " + simplify.getFraction((num * beginning) + "/" + denom)
					+ " + "
					+ simplify.getFraction((int) (Math.pow(num, 2) * beginning) + "/" + (int) Math.pow(denom, 2))
					+ " + \\ldots = ");
			answer = fracOperations.fracMult(beginning + "/1", denom + "/" + (denom - num));
		}
		if (choose == 6) { // first m squares
			int length = rand.nextInt(3) + 5;
			question = ("(" + i + ") 1 + 4 + 9 + \\ldots " + (int) Math.pow(length, 2) + " = ");
			answer = String.valueOf((length * (length + 1) * (2 * length + 1)) / 6);
		}
		if (choose == 7) { // first m cubes
			int length = rand.nextInt(5) + 5;
			question = ("(" + i + ") 1 + 8 + 27 + \\ldots " + (int) Math.pow(length, 3) + " = ");
			answer = String.valueOf((int) Math.pow((length * (length + 1)) / 2, 2));
		}
		if (choose == 8) { // first m squares
			int length = rand.nextInt(3) + 5;
			int sign = rand.nextInt(2) + 1;
			if (sign == 0) { // first sign positive
				if (length % 2 == 0) {
					question = ("(" + i + ") 1 + 4 - 9 + \\ldots + " + (int) Math.pow(length, 2) + " = ");
					answer = String.valueOf(length * (length + 1) / 2);
				} else {
					question = ("(" + i + ") 1 + 4 - 9 + \\ldots - " + (int) Math.pow(length, 2) + " = ");
					answer = String.valueOf(-1 * length * (length + 1) / 2);
				}
			} else {
				if (length % 2 == 0) {
					question = ("(" + i + ") 1 - 4 + 9 - \\ldots - " + (int) Math.pow(length, 2) + " = ");
					answer = String.valueOf(-1 * (length * (length + 1) / 2));
				} else {
					question = ("(" + i + ") 1 - 4 + 9 - \\ldots + " + (int) Math.pow(length, 2) + " = ");
					answer = String.valueOf(length * (length + 1) / 2);
				}

			}
		}
		if (choose == 9) { // triangle reciprocals
			int length = rand.nextInt(2) + 5;
			int initial = rand.nextInt(3) + 1;
			question = ("$" + simplify.getFraction("1/" + (initial * (initial + 1) / 2), true));
			for (int ii = initial + 1; ii < initial + length; ii++) {
				question = question + " + \\frac{1}{" + String.valueOf(ii * (ii + 1) / 2) + "}";
			}
			question = "(" + i + " ) " + question + " = $";
			answer = (fracOperations.fracSub("2/" + initial, "2/" + (initial + length)));
		}
	}

	public String getQuestion() {
		return question;
	}

	public String getAnswer() {
		return answer;
	}

}
