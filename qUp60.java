import java.util.*;

class qUp60 {
	public void Gen(ArrayList<String> questions, ArrayList<String> answers, int i) {
		Random rand = new Random();
		int random = rand.nextInt(97) + 1;
		if(random == 1 || random == 2 || random == 3){//exponents
			OofO o = new OofO();
			questions.add("(" + i + " )" + o.exponent());
			answers.add(String.valueOf(o.outsolution));
		}
		if(random == 4 || random == 5 || random == 6){
			polygons shapes = new polygons();
			shapes.gen(questions, answers, i);
		}
		if (random < 46) {
			qUp40 questions40 = new qUp40();
			questions40.Gen(questions, answers, i);
		}
	}
}
