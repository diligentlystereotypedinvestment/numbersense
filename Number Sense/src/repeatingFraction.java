import java.util.Random;
import java.util.ArrayList;

public class repeatingFraction {

	public static void gen(int i, ArrayList<String> questions, ArrayList<String> answers) {
		Random rand = new Random();
		int denom = rand.nextInt(997) + 3;
		int num = rand.nextInt(denom - 2) + 1;
		while (!frac.repeating(num, denom)
				&& String.valueOf(frac.divide(num, denom)).length() > 15) {
			denom = rand.nextInt(997) + 3;
			num = rand.nextInt(denom - 2) + 1;
		}
		frac fraction = new frac(num, denom);
		questions.add("(" + i + ") What is $" + fraction.toDeci() + "$ as a fraction?");
		answers.add(fraction.toString());
	}

}
