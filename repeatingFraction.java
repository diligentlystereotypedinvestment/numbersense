import java.util.Random;
import java.util.ArrayList;

public class repeatingFraction {
	private String frac;
	private String deci;

	public void gen(int i, ArrayList<String> questions, ArrayList<String> answers){
		Random rand = new Random();
		int denom = rand.nextInt(997) + 3;
		int num = rand.nextInt(denom - 2) + 1;
		fracOperations fraction = new fracOperations(num, denom);
		questions.add(i + ") What is " + fraction.toDeci() + " as a fraction?");
		answers.add(fraction.toString());
	}
}
