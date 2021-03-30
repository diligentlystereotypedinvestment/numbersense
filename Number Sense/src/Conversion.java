import java.util.Random;

public class Conversion {
	Random rand = new Random();
	String unit1 = "";
	String unit2 = "";
	String answers = "";
	String question = "";

	public void questionGen(int i) {
		int choosesys = rand.nextInt(3);
		if (choosesys == 0) { // percent/fractions
			int denom = (int) Math.pow(2, rand.nextInt(3) + 2);
			int num = rand.nextInt(denom) + 1;
			int denom2 = (rand.nextInt(4) + 1) * 3;
			int num2 = rand.nextInt(denom2 - 1) + 1;
			int choosefirstunit = rand.nextInt(4) + 1;
			int percent = rand.nextInt(100) + 1;
			if (choosefirstunit == 1) {
				question = ("(" + i + ") What is " + percent + "$\\frac{" + num + "}{" + denom
						+ "}$ \\% as a decimal?");
				answers = (String.valueOf((percent + (num / (1.0 * denom))) / 100.0));
			}
			if (choosefirstunit == 2) {
				question = ("(" + i + ") What is " + num2 * 100 / denom2 + "$\\frac{" + (num2 * 100) % denom2 + "}{"
						+ denom2 + "}\\%$ as a fraction?");
				answers = ("$\\frac{" + num2 + "}{" + denom2 + "}$");
			}
			if (choosefirstunit == 3) {
				question = ("(" + i + ") What is $\\frac{" + num + "}{" + denom + "}$ \\% as a percent?");
				answers = (String.valueOf(num * 100.0 / denom) + "\\%");
			}
			if (choosefirstunit == 4) {
				question = ("(" + i + ") What is " + num2 * 100.0 / denom2 + "\\% as a fraction?");
				answers = ("$\\frac{" + num2 + "}{" + denom2 + "}$");
			}
			if (choosefirstunit == 5) {
				question = ("(" + i + ") What is $\\frac{" + num2 + "}{" + denom2 + "}$ \\% as a decimal?");
				answers = (String.valueOf(num2 / denom2));
			}
		}
		if (choosesys == 1) {
			romanNum roman = new romanNum();
			question = ("(" + i + ") What is " + roman.getRoman() + " in arabic?");
			answers = String.valueOf(roman.getArabic());
		}
		if(choosesys == 2){/*
			int type = rand.nextInt(6) + 1;
			int initial = rand.nextInt(20) + 1;
			Unit iUnit = Unit.getRandomUnit();
			Unit fUnit = Unit.getRandomUnit();
			question = "(" + i + ") What is " + initial + " " + iUnit.toString() + " in " + fUnit.toString() + "?";
			answers = iUnit.convert(initial, iUnit, fUnit);
			*/
		}
	}

	public String getQuestion() {
		return question;
	}

	public String getAnswer() {
		return answers;
	}

	public static void main(String[] args){
		Random rand = new Random();
		int type = rand.nextInt(6) + 1;
		int i = 0;
		int initial = rand.nextInt(20) + 2;
		Unit.init();
		Unit iUnit = Unit.getRandomUnit(type);
		Unit fUnit = Unit.getRandomUnit(type);
		while(fUnit.getName().equals(iUnit.getName())){
			fUnit = Unit.getRandomUnit(type);
		}
		String question = "(" + i + ") What is " + initial + " " + iUnit.getName() + "s in " + fUnit.getName() + "s?";
		String answers = String.valueOf(iUnit.convert(initial, iUnit, fUnit));
		System.out.println(question + ", " + answers);
	}

}
