import java.util.Random;
import java.util.ArrayList;

public class RepeatingFraction {

	public static void gen(int i, ArrayList<String> questions, ArrayList<String> answers) {
		Random rand = new Random();
		int denom = rand.nextInt(997) + 3;
		int num = rand.nextInt(denom - 2) + 1;
		while (!Frac.repeating(num, denom) && String.valueOf(Frac.divide(num, denom)).length() > 15) {
			denom = rand.nextInt(997) + 3;
			num = rand.nextInt(denom - 2) + 1;
		}
		Frac fraction = new Frac(num, denom);
		questions.add("(" + i + ") What is $" + fraction.toDeci() + "$ as a fraction?");
		answers.add(fraction.toString());
	}

	public static void genBase(ArrayList<String> questions, ArrayList<String> answers, int i) {
		Random rand = new Random();
		int base = rand.nextInt(7) + 3;
		int denom = rand.nextInt((int)Math.pow(base, 3) - 3) + 3;
		int num = rand.nextInt(denom - 2) + 1;
		denom = Integer.valueOf(Baseconvert.newnum(denom, base));
		num = Integer.valueOf(Baseconvert.newnum(num, base));
		while (!Frac.repeating(num, denom) && String.valueOf(Frac.divide(num, denom)).length() > 15) {
			denom = Integer.valueOf(rand.nextInt(997) + 3);
			num = Integer.valueOf(rand.nextInt(denom - 2) + 1);
			denom = Integer.valueOf(Baseconvert.newnum(denom, base));
			num = Integer.valueOf(Baseconvert.newnum(num, base));
		}
		Frac fraction = new Frac(num, denom);
		questions.add("(" + i + ") What is $" + fraction.toDeci() + "_" + base + "$ as a fraction? \\hline $_" + base + "$");
		answers.add(fraction.toString());
	}
}
