import java.util.Random;

public class Range {
	private int lower;
	private int upper;

	public Range(int lower, int upper) {
		this.lower = lower;
		this.upper = upper;
	}

	public int gen() {
		Random rand = new Random();
		return rand.nextInt(upper) + lower + 1;
	}

	public int getUpper(){
		return upper;
	}
	
	public int getLower(){
		return lower;
	}
}
