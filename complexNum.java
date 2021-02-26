import java.util.Random;
import java.util.ArrayList;

public class complexNum{
	private int real;
	private int imaginary;

	public complexNum(int real, int imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}

	public int getReal(){
		return real;
	}

	public int getImaginary(){
		return imaginary;
	}

	public static complexNum multiply(complexNum multiplicand1, complexNum multiplicand2){
		complexNum product = new complexNum(multiplicand1.getReal() * multiplicand2.getReal() - multiplicand1.getImaginary() * multiplicand2.getImaginary(), multiplicand1.getReal() * multiplicand2.getImaginary() + multiplicand1.getImaginary() * multiplicand2.getReal());
		return product;
	}

	public static void gen(ArrayList<String> questions, ArrayList<String> answers, int i){
		Random rand = new Random();
		complexNum multipl1 = new complexNum(rand.nextInt(11) - 5, rand.nextInt(11) - 5);
		complexNum multipl2 = new complexNum(rand.nextInt(11) - 5, rand.nextInt(11) - 5);
		complexNum product = complexNum.multiply(multipl1, multipl2);
		int solveFor = rand.nextInt(2);
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
			answers.add(String.valueOf(product.getReal() + product.getImaginary()));
		}
		if(solveFor == 3){//a - b
			questions.add(question + "$a - b$?");
			answers.add(String.valueOf(product.getReal() - product.getImaginary()));
		}
	}

	public String toString(){
		if(imaginary > 0){
			return real + "+" + imaginary + "i";
		} else{
			return real + " " + imaginary + "i";
		}
	}
}
