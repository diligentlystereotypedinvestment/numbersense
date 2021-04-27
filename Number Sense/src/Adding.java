import java.util.Random;
//import java.util.Scanner;

public class Adding implements QuestionType{
	static Random rand = new Random();

	@Override
	public Question generateQuestion(int i) {
		//Scanner scan = new Scanner(System.in);
		String answer = "";
		String question = "";
		int rand1_1 = rand.nextInt(16);
		//rand1_1 = scan.nextInt();
		if(rand1_1 == 0){//adding reverses
			int length = rand.nextInt(2) + 3;
			int[] digits = new int[length];
			int norm = 0;
			int reverse = 0;
			for(int a = 0; a < length; a++){
				digits[a] = rand.nextInt(9) + 1;
				norm += (int) Math.pow(10, length - a - 1) * digits[a];
				reverse += (int) Math.pow(10, a) * digits[a];
			}
			question = "(" + i + ") " + norm + " + " + reverse + " = ";
			answer = String.valueOf(norm + reverse);
		} else if (rand1_1 == 1) { // addition of two integers
			Addition add1 = new Addition();
			answer = (EliminateZero.zero(add1.sum));
			question = ("(" + i + ") $" + add1.num1 + "+" + add1.num2 + " = $");
			// System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 2) { // addition of two mixed numbers
			Addmix addmix = new Addmix();
			answer = (String.valueOf(addmix.summix));
			question = ("(" + i + ") $" + addmix.addmix + "\\frac{" + addmix.addfracn + "}{" + addmix.addfracd + "} +" + addmix.addmix2 + "\\frac{" + addmix.addfracn2 + "}{" + addmix.addfracd2 + "}=$");
			// System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 3) { // addition of two improper fractions
			AddImpro addimpro = new AddImpro();
			answer = (addimpro.sumimpro);
			question = ("(" + i + ") " + Simp.getFrac(addimpro.addfracn + "/" + addimpro.addfracd) + "+" + Simp.getFrac(addimpro.addfracn2 + "/" + addimpro.addfracd2) + "=");
			// System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 4) { // addition of two decimals
			AddDeci adddeci = new AddDeci();
			answer = (String.valueOf(adddeci.sumdeci));
			question = ("(" + i + ") $" + ((int) adddeci.adddeci / 100.0) + "+" + ((int) adddeci.adddeci2 / 100.0) + "=$");
			// System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 5) { // subtraction of two integers
			Addition sub1 = new Addition();
			answer = (EliminateZero.zero(sub1.d));
			question = ("(" + i + ") $" + sub1.num1 + "-" + sub1.num2 + " = $");
			// System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 6) { // subtraction of two mixed numbers
			Addmix submix = new Addmix();
			answer = (String.valueOf(submix.dmix));
			question = ("(" + i + ") $" + submix.addmix + "\\frac{" + submix.addfracn + "}{" + submix.addfracd + "} -" + submix.addmix2 + "\\frac{" + submix.addfracn2 + "}{" + submix.addfracd2 + "}=$");
			// System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 7) { // subtract two improper fractions
			AddImpro subimpro = new AddImpro();
			answer = (subimpro.dimpro);
			question = ("(" + i + ") $\\frac{" + subimpro.addfracn + "}{" + subimpro.addfracd + "} -\\frac{"+ subimpro.addfracn2 + "}{" + subimpro.addfracd2 + "}=$");
			// System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 8) { // subtract two decimals
			AddDeci subdeci = new AddDeci();
			answer = (String.valueOf(subdeci.ddeci));
			question = ("(" + i + ") $" + ((int) subdeci.adddeci / 100.0) + "-"+ ((int) subdeci.adddeci2 / 100.0) + "=$");
			// System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 9) { // multiplication of two integers
			Addition mult1 = new Addition();
			answer = (EliminateZero.zero(mult1.p));
			question = ("(" + i + ") $" + mult1.num1 / 10 + "\\times" + mult1.num2 / 10 + " = $");
			// System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 10) { // multiplication of two mixed numbers
			Addmix multmix = new Addmix();
			answer = (String.valueOf(multmix.pmix));
			question = ("(" + i + ") $" + multmix.addmix / 1000 + "\\frac{" + multmix.addfracn + "}{"+ multmix.addfracd + "} \\times" + multmix.addmix2 / 1000 + "\\frac{" + multmix.addfracn2 + "}{"+ multmix.addfracd2 + "}=$");
			// System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 11) { // multiplication of two improper fractions
			AddImpro multimpro = new AddImpro();
			answer = (multimpro.pimpro);
			question = ("(" + i + ") $\\frac{" + multimpro.addfracn + "}{" + multimpro.addfracd+ "} \\times\\frac{" + multimpro.addfracn2 + "}{" + multimpro.addfracd2 + "}=" + "$");
			// System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 12) { // multiplication of two decimals
			AddDeci multdeci = new AddDeci();
			answer = (String.valueOf(multdeci.pdeci));
			question = ("(" + i + ") $" + ((int) (multdeci.adddeci / 100) / 100.0) + "\\times"+ ((int) (multdeci.adddeci2 / 100) / 100.0) + "=$");
			// System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 13) { // division of two integers
			Addition div1 = new Addition();
			question = ("(" + i + ") $" + div1.num1 / 100 + "\\div" + div1.num2 / 100 + " = $ \\hrulefill (fraction)");
			answer = (Simp.getFrac(div1.num1 / 100 + "/" + div1.num2 / 100) + " or $" + Simp.getProper(div1.num1 / 100 + "/" + div1.num2 / 100) + "$");
			// System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 14) { // division of two mixed numbers
			Addmix divmix = new Addmix();
			answer = (String.valueOf(divmix.qmix));
			question = ("(" + i + ") $" + divmix.addmix / 1000 + "\\frac{" + divmix.addfracn + "}{"+ divmix.addfracd + "} \\div" + divmix.addmix2 / 1000 + "\\frac{" + divmix.addfracn2 + "}{"+ divmix.addfracd2 + "}=$");
			// System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 15) { // division of two improper fractions
			AddImpro divimpro = new AddImpro();
			answer = (divimpro.qimpro);
			question = ("(" + i + ") $\\frac{" + divimpro.addfracn + "}{" + divimpro.addfracd+ "} \\div\\frac{" + divimpro.addfracn2 + "}{" + divimpro.addfracd2 + "}=" + "$");
			// System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 16) { // division of two decimals
			AddDeci divdeci = new AddDeci();
			answer = (String.valueOf((divdeci.adddeci / 10.0) / (divdeci.adddeci2 / 1000)));
			question = ("(" + i + ") $" + ((int) divdeci.adddeci / 10.0) + "\\div" + (divdeci.adddeci2 / 1000) + "=$ \\hrulefill (Decimal)");
			// System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 17){//a/b + b/a
			int a = rand.nextInt(17) + 5;
			int b;
			do{
				b = rand.nextInt(17) + 5;
			} while(a == b);
			boolean isLess = rand.nextBoolean();
			if(isLess){
				boolean isFirst = rand.nextBoolean();
				if(isFirst){
					String first = (a - b) + "/" + b;
					question = "(" + i + ") $" + first + " + " + Simp.getFrac(b, a, false) + "$ = ";
					answer = Simp.getProper(Frac.add(first, b + "/" + a));
				} else{
					String second = (b - a) + "/" + a;
					question = "(" + i + ") $" + Simp.getFrac(a, b, false) + " + " + second + "$ = ";
					answer = Simp.getProper(Frac.add(a + "/" + b, second));
				}
			} else{
				question = "(" + i + ") $" + Simp.getFrac(a, b, false) + " + " + Simp.getFrac(b, a, false) + "$ = ";
				answer = Simp.getProper(Frac.add(a + "/" + b, b + "/" + a));
			}
		} else if(rand1_1 == 18){//series of fraction
			int b = rand.nextInt(3) + 1;
			int a;
			do{
				a = rand.nextInt(b - 1) + 1;
			}while(!IsPrime.prime(a));
			int length = rand.nextInt(3) + 3;
			question = "(" + i + ") $";
			answer = "0";
			for(int q = b; q < length + b; q++){
				if(q == b){
					question = Simp.getFrac(a, q * (q + 1), false);
					answer = Frac.add(answer, Simp.getFrac(a, q * (q + 1), false), true);
				} else{
					question = question + " + " + Simp.getFrac(a, q * (q + 1), false);
					answer = Frac.add(answer, Simp.getFrac(a, q * (q + 1), false), true);
				}
			}
			question = question + "$ = ";
		} else if(rand1_1 == 19){//deviating fraction
			boolean topPositive = rand.nextBoolean();
			boolean isSame = rand.nextBoolean();
			boolean isTwo = rand.nextBoolean();
			int a = rand.nextInt(9) + 1;
			int b;
			do{
				b = rand.nextInt(9) + 1;
			}while(b==a);
			Frac frac2;
			if(isTwo){
				frac2 = new Frac(2 * a, 2 * b);
			} else{
				frac2 = new Frac(a, b);
			}
			Frac frac1 = new Frac(a, b);
			if(topPositive){
				if(isSame){
					question = frac1 + " - " + (new Frac(frac2.getNum() + 1, frac2.getDenom() + 1)) + "$ = ";
					answer = Frac.sub(frac1.toString(true), new Frac(frac2.getNum() + 1, frac2.getDenom() + 1).toString(true));
				} else{
					question = frac1 + " - " + (new Frac(frac2.getNum() + 1, frac2.getDenom() - 1)) + "$ = ";
					answer = Frac.sub(frac1.toString(true), new Frac(frac2.getNum() + 1, frac2.getDenom() - 1).toString(true));
				}
			} else{
				if(isSame){
					question = frac1 + " - " + (new Frac(frac2.getNum() - 1, frac2.getDenom() - 1)) + "$ = ";
					answer = Frac.sub(frac1.toString(true), new Frac(frac2.getNum() - 1, frac2.getDenom() - 1).toString(true));
				} else{
					question = frac1 + " - " + (new Frac(frac2.getNum() - 1, frac2.getDenom() + 1)) + "$ = ";
					answer = Frac.sub(frac1.toString(true), new Frac(frac2.getNum() - 1, frac2.getDenom() + 1).toString(true));
				}
			}
		}
		return new Question(i, question, answer);
	}

	public static void main(String[] args) {
		Adding add = new Adding();
		Question quest = add.generateQuestion(1);
		System.out.println(quest.question);
		System.out.println(quest.answer);
	}
}
