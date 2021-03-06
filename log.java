import java.util.ArrayList;
import java.util.Random;

public class log{
	private String base;
	private String argument;

	public log(String base, String argument){
		this.base = base;
		this.argument = argument;
	}

	public static log random(){
		Random rand = new Random();
		String base = String.valueOf(rand.nextInt(9) + 3);
		String arg = String.valueOf(rand.nextInt(12) + 1);
		if(arg.equals("7")){
			arg = "1/2";
		}
		if(arg.equals("8")){
			arg = "1/3";
		}
		if(arg.equals("9")){
			arg = "1/4";
		}
		if(arg.equals("10")){
			arg = "2/3";
		}
		if(arg.equals("11")){
			arg = "3/4";
		}
		if(arg.equals("12")){//e
			base = "e";
		}
		return new log(base, base + "^" + arg);
	}

	public String getBase(){
		return base;
	}

	public double getArg(){
		if(argument.indexOf("e") != -1){
			String[] eSplit = argument.split("\\^");
			return Double.valueOf(eSplit[1]);
		}
		return Double.valueOf(argument);
	}

	public String toAns(){
		if(toString().indexOf("e") != -1){
			String[] eSplit = argument.split("\\^");
			return eSplit[1];
		}
		if(argument.indexOf("^") != -1){
			String[] split = argument.split("\\^");
			return split[1];
		} else {
			return "";
		}
		//return Math.log(Integer.valueOf(getArg()))/Math.log(Integer.valueOf(getBase()));
	}

	public static log add(log add1, log add2){
		if(add1.toString().indexOf("e") != -1){
			return new log(add1.getBase(), "e^" + add1.getArg() * add2.getArg());
		}
		return new log(add1.getBase(), String.valueOf(add1.getArg() * add2.getArg()));
	}

	public static log sub(log add1, log add2){
		if(add1.toString().indexOf("e") != -1){
			return new log(add1.getBase(), "e^" + add1.getArg() / add2.getArg());
		}
		return new log(add1.getBase(), String.valueOf(add1.getArg() / add2.getArg()));
	}

	public static void gen(ArrayList<String> questions, ArrayList<String> answers, int i){
		Random rand = new Random();
		int problem = rand.nextInt(8);
		log log1 = random();
		log log2 = random();
		if(problem == 0){//direct computation
		}
		if(problem == 1){//add
			questions.add("(" + i + ") What is $" + log1 + " + " + log2 + "$?");
			answers.add((log.add(log1, log2).toAns()));
		}
		if(problem == 2){//sub
			questions.add("(" + i + ") What is $" + log1 + " - " + log2 + "$?");
			answers.add((log.sub(log1, log2).toAns()));
		}
		if(problem == 3){//mult
			questions.add("(" + i + ") What is $" + log1 + " \\cdot " + log2 + "$?");
			answers.add(fracOperations.fracMult(log1.toAns(), log2.toAns(), false));
		}
		if(problem == 4){//div
			questions.add("(" + i + ") What is $" + log1 + " \\div" + log2 + "$?");
			answers.add(fracOperations.fracDivide(log1.toAns(), log2.toAns(), false));
		}
		if(problem == 5 || problem == 6 || problem == 7){//OofO
		}
	}

	public String toString(){
		if(base.equals("e")){
			return "$\\ln " + argument;
		}
		return "\\log_{" + base + "}" + argument;
			
	}
}
