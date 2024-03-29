import java.util.ArrayList;
import java.util.Random;

public class Log {
	private String base;
	private String argument;

	public Log(String base, String argument) {
		this.base = base;
		this.argument = argument;
	}

	public static Log random() {
		Random rand = new Random();
		String base = String.valueOf(rand.nextInt(9) + 3);
		String arg = String.valueOf(rand.nextInt(11) + 1);
		if (arg.equals("7")) {
			arg = "1/2";
		}
		if (arg.equals("8")) {
			arg = "1/3";
		}
		if (arg.equals("9")) {
			arg = "1/4";
		}
		if (arg.equals("10")) {
			arg = "2/3";
		}
		if (arg.equals("11")) {
			arg = "3/4";
		}
		if (base.equals("11")) { // e
			base = "e";
		}
		if (arg.equals("1")) {
			return new Log(base, base);
		}
		return new Log(base, base + "^{" + arg + "}");
	}

	public String getBase() {
		return base;
	}

	/*
	 * public String getArg () { if (argument.indexOf ("\\^") == -1) { return
	 * "1";//argument.substring(1, argument.length() - 1); } String[]eSplit =
	 * argument.split ("\\^"); return eSplit[1].substring (1, eSplit[1].length () -
	 * 1);
	 * 
	 * //if(argument.indexOf("e") != -1){ //String[] eSplit = argument.split("\\^");
	 * //return Double.valueOf(eSplit[1].substring(1, eSplit[1].length() - 1)); //}
	 * else { //String[] eSplit = argument.split("\\^"); //return
	 * Double.valueOf(eSplit[1].substring(1, eSplit[1].length() - 1)); //}
	 * 
	 * }
	 */

	public String toAns() {
		//still not too sure why we need this
		if (argument.indexOf("^") != -1 && argument.substring(0, argument.indexOf("^")).equals(base)) { // if base == argument base
			//if (argument.indexOf("^") != -1) {
				String[] eSplit = argument.split("\\^");
				return eSplit[1].substring(1, eSplit[1].length() - 1);
			//}
			/*else {
				return "1";
			}*/
		} else {
			return "1"; //nothing right now
		}
		/*
		 * if(toString().indexOf("e") != -1){ String[] eSplit = argument.split("\\^");
		 * return eSplit[1].substring(1, eSplit[1].length() - 1); } else{
		 * if(argument.indexOf("^") != -1){ String[] eSplit = argument.split("\\^");
		 * return eSplit[1].substring(1, eSplit[1].length() - 1); } else { return "1"; }
		 * } //return
		 * Math.log(Integer.valueOf(toAns()))/Math.log(Integer.valueOf(getBase()));
		 */
	}

	public static Log add(Log add1, Log add2) {
		if (add1.toString().indexOf("e") != -1) {
			return new Log(add1.getBase(), "e^" + Frac.mult(add1.toAns(), add2.toAns()));
		}
		return new Log(add1.getBase(), Frac.mult(add1.toAns(), add2.toAns()));
	}

	public static Log sub(Log add1, Log add2) {
		if (add1.toString().indexOf("e") != -1) {
			return new Log(add1.getBase(), "e^" + Frac.div(add1.toAns(), add2.toAns(), false));
		}
		return new Log(add1.getBase(), Frac.div(add1.toAns(), add2.toAns(), false));
	}

	public static void gen(ArrayList<String> questions, ArrayList<String> answers, int i) {
		Random rand = new Random();
		int problem = rand.nextInt(8);
		Log log1 = random();
		Log log2 = random();
		if (problem == 0) { // direct computation
		}
		if (problem == 1) { // add
			questions.add("(" + i + ") What is $" + log1 + " + " + log2 + "$?");
			answers.add(Frac.add(log1.toAns(), log2.toAns()));
		}
		if (problem == 2) { // sub
			questions.add("(" + i + ") What is $" + log1 + " - " + log2 + "$?");
			answers.add(Frac.sub(log1.toAns(), log2.toAns()));
		}
		if (problem == 3) { // mult
			questions.add("(" + i + ") What is $" + log1 + " \\times " + log2 + "$?");
			answers.add(Frac.mult(log1.toAns(), log2.toAns(), false));
		}
		if (problem == 4) { // div
			questions.add("(" + i + ") What is $" + log1 + " \\div" + log2 + "$?");
			answers.add(Frac.div(log1.toAns(), log2.toAns(), false));
		}
		if (problem == 5 || problem == 6 || problem == 7) { // OofO
			OofO logar = new OofO();
			logar.equation(new Log("1", "1"), new Range(1, 3), new Range(1, 3), new Range(1, 3), 2);
			questions.add("(" + i + ") $" + logar.getQuest() + "$");
			answers.add(logar.getAns());
		}
	}

	public String toString() {
		if (base.equals("e")) {
			return "\\ln " + argument;
		}
		return "\\log_{" + base + "}" + argument;

	}
}
