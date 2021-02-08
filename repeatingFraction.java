import java.util.Random;

public class repeatingFraction {
	private String frac;
	private String deci;

	public void Gen(int i, ArrayList<String> questions, ArrayList<String> answers){
		Random rand = new Random();
		int denom = rand.nextInt(12) + 3;
		int num = rand.nextInt(denom - 2) + 1;
		fracOperations fraction = new fracOperations(num, denom);
		int choose = rand.nextInt(2);
		if(choose == 0){
			questions.add(i + ") What is $\\frac{" + num + "}{" + denom + "} as a decimal?");
			answers.add(fraction.toDeci());
		}
		if(choose == 1){
			questions.add(i + ") What is " + fraction.toDeci() + " as a decimal?");
			answers.add("$\\frac{" + num + "}{" + denom + "}");
		}
		/*denominator don't know why this is here*/ int chooser = rand.nextInt(9);
		/*
		if(chooser == 0{
			denom = 3;
			num = rand.nextInt(denom - 1) + 1;
			tempFrac = num + "/" + denom;
			frac = simplify.getFraction(num + "/" + denom);
			if(LCMandGCF.GCF(denom, num) != 1){

			}
		}
		if(chooser == 1){
			denom = 6;
			num = rand.nextInt(denom - 1) + 1;
			frac = simplify.getFraction(num + "/" + denom);
		}
		if(chooser == 2){
			denom = 9;
			num = rand.nextInt(denom - 1) + 1;
			frac = simplify.getFraction(num + "/" + denom);
		}
		if(chooser == 3){
			denom = 12;
			num = rand.nextInt(denom - 1) + 1;
			frac = simplify.getFraction(num + "/" + denom);
		}
		if(chooser == 4){
			denom = 15;
			num = rand.nextInt(denom - 1) + 1;
			frac = simplify.getFraction(num + "/" + denom);
		}
		if(chooser == 5){
			denom = 30;
			num = rand.nextInt(denom - 1) + 1;
			frac = simplify.getFraction(num + "/" + denom);
		}
		if(chooser == 6){
			denom = 90;
			num = rand.nextInt(denom - 1) + 1;
			frac = simplify.getFraction(num + "/" + denom);
		}
		if(chooser == 7){
			denom = 99;
			num = rand.nextInt(denom - 1) + 1;
			frac = simplify.getFraction(num + "/" + denom);
		}
		if(chooser == 8){
			denom = 11;
			num = rand.nextInt(denom - 1) + 1;
			frac = simplify.getFraction(num + "/" + denom);
		}
	*/
	}

	public String repeatingDeci(String frac){
		int denom = Integer.valueOf(frac.substring(frac.indexOf("/")));
		int num = Integer.valueOf(frac.substring(0, frac.indexOf("/")));
		if(denom == 3){
			return "$" + "0.\\overline{" + (int)(10.0 * num/denom) + "}";
		}
		if(denom == 6){
			return "$0.\\overline{" + (int)(100.0 * num/denom) + "}";
		}
		if(denom == 9){
			return "$0.\\overline{" + (int)(10.0 * num/denom) + "}";
		}
		if(denom == 11){
			return "$0.\\overline{" + (int)(100.0 * num/denom) + "}";
		}
		if(denom == 12){
			return "$0.\\overline{" + (int)(100.0 * num/denom) + "}";
		}
		if(denom == 15){
			return "$0.\\overline{\\overline{0." + (int)(10.0 * num/denom) + "}";
		}
		if(denom == 30){
			return "$\\overline{0." + (int)(10.0 * num/denom) + "}";
		}
		return "";
	}
}
