import java.util.Random;
import java.util.ArrayList;

public class MinMax {
	private int answer;
	private static Random rand = new Random();
	private String askingFor;

	//0 - trig; 1 - quadratic
	public MinMax(int type){
		type = rand.nextInt(2);
		if(type == 0){
			answer = 0;
			askingFor = "minimum";
		} else if(type == 1){
			boolean isMin = rand.nextBoolean();
			if(isMin){
				answer = -1;
				askingFor = "minimum";
			} else{
				answer = 1;
				askingFor = "maximum";
			}
		}
	}

	public int getAnswer(){
		return answer;
	}

	public String getQuest(){
		return askingFor;
	}

	public static void gen(ArrayList<String> questions, ArrayList<String> answers, int i){
			int[] coeff = new int[4];
			for(int a = 0; a < 4; a++){
				do{
					coeff[a] = rand.nextInt(11) - 5;
				} while(coeff[a] == 0);
			}
			int type = rand.nextInt(2);
			MinMax minMax = new MinMax(type);
			if(type == 0){
				questions.add("What is the " + minMax.getQuest() + " value of $y = " + coeff[0] + "(" + coeff[1] + "x + " + coeff[2] + ")^2 + " + coeff[3] + "?");
				answers.add(String.valueOf(coeff[3]));
			} else if(type == 1){
				boolean isSine = rand.nextBoolean();
				if(isSine){
					questions.add("What is the " + minMax.getQuest() + " value of $y = " + coeff[0] + "sin(" + coeff[1] + "x + " + coeff[2] + ") + " + coeff[3] + "$?");
				} else{
					questions.add("What is the " + minMax.getQuest() + " value of $y = " + coeff[0] + "cos(" + coeff[1] + "x + " + coeff[2] + ") + " + coeff[3] + "$?");
				}
				answers.add(String.valueOf(coeff[0] * minMax.getAnswer() + coeff[3]));
			}
	}
}
