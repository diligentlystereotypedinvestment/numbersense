import java.util.ArrayList;
import java.util.Random;

class QUp80 {
	public void Gen(ArrayList<String> questions, ArrayList<String> answers, int i) {
		Random rand = new Random();
		int random = rand.nextInt(157) + 1;
		if (random < 137) {
			QUp70 questions70 = new QUp70();
			questions70.Gen(questions, answers, i);
		}
	}
}
