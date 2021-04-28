import java.util.ArrayList;
import java.util.Random;

public class QUp80 {

	public void Gen(ArrayList<String> questions, ArrayList<String> answers, int i) {
		Random rand = new Random();
		int random = rand.nextInt(157) + 1;
		int questionType = -1;
		if(check(i, questionType)){
			MinMax.gen(questions, answers, i);
		}
		if (random < 137) {
			QUp70 questions70 = new QUp70();
			questions70.Gen(questions, answers, i);
		}
	}

	public static boolean check(int qNum, int questionType){
		for(int i = 0; i < 5; i++){
			questionType++;
			if(qNum == questionType){
				return true;
			}
		}
		return false;
	}
}
