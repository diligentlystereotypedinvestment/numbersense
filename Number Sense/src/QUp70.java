import java.util.ArrayList;
import java.util.Random;

public class QUp70 {
	public void Gen(ArrayList<String> questions, ArrayList<String> answers, int i) {
		Random rand = new Random();
		int random = rand.nextInt(137) + 1;
		if (random < 97) {
			QUp60 questions60 = new QUp60();
			questions60.Gen(questions, answers, i);
		}
	}
}
