import java.util.Random;

public class Adding implements QuestionType{
	static Random rand = new Random();

	@Override
	public Question generateQuestion(int i) {
		String answer = "";
		String question = "";
		int rand1_1 = rand.nextInt(16) + 1;
		if (rand1_1 == 1) { // addition of two integers
			Addition add1 = new Addition();
			answer = (EliminateZero.zero(add1.sum));
			String printmess = ("(" + i + ") $" + add1.num1 + "+" + add1.num2 + " = $");
			question = (printmess); // System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 2) { // addition of two mixed numbers
			Addmix addmix = new Addmix();
			answer = (String.valueOf(addmix.summix));
			String printmess = ("(" + i + ") $" + addmix.addmix + "\\frac{" + addmix.addfracn + "}{" + addmix.addfracd + "} +" + addmix.addmix2 + "\\frac{" + addmix.addfracn2 + "}{" + addmix.addfracd2 + "}=$");
			question = (printmess); // System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 3) { // addition of two improper fractions
			AddImpro addimpro = new AddImpro();
			answer = (addimpro.sumimpro);
			String printmess = ("(" + i + ") " + Simp.getFraction(addimpro.addfracn + "/" + addimpro.addfracd) + "+" + Simp.getFraction(addimpro.addfracn2 + "/" + addimpro.addfracd2) + "=");
			question = (printmess); // System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 4) { // addition of two decimals
			AddDeci adddeci = new AddDeci();
			answer = (String.valueOf(adddeci.sumdeci));
			String printmess = ("(" + i + ") $" + ((int) adddeci.adddeci / 100.0) + "+" + ((int) adddeci.adddeci2 / 100.0) + "=$");
			question = (printmess); // System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 5) { // subtraction of two integers
			Addition sub1 = new Addition();
			answer = (EliminateZero.zero(sub1.d));
			String printmess = ("(" + i + ") $" + sub1.num1 + "-" + sub1.num2 + " = $");
			question = (printmess); // System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 6) { // subtraction of two mixed numbers
			Addmix submix = new Addmix();
			answer = (String.valueOf(submix.dmix));
			String printmess = ("(" + i + ") $" + submix.addmix + "\\frac{" + submix.addfracn + "}{" + submix.addfracd + "} -" + submix.addmix2 + "\\frac{" + submix.addfracn2 + "}{" + submix.addfracd2 + "}=$");
			question = (printmess); // System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 7) { // subtract two improper fractions
			AddImpro subimpro = new AddImpro();
			answer = (subimpro.dimpro);
			String printmess = ("(" + i + ") $\\frac{" + subimpro.addfracn + "}{" + subimpro.addfracd + "} -\\frac{"
					+ subimpro.addfracn2 + "}{" + subimpro.addfracd2 + "}=$");
			question = (printmess); // System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 8) { // subtract two decimals
			AddDeci subdeci = new AddDeci();
			answer = (String.valueOf(subdeci.ddeci));
			String printmess = ("(" + i + ") $" + ((int) subdeci.adddeci / 100.0) + "-"
					+ ((int) subdeci.adddeci2 / 100.0) + "=$");
			question = (printmess); // System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 9) { // multiplication of two integers
			Addition mult1 = new Addition();
			answer = (EliminateZero.zero(mult1.p));
			String printmess = ("(" + i + ") $" + mult1.num1 / 10 + "\\cdot" + mult1.num2 / 10 + " = $");
			question = (printmess); // System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 10) { // multiplication of two mixed numbers
			Addmix multmix = new Addmix();
			answer = (String.valueOf(multmix.pmix));
			String printmess = ("(" + i + ") $" + multmix.addmix / 1000 + "\\frac{" + multmix.addfracn + "}{"
					+ multmix.addfracd + "} \\cdot" + multmix.addmix2 / 1000 + "\\frac{" + multmix.addfracn2 + "}{"
					+ multmix.addfracd2 + "}=$");
			question = (printmess); // System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 11) { // multiplication of two improper fractions
			AddImpro multimpro = new AddImpro();
			answer = (multimpro.pimpro);
			String printmess = ("(" + i + ") $\\frac{" + multimpro.addfracn + "}{" + multimpro.addfracd
					+ "} \\cdot\\frac{" + multimpro.addfracn2 + "}{" + multimpro.addfracd2 + "}=" + "$");
			question = (printmess); // System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 12) { // multiplication of two decimals
			AddDeci multdeci = new AddDeci();
			answer = (String.valueOf(multdeci.pdeci));
			String printmess = ("(" + i + ") $" + ((int) (multdeci.adddeci / 100) / 100.0) + "\\cdot"
					+ ((int) (multdeci.adddeci2 / 100) / 100.0) + "=$");
			question = (printmess); // System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 13) { // division of two integers
			Addition div1 = new Addition();
			String printmess = ("(" + i + ") $" + div1.num1 / 100 + "\\div" + div1.num2 / 100 + " = $ \\hrulefill (fraction)");
			answer = (Simp.getFraction(div1.num1 / 100 + "/" + div1.num2 / 100) + " or $" + Simp.getProper(div1.num1 / 100 + "/" + div1.num2 / 100) + "$");
			question = (printmess); // System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 14) { // division of two mixed numbers
			Addmix divmix = new Addmix();
			answer = (String.valueOf(divmix.qmix));
			String printmess = ("(" + i + ") $" + divmix.addmix / 1000 + "\\frac{" + divmix.addfracn + "}{"
					+ divmix.addfracd + "} \\div" + divmix.addmix2 / 1000 + "\\frac{" + divmix.addfracn2 + "}{"
					+ divmix.addfracd2 + "}=$");
			question = (printmess); // System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 15) { // division of two improper fractions
			AddImpro divimpro = new AddImpro();
			answer = (divimpro.qimpro);
			String printmess = ("(" + i + ") $\\frac{" + divimpro.addfracn + "}{" + divimpro.addfracd
					+ "} \\div\\frac{" + divimpro.addfracn2 + "}{" + divimpro.addfracd2 + "}=" + "$");
			question = (printmess); // System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		} else if(rand1_1 == 16) { // division of two decimals
			AddDeci divdeci = new AddDeci();
			answer = (String.valueOf((divdeci.adddeci / 10.0) / (divdeci.adddeci2 / 1000)));
			String printmess = ("(" + i + ") $" + ((int) divdeci.adddeci / 10.0) + "\\div" + (divdeci.adddeci2 / 1000) + "=$ \\hrulefill (Decimal)");
			question = (printmess); // System.out.print(printmess);
			/*
			 * for (int q = 0; q < 60 - printmess.length(); q++) {
			 * //System.out.print("\\textunderscore"); }
			 */
			// System.out.println();
			// System.out.println();
		}
		return new Question(i, question, answer);
	}
}
