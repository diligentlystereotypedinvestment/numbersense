import java.util.Random;
import java.util.ArrayList;

class qUp60 {
	public void Gen(ArrayList<String> questions, ArrayList<String> answers, int i) {
		Random rand = new Random();
		int random = rand.nextInt(97) + 1;
		if(random == 1 || random == 2 || random == 3){//exponents
			OofO o = new OofO();
			questions.add("(" + i + ")" + o.exponent());
			answers.add(String.valueOf(o.outsolution));
		}

		if(random == 4 || random == 5 || random == 6){//polygons
			polygons shapes = new polygons();
			shapes.gen(questions, answers, i);
		}

		if(random == 7 || random == 8 || random == 9){
			rightTriangle.gen(questions, answers, i);
		}

		if(random == 10 || random == 11 || random == 12){
			sequences seq = new sequences();
			seq.questionGen(i);
			questions.add(seq.getQuestion());
			answers.add(seq.getAnswer());
		}
		if(random == 13 || random == 14 || random == 15){
			polygonalNumbers.gen(questions, answers, i);
		}

		if(random == 13 || random == 14 || random == 15){
			coord.gen(questions, answers, i);
		}

		if(random == 16 || random == 17 || random == 18){
			OofO.baseGen(questions, answers, i);
		}
		if (random < 46) {//older problems
			qUp40 questions40 = new qUp40();
			questions40.Gen(questions, answers, i);
		}

	}
}
