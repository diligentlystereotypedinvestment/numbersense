import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Function {
	private int degree;
	private int[] coef;
	private Frac[] iCoef;
	private static Random rand = new Random();

	public void integrate(){
		int index = 0;
		for(int i = degree; i >= 0; i--){
			iCoef[index] = Simp.getFrac(new Frac(coef[index] + "/" + (i + 1)));
		}
	}

	public Frac evalIntegral(int x){
		Frac sum = new Frac(Frac.verifyFrac(Frac.mult((int)Math.pow(x, degree + 1) + "/" + 1, iCoef[0].toString(false))));
		int tempDegree = degree;
		for(int i = 1; i < coef.length; i++){
			sum = new Frac(Frac.verifyFrac(Frac.add(sum.toString(false), Frac.mult((int)Math.pow(x, tempDegree) + "/" + 1, iCoef[i].toString(false)))));
			tempDegree--;
		}
		return sum;
	}

	public Frac evalDef(int upper, int lower){
		integrate();
		return new Frac(Frac.verifyFrac(Frac.sub(evalIntegral(upper).toString(false), evalIntegral(lower).toString(false))));
	}

	public Function derivative(){
		int[] derivative = new int[degree];
		int index = 0;
		for(int i = derivative.length - 1; i > 0; i++){
			derivative[index] = coef[index] * i;
		}
		return new Function(derivative);
	}

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
		coef = new int[degree + 1];
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

	public Function(int[] coef){
		coef = this.coef;
		degree = coef.length - 1;
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
			answer += (int)Math.pow(x, i) * coef[i];
		}
		return answer + coef[coef.length - 1];
	}
	
	public Function multiply(Function multicand){//Only binomial multiplication
		return new Function(new int[] {coef[0] * multicand.getCoef(0), coef[1] * multicand.getCoef(0) + coef[0] * multicand.getCoef(1), multicand.getCoef(1) * coef[1]});
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

	public static void genIntegral(ArrayList<String> questions, ArrayList<String> answers, int i){
		Function f = new Function();
		int upper = rand.nextInt(11) - 5;
		int lower = rand.nextInt(11) - 5;
		questions.add("(" + i + ") If $f(x) = " + f + ", $ then what is $\\int_{" + lower + "}^{" + upper + "} " + f + "dx$?");
		answers.add(f.evalDef(upper, lower).toString());
	}

	public static void genDerivative(ArrayList<String> questions, ArrayList<String> answers, int i){
		Function f = new Function();
		int x = rand.nextInt(11) - 5;
		questions.add("(" + i + ") If $f(x) = " + f + ", $ then what is $f'(" + x + ")?$");
		answers.add(String.valueOf(f.derivative().eval(x)));
	}
}
