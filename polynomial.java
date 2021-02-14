import java.util.Random;

public class polynomial {

	private String problem;
	private String answer;

	public void Gen() {

		Random rand = new Random();
		int power = 2;
		int choose = rand.nextInt(2);
		if (choose == 0) {
			power = 2;
		}
		problem = "";
		for (int i = 2; i <= power; i++) {
			int sign = rand.nextInt(2);
			if (sign == 0) {
				problem = (rand.nextInt(6) + 1) + "x^" + i + " + " + problem;
			}
			if (sign == 1) {
				problem = (rand.nextInt(6) + 1) + "x^" + i + " - " + problem;
			}
		}
		choose = rand.nextInt(2);
		if(choose == 0){
			problem = problem + (rand.nextInt(6) + 1) + "x" + " + ";
		} else{
			problem = problem + (rand.nextInt(6) + 1) + "x" + " - ";
		}
		problem = "$" + problem + (rand.nextInt(9) + 1) + "$";
		String tempProblem = problem;
		choose = rand.nextInt(3);
		if (choose == 0) {
			problem = "What is the sum of roots of " + problem + "?";
			answer = simplify.getFraction(String.valueOf(-1 * Integer.valueOf(tempProblem.substring(8, 9))) + "/" + (tempProblem.substring(1, 2)));
		}
		if (choose == 1 && power == 2) {
			int decrimType = rand.nextInt(2);
			if (decrimType == 0) {// 0
				int evenSquare = 2 * (rand.nextInt(4) + 3);
				int ac = (int) Math.pow(evenSquare, 2) / 4;
				int a = PrimeDivisors.factor(ac).get(rand.nextInt(PrimeDivisors.factor(ac).size()));
				int c = ac / a;
				problem = "$" + a + "x^2 + " + evenSquare + "x + " + c + "$";
				answer = "0";
			}
			if (decrimType == 1) {// 1
				int oddSquare = 2 * (rand.nextInt(4) + 3) + 1;
				int ac = (int) (Math.pow(oddSquare, 2) - 1) / 4;
				int a = PrimeDivisors.factor(ac).get(rand.nextInt(PrimeDivisors.factor(ac).size()));
				int c = ac / a;
				problem = "$" + a + "x^2 + " + oddSquare + "x + " + c + "$";
				answer = "1";
			}
			problem = "What is the discriminate of " + problem + "?";
		} else if (choose == 1 && power == 3) {
			problem = "What is the sum of the roots of " + problem + " taken two at a time?";
			answer = simplify.getFraction(tempProblem.substring(16, 17) + "/" + tempProblem.substring(1, 2));
		}
		if (choose == 2) {
			problem = "What is the product of the roots of " + problem;
			answer = simplify.getFraction(tempProblem.substring(tempProblem.length() - 2, tempProblem.length() - 1) + "/" + ((int) Math.pow(-1, power)));
		}

	}
	public String getQuestion(){
		return problem;
	}
	public String getAnswer(){
		return answer;
	}
}
