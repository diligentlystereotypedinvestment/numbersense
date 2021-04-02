import java.util.Random;
import java.util.ArrayList;

public class ComplexNum {
	private String real;
	private String imaginary;

	public ComplexNum(String real, String imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public String getReal() {
		return real;
	}

	public String getImaginary() {
		return imaginary;
	}

	public static ComplexNum multiply(ComplexNum multiplicand1, ComplexNum multiplicand2) {
		ComplexNum product = new ComplexNum(
				String.valueOf(Integer.valueOf(multiplicand1.getReal()) * Integer.valueOf(multiplicand2.getReal())
					- Integer.valueOf(multiplicand1.getImaginary())
					* Integer.valueOf(multiplicand2.getImaginary())),
				String.valueOf(Integer.valueOf(multiplicand1.getReal()) * Integer.valueOf(multiplicand2.getImaginary())
					+ Integer.valueOf(multiplicand1.getImaginary()) * Integer.valueOf(multiplicand2.getReal())));
		return product;
	}

	public static ComplexNum divide(ComplexNum dividend, ComplexNum divisor) {
		/*
		complexNum product = complexNum.multiply(divisor, dividend);
		int denom = Integer.valueOf(multiply(dividend,
					new complexNum(dividend.getReal(), String.valueOf(-1 * Integer.valueOf(dividend.getImaginary())))).toString().substring(2));
		complexNum quotient = new complexNum(simplify.getFraction(product.getReal() + "/" + denom), simplify.getFraction(product.getReal() + "/" + denom));
		return quotient;
		*/
		int denom = (int)Math.pow(Integer.valueOf(dividend.getReal()), 2) - (int)Math.pow(Integer.valueOf(dividend.getImaginary()), 2);
		return new ComplexNum(Simp.getFraction(Integer.valueOf(divisor.getReal()) * Integer.valueOf(dividend.getReal()) + Integer.valueOf(divisor.getImaginary()) * Integer.valueOf(dividend.getImaginary()) + "/" + denom), Simp.getFraction(Integer.valueOf(dividend.getImaginary()) * Integer.valueOf(divisor.getReal()) - Integer.valueOf(dividend.getReal()) * Integer.valueOf(divisor.getImaginary()) + "/" + denom));
	}

	public static void gen(ArrayList<String> questions, ArrayList<String> answers, int i) {
		Random rand = new Random();
		ComplexNum multipl1 = new ComplexNum(String.valueOf(rand.nextInt(11) - 5),
				String.valueOf(rand.nextInt(11) - 5));
		ComplexNum multipl2 = new ComplexNum(String.valueOf(rand.nextInt(11) - 5),
				String.valueOf(rand.nextInt(11) - 5));
		ComplexNum product = ComplexNum.multiply(multipl1, multipl2);
		int solveFor = rand.nextInt(8);
		String question = "(" + i + ") If $(" + multipl1 + ")(" + multipl2 + " = a + bi$, what is ";
		if (solveFor == 0) { // a
			questions.add(question + "$a$?");
			answers.add(String.valueOf(product.getReal()));
		}
		if (solveFor == 1) { // b
			questions.add(question + "$b$?");
			answers.add(String.valueOf(product.getImaginary()));
		}
		if (solveFor == 2) { // a + b
			questions.add(question + "$a + b$?");
			answers.add(String.valueOf(Integer.valueOf(product.getReal()) + Integer.valueOf(product.getImaginary())));
		}
		if (solveFor == 3) { // a - b
			questions.add(question + "$a - b$?");
			answers.add(String.valueOf(Integer.valueOf(product.getReal()) - Integer.valueOf(product.getImaginary())));
		}
		// divide
		ComplexNum quotient = ComplexNum.divide(multipl1, multipl2);
		question = "(" + i + ") If $\\frac{" + multipl1 + "}{" + multipl2 + "} = a + bi$, what is ";
		if (solveFor == 4) { // a
			questions.add(question + "$a$?");
			answers.add(String.valueOf(quotient.getReal()));
		}
		if (solveFor == 5) { // b
			questions.add(question + "$b$?");
			answers.add(String.valueOf(quotient.getImaginary()));
		}
		if (solveFor == 6) { // a + b
			questions.add(question + "$a + b$?");
			answers.add(Frac.fracAdd(quotient.getReal() + "/" + 1, quotient.getImaginary()));
		}
		if (solveFor == 7) { // a - b
			questions.add(question + "$a - b$?");
			answers.add(Frac.fracSub(quotient.getReal() + "/" + 1, quotient.getImaginary()));
		}
	}

	public String toString() {
		/* I don't remember the purpose of this code
		boolean stringTest = false;
		for (int i = 0; i < 10; i++) {
			if (imaginary.indexOf(String.valueOf(i)) != -1) {
				stringTest = true;
			}
		}
		if (stringTest == false) {
		*/
			if (Integer.valueOf(imaginary) > 0) {
				return real + "+" + imaginary + "i";
			} else if (Integer.valueOf(imaginary) == 0) {
				return String.valueOf(real);
			} else {
				return real + "+" + imaginary + "i";
			}
		//}
		//return real + "+" + imaginary;
	}
}
