import java.util.Random;
import java.util.ArrayList;

public class RomanNum {
	private int arabic;
	private String roman = "";
	private Random rand = new Random();
	private final static int[] NUMBERS = { 1000, 500, 100, 50, 10, 5, 1 };
	private final static String[] LETTERS = { "M", "D", "C", "L", "X", "V", "I" };
	private ArrayList<String> romanChars = new ArrayList<>();

	public RomanNum() {
		arabic = rand.nextInt(2000) + 1534;
		toRoman();
	}

	public void toRoman() {
		int backupArabic = arabic;
		for (int i = 0; i < NUMBERS.length; i++) {
			if (backupArabic == 0) {
				break;
			}
			int multiples = backupArabic / NUMBERS[i];
			for (int ii = 0; ii < multiples; ii++) {
				romanChars.add(LETTERS[i]);
			}
			backupArabic -= multiples * NUMBERS[i];
		}
		cleanup();
		System.out.println(romanChars);
		for (int i = 0; i < romanChars.size(); i++) {
			roman = roman + romanChars.get(i);
		}
	}

	public String getRoman() {
		return roman;
	}

	public void cleanup() { // code to fix four roman numerals in a row
		/*
		 * for(int i = romanChars.size(); i > 3; i--){
		 * if(romanChars.get(i).equals(romanChars.get(i - 1)) && romanChars.get(i -
		 * 1).equals(romanChars.get(i - 2)) && romanChars.get(i -
		 * 2).equals(romanChars.get(i - 3))){ String fourInARow = romanChars.get(i); int
		 * currentSpot = LETTERS.indexOf(romanChars.get(i)); romanChars.remove } }
		 */
		ArrayList<String> tempChars = new ArrayList<>();
		for(int i = 0; i < romanChars.size() - 3; i++){
			if(inARow(i)){
				tempChars.add(i, romanChars.get(i));
			} else{
				tempChars.add(i, romanChars.get(i));
				tempChars.add(i + 1, LETTERS[getIndex(LETTERS, romanChars.get(i)) - 1]);
				i+=4;
			}
			/*
		while (!inARow(i)) {
			romanChars.remove(i + 1);
			romanChars.remove(i + 1);
			romanChars.remove(i + 1);
			romanChars.add(i, LETTERS[getIndex(LETTERS, romanChars.get(i)) - 1]);
			i++;
		}
		*/
		}
		romanChars = tempChars;
	}

	public int getArabic() {
		return arabic;
	}

	public boolean inARow(int i) { // code to detect when there are four in a row
		if (romanChars.get(i).equals(romanChars.get(i + 1)) && romanChars.get(i + 1).equals(romanChars.get(i + 2)) && romanChars.get(i + 2).equals(romanChars.get(i + 3))) {
			return false;
		}
		return true;
	}

	public int getIndex(String[] array, String character) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(character)) {
				return i;
			}
		}
		return -1;
	}
}
