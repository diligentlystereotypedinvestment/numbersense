import java.util.ArrayList;
import java.util.Random;

class qUp80 {
	public void Gen(ArrayList<String> questions, ArrayList<String> answers, int i) {
		Random rand = new Random();
		int random = rand.nextInt(157) + 1;
		if (random < 137) {
			qUp70 questions70 = new qUp70();
			questions70.Gen(questions, answers, i);
		}
	}
}
