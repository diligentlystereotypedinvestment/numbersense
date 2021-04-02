import java.util.Random;

public class SystemOfEquations {
	private String question;
	private int answer;

	public void Gen() {
		Random rand = new Random();
		int x = rand.nextInt(20);
		int y = rand.nextInt(20);
		int choose = rand.nextInt(2);
		if (choose == 0) {
			question = "Let x + y = " + (x + y) + " and xy = " + (x * y)
					+ ", where x, y are integers and y $\\geq$ x Find x.";
			answer = x;
		}
		if (choose == 1) {
			question = "Let x + y = " + (x + y) + " and xy = " + (x * y)
					+ ", where x, y are integers and y $\\geq$ x Find y.";
			answer = y;
		}
	}

	public String getQuestion() {
		return question;
	}

	public int getAnswer() {
		return answer;
	}
}
