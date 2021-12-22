import java.util.ArrayList;
import java.util.Random;

public class OofO {
	private String question;
	private String answer;
	private int base;
	private static Random rand = new Random();

	public String exponent() {
		int base = rand.nextInt(6) + 3;
		int[] exponent = new int[3];
		for (int i = 0; i < 3; i++) {
			exponent[i] = rand.nextInt(10) + 2;
		}
		String question = "$" + base + "^{" + exponent[0] + "}";
		double solution = 0;
		for (int i = 1; i < 3; i++) {
			int mathsign = rand.nextInt(2);
			if (mathsign == 0) {
				question = question + "\\times" + base + "^{" + exponent[i] + "}";
				solution = exponent[i] + solution;
			} else
			if (mathsign == 1) {
				question = question + "\\div" + base + "^{" + exponent[i] + "}";
				solution = exponent[i] - solution;
			}
		}
		question = question + "= x$";
		answer = "If" + String.valueOf(solution) + ". then what is $log_{" + base + "} x$?";
		return question;
	}

	public static void baseGen(ArrayList<String> questions, ArrayList<String> answers, int i) {
		int sign = rand.nextInt(4);
		int first, second, base;
		do{
			base = rand.nextInt(12) + 2;
		} while(base == 10);
		if (sign == 0) { // addition
			first = rand.nextInt(100) + 40;
			second = rand.nextInt(100) + 40;
			questions.add("(" + i + ") $" + Baseconvert.newnum(first, base) + "_" + base + " + " + Baseconvert.newnum(second, base) + "_" + base + "= \\hrulefill_" + base + "$");
			answers.add(Baseconvert.newnum(first + second, base));
		} else
		if (sign == 1) { // subtraction
			first = rand.nextInt(100) + 40;
			second = rand.nextInt(100) + 40;
			if (second > first) {
				int temp = first;
				first = second;
				second = temp;
			}
			questions.add("(" + i + ") $" + Baseconvert.newnum(first, base) + "_" + base + " - " + Baseconvert.newnum(second, base) + "_" + base + "= \\hrulefill_" + base + "$");
			answers.add(Baseconvert.newnum(first - second, base));
		} else
		if (sign == 2) { // multiplication
			first = rand.nextInt(100) + 40;
			second = base - (rand.nextInt(base - 1) + 1);
			questions.add("(" + i + ") $" + Baseconvert.newnum(first, base) + "_" + base + " \\times " + Baseconvert.newnum(second, base) + "_" + base + "= \\hrulefill_" + base + "$");
			answers.add(Baseconvert.newnum(first * second, base));
		} else
		if (sign == 3) { // division
			second = base - (rand.nextInt(base - 1) + 1);
			first = (rand.nextInt(40) + 40) * second;
			questions.add("(" + i + ") $" + Baseconvert.newnum(first, base) + "_" + base + "\\div" + Baseconvert.newnum(second, base) + "_" + base + "= \\hrulefill_" + base + "$");
			answers.add(Baseconvert.newnum(first / second, base));
		}
	}

	public String getQuest() {
		return question;
	}

	public String getAns() {
		return Simp.getFrac(answer);
	}

	public void equation(Object type, Range add, Range mult, Range div, int length) {
		String leftSym = "(";
		String rightSym = ")";
		if(type instanceof Absolute){
			leftSym = "|";
			rightSym = "|";
		}
		String problem = leftSym + genOp(type, add, mult, div, true) + rightSym;
		for (int i = 0; i < length - 2; i++) {
			problem = leftSym + problem + genOp(type, add, mult, div, false) + rightSym;
		}
		question = problem;
	}

	public String genOp(Object type, Range add, Range mult, Range div, boolean first) {
		int operation = rand.nextInt(4);
		if(div.getUpper() == 0 && div.getLower() == 0){
			operation = rand.nextInt(3);
		}
		if (first) {
			if (operation == 0) {
				Object operand1 = random(type, add);
				Object operand2 = random(type, add);
				answer = adjust(type, Frac.add(toAns(operand1), toAns(operand2), false));
				return questAdj(type, operand1.toString()) + " + " + questAdj(type, operand2.toString());
			}
			if (operation == 1) {
				Object operand1 = random(type, add);
				Object operand2 = random(type, add);
				answer = adjust(type, Frac.sub(toAns(operand1), toAns(operand2), false));
				return questAdj(type, operand1.toString()) + " - " + questAdj(type, operand2.toString());
			}
			if (operation == 2) {
				Object operand1 = random(type, mult);
				Object operand2 = random(type, mult);
				answer = adjust(type, Frac.mult(toAns(operand1), toAns(operand2), false));
				return questAdj(type, operand1.toString()) + " \\times " + questAdj(type, operand2.toString());
			}
			if (operation == 3) {
				Object operand1 = random(type, div);
				Object operand2 = random(type, div);
				answer = adjust(type, Frac.div(toAns(operand1), toAns(operand2), false));
				return questAdj(type, operand1.toString()) + " \\div " + questAdj(type, operand2.toString());
			}
		}
		if (operation == 0) {
			Object nextOperand = random(type, add);
			answer = adjust(type, Frac.add(answer, toAns(nextOperand)));
			return " + " + questAdj(type, nextOperand.toString());
		}
		if (operation == 1) {
			Object nextOperand = random(type, mult);
			answer = adjust(type, Frac.mult(answer, toAns(nextOperand)));
			return " \\times " + questAdj(type, nextOperand.toString());
		}
		if (operation == 2) {
			Object nextOperand = random(type, add);
			answer = adjust(type, Frac.sub(answer, toAns(nextOperand)));
			return " - " + questAdj(type, nextOperand.toString());
		}
		if (operation == 3) {
			Object nextOperand = random(type, div);
			answer = adjust(type, Frac.div(answer, toAns(nextOperand), false));
			return " \\div " + questAdj(type, nextOperand.toString());
		}
		return "";
	}

	public String adjust(Object type, String reg){//adjusts answer for appropriate type
		if(type instanceof Absolute){
			if(reg.indexOf("-") != -1 && reg.indexOf("frac") != -1){
				return reg.substring(1);
			}
			return reg;
		} else{
			return reg;
		}
	}

	public String questAdj(Object type, String reg){
		if(type instanceof Baseconvert){
			return Baseconvert.newnum(Integer.valueOf(reg), base) + "_" + base;
		}
		return reg;
	}

	public void setBase(int base){
		this.base = base;
	}

	public Object random(Object type, Range randRange) {
		if (type instanceof Log) {
			return Log.random();
		}
		if (type instanceof Combin) {
			return Combin.random(randRange);
		}
		return randRange.gen();
	}

	public String toAns(Object unSolve) {
		if (unSolve instanceof Log) {
			return ((Log) unSolve).toAns();
		}
		if (unSolve instanceof Combin) {
			return String.valueOf(((Combin) unSolve).toAns());
		}
		if(unSolve instanceof Baseconvert){
			return String.valueOf(((Baseconvert) unSolve).toAns());
		}
		return unSolve.toString();
	}

	public static void main(String[] args) {
		OofO base = new OofO();
		base.setBase(5);
		base.equation(new Baseconvert(4, 5), new Range(0, 5), new Range(0,5), new Range(0,0), 4);
		System.out.println(base.getQuest() + ", " + base.getAns());
	}
}
