import java.util.ArrayList;
import java.util.Random;

public class equations{

	public static void gen(int i, ArrayList<String> questions, ArrayList<String> answers){
        Random rand = new Random();
		char variable1 = (char)(rand.nextInt(26) + 97);
		char variable2 = (char)(rand.nextInt(26) + 97);
		while(variable2 == (variable1)){
			variable2 = (char)(rand.nextInt(26) + 97);
		}
		int variableVal = rand.nextInt(14) + 3;
		int choose = rand.nextInt(2);
		int[] coef = {rand.nextInt(8) + 2, rand.nextInt(8) + 2, rand.nextInt(8) + 2};
		int signRand = rand.nextInt(2);
		char sign = '+';
		if(signRand == 1){
			sign = '-';	
		}
		if(choose == 0){//two variable with one being substituted
			questions.add("(" + i + ") What is the value of $" + variable1 + " $ if $" + coef[0] + variable1 + " = " + coef[1] + variable2 + " " + sign + " " + coef[2] + "$ and $" + variable2 + " = " + variableVal + "$?");
			answers.add(simplify.getFraction((variableVal * coef[1] + coef[2]) + "/" + coef[0]));
		}
		if(choose == 1){//one variable
			questions.add("(" + i + ") What is the value of $" + variable1 + "$ if $" + coef[0] + " = " + coef[1] + variable1 + " " + sign + " " + coef[2] + "$?");
			if(sign == '+'){
				answers.add(simplify.getFraction((coef[0] + coef[2]) + "/" + coef[1]));
			} else {
				answers.add(simplify.getFraction((coef[0] - coef[2]) + "/" + coef[1]));
			}
		}
	}
}
