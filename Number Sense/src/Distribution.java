import java.util.Random;

public class Distribution {
	private int tensMultiple;
	private String stringmess;
	private int answer;

	public Distribution() {
		Random rand = new Random();
		tensMultiple = 10 * (rand.nextInt(3) + 1);
		int variation = rand.nextInt(tensMultiple - 2) + 1;
		int multiple = rand.nextInt(20) + 5;
		stringmess = (tensMultiple - variation) + "$\\cdot$" + multiple + " + " + multiple + "$\\cdot$"
				+ (tensMultiple + variation);
		answer = 2 * tensMultiple * multiple;
	}

	public String getMess() {
		return stringmess;
	}

	public int getAnswer() {
		return answer;
	}
}
