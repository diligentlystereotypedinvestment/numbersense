import java.util.ArrayList;
import java.util.Random;

public class binomialTheorem{
	public static void gen(ArrayList<String> questions, ArrayList<String> answers, int i){
		Random rand = new Random();
		int problem = rand.nextInt(2);
		int[] coef = {rand.nextInt(5) + 1, rand.nextInt(5) + 1};
		int signChoose = rand.nextInt(2);
		int power = rand.nextInt(5) + 3;
		String sign = "-";
		String inside = "";
		if(signChoose == 0){
			sign = "+";
		}
		if(coef[0] == 1 && coef[1] != 1){
			inside = "x"  + coef[1] + sign + "y";
		} else if(coef[0] != 1 && coef[1] == 1){
			inside = coef[0] + "x" + sign + "y";
		} else if(coef[0] == 1 && coef[1] == 1){
			inside = "x"  + sign + "y";
		} else{
			inside = coef[0] + "x" + sign + coef[1] + "y";
		}	
		if(problem == 0){//sum of coefs
			questions.add("(" + i + ") What is the sum of the coefficients of $(" + inside + ")^" + power + "$?");
			answers.add(String.valueOf(Math.pow(coef[0] + coef[1], power)));
		}
		if(problem == 1){
			int term = rand.nextInt(power + 1) + 1;
			String superscript = "";
			if(term == 1){
				superscript = "st";
			}
			if(term == 2){
				superscript = "nd";
			}
			if(term == 3){
				superscript = "rd";
			} else{
				superscript = "th";
			}
			questions.add("(" + i + ") What is the $" + term + "^{" + superscript + "}$ in the expansion of $(" + inside + ")^" + power + "$?");
			answers.add(String.valueOf(factorial(power) / factorial(term + 1)));
		}
	}
	
	public static int factorial(int f){
		int product = 1;
		for(int i = 1; i <= f; i++){
			product *= i;
		}
		return product;
	}
}
