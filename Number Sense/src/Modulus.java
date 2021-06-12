import java.util.ArrayList;
import java.util.Random;

public class Modulus {
	private static Random rand = new Random();

	public static void gen(ArrayList<String> questions, ArrayList<String> answers, int questionNumber){
		String question = "";
		int length = rand.nextInt(3) + 2;
		boolean isFactorial;
		int answer = 0;
		int modulo = rand.nextInt(6) + 4;
		for(int i = 0; i < length - 1; i++){
			isFactorial = rand.nextBoolean();
			int random = rand.nextInt(5) + 1;
			if(isFactorial){
				question += random + "!" + " + ";
				answer += Factorial.fac(random);
			} else{
				question += random + " + ";
				answer += random;
			}
		}
		isFactorial = rand.nextBoolean();
		int random = rand.nextInt(5) + 1;
		if(isFactorial){
			question += random + "!";
			answer += Factorial.fac(random);
		} else{
			question += random;
			answer += random;
		}
		int equiv = rand.nextInt(8) + 3;
		questions.add("(" + questionNumber + ") $" + question + "\\equiv" + equiv + "\\pmod{" + modulo + "}$");
		answers.add(String.valueOf(answer % modulo));
	}
}
