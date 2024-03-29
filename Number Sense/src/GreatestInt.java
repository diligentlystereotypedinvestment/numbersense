import java.util.ArrayList;
import java.util.Random;

public class GreatestInt {
	public static void gen(ArrayList<String> questions, ArrayList<String> answers, int i){
		Random rand = new Random();
		int length = rand.nextInt(3) + 1;
		int[] inner = new int[length];
		for(int a = 0; a < length; a++){
			//do{
				inner[a] = rand.nextInt(12) + 2;
			//} while(String.valueOf(Math.sqrt(inner[a])).length() < 4);
		}
		String addition = "f(\\sqrt{" + String.valueOf(inner[0]) + "})";
		for(int a = 1; a < length; a++){
			addition = addition + " + f(\\sqrt{" + inner[a] + "})";
		}
		questions.add("(" + i + ") Letting $f(x) = \\lfloor x \\rfloor, \\lfloor " + addition + "\\rfloor$ = ");
		int answer = 0;
		for(int a: inner){
			answer += (int)Math.sqrt(a);
		}
		answers.add(String.valueOf(answer));
	}

	public static void main(String[] args) {
ArrayList<String> questions = new ArrayList<String>();
	ArrayList<String> answers = new ArrayList<String>();
	int i = 0;
		gen(questions, answers,i);
	System.out.println(questions);
	}
}
