import java.util.Random;

public class Conversion {
	Random rand = new Random();
	String unit1 = "";
	String unit2 = "";
	String answers;
	String question;
	
	public void questionGen(int i){
        int choosesys = rand.nextInt(1) + 1;
        if (choosesys == 1) {
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
                question = ("(" + i + ") What is " + num2 * 100 / denom2 + "$\\frac{" + num2 + "}{"
                            + denom2 + "}\\%$ as a fraction?");
                answers = ("$\\frac{" + num2 + "}{" + denom2 + "}\\%$");
            }
            if (choosefirstunit == 3) {
                question = ("(" + i + ") What is " + "$\\frac{" + num + "}{" + denom
                            + "}$ \\% as a percent?");
                answers = (String.valueOf(num * 100.0 / denom));
            }
            if (choosefirstunit == 4) {
                question = ("(" + i + ") What is " + num2 * 100.0 / denom2 + "\\% as a fraction?");
                answers = ("$\\frac{" + num2 + "}{" + denom2 + "}\\%$");
            }
            if (choosefirstunit == 5) {
                    question = ("(" + i + ") What is " + "$\\frac{" + num2 + "}{" + denom2
                                + "}$ \\% as a decimal?");
                answers = (String.valueOf(num2 / denom2));
            }
        } else {
            answers = "";
        }
    }
    
    public String getQuestion(){
        return question;
    }

}
