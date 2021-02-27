import java.util.Random;
import java.util.ArrayList;

public class complexNum{
	private String real;
	private String imaginary;

	public complexNum(String real, String imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}

	public String getReal(){
		return real;
	}

	public String getImaginary(){
		return imaginary;
	}

	public static complexNum multiply(complexNum multiplicand1, complexNum multiplicand2){
		complexNum product = new complexNum(String.valueOf(Integer.valueOf(multiplicand1.getReal()) * Integer.valueOf(multiplicand2.getReal()) - Integer.valueOf(multiplicand1.getImaginary()) * Integer.valueOf(multiplicand2.getImaginary())), String.valueOf(Integer.valueOf(multiplicand1.getReal()) * Integer.valueOf(multiplicand2.getImaginary()) + Integer.valueOf(multiplicand1.getImaginary()) * Integer.valueOf(multiplicand2.getReal())));
		return product;
	}

	public static complexNum divide(complexNum divisor, complexNum dividend){
		complexNum product = complexNum.multiply(divisor, dividend);
		int denom = Integer.valueOf(multiply(dividend, new complexNum(dividend.getReal(), String.valueOf(-1 * Integer.valueOf(dividend.getImaginary())))).toString());
		complexNum quotient = new complexNum(simplify.getFraction(product.getReal() + "/" + denom), simplify.getFraction(product.getReal() + "/" + denom));
		return quotient;
	}

	public static void gen(ArrayList<String> questions, ArrayList<String> answers, int i){
		Random rand = new Random();
		complexNum multipl1 = new complexNum(String.valueOf(rand.nextInt(11) - 5), String.valueOf(rand.nextInt(11) - 5));
		complexNum multipl2 = new complexNum(String.valueOf(rand.nextInt(11) - 5), String.valueOf(rand.nextInt(11) - 5));
		complexNum product = complexNum.multiply(multipl1, multipl2);
		int solveFor = rand.nextInt(8);
		String question = "(" + i + ") If $(" + product + ") = a + bi$, what is ";
		if(solveFor == 0){//a
			questions.add(question + "$a$?");
			answers.add(String.valueOf(product.getReal()));
		}
		if(solveFor == 1){//b
			questions.add(question + "$b$?");
			answers.add(String.valueOf(product.getImaginary()));
		}
		if(solveFor == 2){//a + b
			questions.add(question + "$a + b$?");
			answers.add(String.valueOf(Integer.valueOf(product.getReal()) + Integer.valueOf(product.getImaginary())));
		}
		if(solveFor == 3){//a - b
			questions.add(question + "$a - b$?");
			answers.add(String.valueOf(Integer.valueOf(product.getReal()) - Integer.valueOf(product.getImaginary())));
		}
		//divide
		complexNum quotient = complexNum.divide(multipl1, multipl2);
		if(solveFor == 4){//a
			questions.add(question + "$a$?");
			answers.add(String.valueOf(quotient.getReal()));
		}
		if(solveFor == 5){//b
			questions.add(question + "$b$?");
			answers.add(String.valueOf(quotient.getImaginary()));
		}
		if(solveFor == 6){//a + b
			questions.add(question + "$a + b$?");
			answers.add(String.valueOf(Integer.valueOf(quotient.getReal()) + Integer.valueOf(quotient.getImaginary())));
		}
		if(solveFor == 7){//a - b
			questions.add(question + "$a - b$?");
			answers.add(String.valueOf(Integer.valueOf(quotient.getReal()) - Integer.valueOf(quotient.getImaginary())));
		}
	}

	public String toString(){
		boolean stringTest = false;
		for(int i = 0; i < 10; i++){
			if(imaginary.indexOf(String.valueOf(i)) != -1){
				stringTest = true;
			}
		}
		if(stringTest == false){
			if(Integer.valueOf(imaginary) > 0){
				return real + "+" + imaginary + "i";
			} else if (Integer.valueOf(imaginary) == 0){
				return String.valueOf(real);
			}else{
				return real + " " + imaginary + "i";
			}
		}
		return real + "+" + imaginary;
	}
}
