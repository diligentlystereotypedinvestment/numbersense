import java.util.Random;
import java.util.ArrayList;

public class Limit {
	private Function denom;
	private Function num;
	private String limit;
	private String ans;
	private static Random rand = new Random();

	public Limit(){
		int type = rand.nextInt(3); //Algebraic division, sub, infty, Maybe: L'Hopital Rule - I am thinking trig
		if(type == 0){//algebraic division
			Function r = new Function(1);
			Function s = new Function(1);
			num = r.multiply(s);
			if(rand.nextBoolean()){
				denom = r;
				limit = String.valueOf(-1 * r.getCoef(1));
				ans = limit + s.getCoef(1);
			} else{
				denom = s;
				limit = String.valueOf(-1 * s.getCoef(1));
				ans = limit + r.getCoef(1);
			}
		} else if(type == 1){//sub
			denom = new Function();
			num = new Function();
			limit = String.valueOf(rand.nextInt(15) - 7);
			ans = Simp.getFrac(num.eval(Integer.valueOf(limit)), denom.eval(Integer.valueOf(limit)), false);
		} else if(type == 2){//infty
			denom = new Function();
			int numDeg = rand.nextInt(denom.getDeg())  + 1;
			num = new Function();
			limit = "+\\infty";
			if(denom.getDeg() > num.getDeg()){
				ans = "0";
			} else{
				ans = Simp.getFrac(num.getCoef(0), denom.getCoef(0), false);
			}
		}

	}

	public String toString(){
		return "$\\lim_{x \\to " + limit +"} \\frac{" + num + "}{" + denom + "}";
	}

	public String getAns(){
		return ans;
	}

	public static void gen(ArrayList<String> questions, ArrayList<String> answers, int i){
		Limit lim = new Limit();
		questions.add(lim + "=?");
		answers.add(lim.getAns());
	}
}
