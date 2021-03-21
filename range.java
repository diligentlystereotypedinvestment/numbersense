import java.util.Random;

public class range{
	private int lower;
	private int upper;

	public range(int lower, int upper){
		this.lower = lower;
		this.upper = upper;
	}

	public int gen(){
		Random rand = new Random();
		return rand.nextInt(upper) + lower + 1;
	}
}
