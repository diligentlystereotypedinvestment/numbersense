import java.util.ArrayList;
import java.util.Random;

public class AdvRemainders{
	private static Random rand = new Random();

	public static void gen(ArrayList<String> questions, ArrayList<String> answers, int i){
		int mod = rand.nextInt(9) + 4;
		int denom1 = rand.nextInt(mod - 1) + 1;
		int denom2 = rand.nextInt(mod - 1) + 1;
		int r1 = rand.nextInt(mod - 1) + 1;
		int r2 = rand.nextInt(mod - 1) + 1;
		questions.add("(" + i + ") If $" + Simp.getFrac(denom1, mod, false) + " = " + r1 + "$ mod " + mod + " and $" + Simp.getFrac(denom2, mod, false) + " = " + r2 + "$ mod " + mod + ", what is " + Simp.getFrac(denom1 * denom2, mod, true) + " mod " + mod + "?");
		answers.add(String.valueOf((denom1 * denom2) % mod));
		//problem with range
	}
}
