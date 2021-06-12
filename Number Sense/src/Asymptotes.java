import java.util.ArrayList;
import java.util.Random;

public class Asymptotes {
	private static Random rand = new Random();

	public static void gen(ArrayList<String> questions, ArrayList<String> answers, int i){//intersection of horizontal and vertical, sum the pair, num of asymptote counter
		String ans;
		boolean isHorizontal = rand.nextBoolean();
		Function denom;
		Function num;
		if(isHorizontal){
			denom = new Function(1);
			int numDeg = rand.nextInt(denom.getDeg())  + 1;
			num = new Function(numDeg);
			if(denom.getDeg() > num.getDeg()){
				ans = "0";
			} else{
				ans = Simp.getFrac(num.getCoef(0), denom.getCoef(0), false);
			}
			questions.add("(" + i + ") What is the horizontal asymptote of $\\frac{" + num + "}{" + denom + "}$?");
			answers.add(ans);
		} else{
			Function r = new Function(1);
			Function s = new Function(1);
			num = r.multiply(s);
			num.changeCoef(num.getDeg(), num.getCoef(num.getDeg()) + 1);
			if(rand.nextBoolean()){
				denom = r;
				ans = String.valueOf(r.getCoef(1));
			} else{
				denom = s;
				ans = String.valueOf(s.getCoef(1));
			}
			questions.add("(" + i + ") What is the vertical asymptote of $\\frac{" + num + "}{" + denom + "}$?");
			answers.add(ans);
		}
	}
}
