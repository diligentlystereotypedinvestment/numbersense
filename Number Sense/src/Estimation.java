import java.util.ArrayList;
import java.util.Random;

public class Estimation {
	private int setOfTen;
	private String mess;
	private int answer;

	public Estimation(int questionNum) {
		Random rand = new Random();
		if (questionNum == 10) {
			setOfTen = 1;
			ArrayList<Integer> big = new ArrayList<Integer>();
			for (int i = 0; i < 4; i++) {
				int degree = rand.nextInt(2) + 3;
				big.add((int) (rand.nextInt(500) + Math.pow(10, degree)));
			}
			this.mess = big.get(0) + " + " + big.get(1) + " + " + big.get(2) + " + " + big.get(3) + " =";
			for (int i = 0; i < big.size(); i++) {
				answer += big.get(i);
			}
		} else

		if (questionNum == 20) {
			setOfTen = 2;
			int length = rand.nextInt(2) + 2;
			boolean division = false;
			String problem = "";
			answer = 1;
			for(int a = 0; a < length; a++){
				boolean isDivision = rand.nextBoolean();
				if(isDivision){
					int divisor = rand.nextInt(9000) + 101;
					problem += "\\div" + divisor;
					answer /= divisor;
				} else{
					int multiplicand = rand.nextInt(90000) + 10001;
					problem += "\\times" + multiplicand;
					answer *= multiplicand;
				}
			}
			mess = "$" + problem + "$";
		} else

		if (questionNum == 30) {
			setOfTen = 3;
			int problemType = rand.nextInt(3);
			if(problemType == 0){//squaring
				int[] multiplicands = {rand.nextInt(40)+20, rand.nextInt(40)+20};
				int[] divisors = {rand.nextInt(7)+3, rand.nextInt(7)+3};
				mess = "$(" + multiplicands[0] + "\\div" + divisors[0] + "\\times" + multiplicands[1] + "\\div" + divisors[1] + ")^2$";
				answer = (int) (multiplicands[0] / (1.0 * divisors[0]) * multiplicands[1] / (1.0 * divisors[1]));
			}
			mess = "";
			answer = 0;
		} else

		if (questionNum == 40) {
			setOfTen = 4;
			mess = "";
			answer = 0;
		} else

		if (questionNum == 50) {
			setOfTen = 5;
			mess = "";
			answer = 0;
		} else

		if (questionNum == 60) {
			setOfTen = 6;
			mess = "";
			answer = 0;
		} else

		if (questionNum == 70) {
			setOfTen = 7;
			mess = "";
			answer = 0;
		} else

		if (questionNum == 80) {
			setOfTen = 8;
			mess = "";
			answer = 0;
		}
	}

	public int getAnswer() {
		return answer;
	}

	public String getMess() {
		return mess;
	}
}
