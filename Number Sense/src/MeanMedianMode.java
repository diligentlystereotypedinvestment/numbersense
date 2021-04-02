import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MeanMedianMode implements QuestionType{

	static Random rand = new Random();
	
	@Override
	public Question generateQuestion(int questionNumber) {
		ArrayList<Integer> integer = new ArrayList<>();
		int sum = 0;
		int choose = rand.nextInt(3) + 1;
		String question = "";
		String answer = "";
		String charseries = "";
		if (choose == 1) { // mean
			int length = rand.nextInt(4) + 2;
			for (int p = 0; p < length; p++) {
				integer.add(rand.nextInt(40) + 1);
				sum = integer.get(p) + sum;
			}
			for (int p = 0; p < integer.size(); p++) {
				charseries = (charseries + String.valueOf(integer.get(p)) + " , ");
			}
			question = ("(" + questionNumber + ") What is the mean of " + charseries);
			answer = String.valueOf(1.0 * sum / integer.size());
		} else if (choose == 2) { // median
			int length = rand.nextInt(4) + 3;
			for (int p = 0; p < length; p++) {
				integer.add(rand.nextInt(40) + 1);
				// sum = integer.get(p) + sum;
			}
			for (int p = 0; p < integer.size(); p++) {
				if (!(p == integer.size() - 1)) {
					charseries = (charseries + String.valueOf(integer.get(p)) + " , ");
				} else {
					charseries = (charseries + String.valueOf(integer.get(p)));
				}
			}
			Collections.sort(integer);
			double median;
			if (integer.size() % 2 == 0)
				median = (((double) integer.get(integer.size() / 2) + (double) integer.get(integer.size() / 2 - 1))
						/ 2);
			else {
				median = (double) integer.get(integer.size() / 2);
			}
			question = ("(" + questionNumber + ") What is the median of " + charseries);
			answer = String.valueOf(median);
		} else if (choose == 3) { // mode
			int length = rand.nextInt(3) + 6;
			for (int p = 0; p < length; p++) {
				integer.add(rand.nextInt(5) + 1);
				sum = integer.get(p) + sum;
			}
			for (int p = 0; p < integer.size(); p++) {
				charseries = (charseries + String.valueOf(integer.get(p)) + " , ");
			}
			question = ("(" + questionNumber + ") What is the mode of " + charseries);
			answer = String.valueOf(1.0 * getMode(integer));
		}
		
		return new Question(questionNumber, question, answer);
	}

	public static int getMode(ArrayList<Integer> array) {
		int mode = 0;
		int count = 0;

		for (int i = 0; i < array.size(); i++) {
			int x = array.get(i);
			int tempCount = 1;

			for (int e = 0; e < array.size(); e++) {
				int x2 = array.get(e);

				if (x == x2)
					tempCount++;

				if (tempCount > count) {
					count = tempCount;
					mode = x;
				}
			}
		}

		return mode;
	}
	
}
