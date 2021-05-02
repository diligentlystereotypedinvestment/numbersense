import java.util.ArrayList;
import java.util.Random;

public class QUp70 {
	public void Gen(ArrayList<String> questions, ArrayList<String> answers, int i) {
		Random rand = new Random();
		int random = rand.nextInt(137) + 1;
		if(random == 1 || random == 2 || random == 3 || random == 4){
			MoreGeo.gen(questions, answers, i);
		} else

		if(random == 5 || random == 6 || random == 7 || random == 8){
			GreatestInt.gen(questions, answers, i);
		} else if(check(i, 9)){
			AdvRemainders.gen(questions, answers, i);
		}

		if (random < 97) {
			QUp60 questions60 = new QUp60();
			questions60.Gen(questions, answers, i);
		}
	}

	public static boolean check(int qNum, int questionType){
		for(int i = 0; i < 4; i++){
			questionType++;
			if(qNum == questionType){
				return true;
			}
		}
		return false;
	}
}
