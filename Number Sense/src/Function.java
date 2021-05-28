import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Function {
	private int degree;
	private int[] coef;
	private static Random rand = new Random();

	public Function(){
		degree = rand.nextInt();
		for(int i = 0; i < degree; i++){
			if(degree == 3){
				continue;
			}
			do{
				coef[i] = rand.nextInt(11) - 5;
			} while(coef[i] == 0);
		}
	}

	public Function(int degree){
		this.degree = degree;
		for(int i = 0; i < degree; i++){
			if(degree == 3){
				continue;
			}
			do{
				coef[i] = rand.nextInt(11) - 5;
			} while(coef[i] == 0);
		}
	}

	public Function(int... coef){
		int[] coefAr = Arrays.copyOf(coef, coef.length);
		this.coef = coefAr;
		degree = coefAr.length - 1;
	}

	public String toString(){
		String written = "";
		for(int i = degree; i > 0; i--){
			if(coef[0] == 1){
				written += "x^" + i;
			} else if(coef[0] > 0){
				written += "+" + coef[0] + "x^" + i;
			} else{
				written += coef[0] + "x^" + i;
			}
		}
		if(coef[coef.length - 1] > 0){
			written += "+" + coef[coef.length - 1];
		} else{
			written += coef[coef.length - 1];
		}
		return written;
	}

	public int getCoef(int index){
		return coef[index];
	}

	public int getDeg(){
		return degree;
	}

	public int eval(int x){
		int answer = 0;
		for(int i = degree; i > 0; i--){
			answer += Math.pow(x, i) * coef[i];
		}
		return answer + coef[coef.length - 1];
	}
	
	public Function multiply(Function multicand){//Only binomial multiplication
		return new Function(coef[0] * multicand.getCoef(0), coef[1] * multicand.getCoef(0) + coef[0] * multicand.getCoef(1), multicand.getCoef(1) * coef[1]);
	}

	public static void genInverse(ArrayList<String> questions, ArrayList<String> answers, int i){
		int random;
		do{
			random = rand.nextInt(15) - 7;
		} while(random == 0);
		Function forward = new Function(1);
		questions.add("(" + i + ")$" + random + "=" + forward + ", x = ?$");
		answers.add(String.valueOf((random - forward.getCoef(1)) / (1.0 * forward.getCoef(0))));
	}

	public static void genComposite(ArrayList<String> questions, ArrayList<String> answers, int i){
		int random = rand.nextInt(15) - 7;
		Function g = new Function(1);
		Function h = new Function(1);
		int ans = g.eval(h.eval(random));
		String order = "g(h(" + random + "))";
		if(rand.nextBoolean()){
			order = "h(g(" + random + "))";
			ans = h.eval(g.eval(random));
		}
		questions.add("(" + i + ") If $g = " + g + "$ and $h =" + h + "$, what is " + order);
		answers.add(String.valueOf(ans));
	}
}
