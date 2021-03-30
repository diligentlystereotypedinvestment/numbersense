import java.util.ArrayList;
import java.util.Random;

public class rightTriangle {
	private final static int[] leg1 = { 5, 8, 9, 11, 13 };
	private final static int[] leg2 = { 12, 15, 40, 60, 84 };
	private final static int[] hypo = { 13, 17, 41, 61, 85 };

	public static void gen(ArrayList<String> questions, ArrayList<String> answers, int i) {
		Random rand = new Random();
		int chooser = rand.nextInt(3);
		int sideConfig = rand.nextInt(6);
		int side1, side2, side3;
		if (sideConfig == 5) {
			int scale = rand.nextInt(4) + 1;
			side1 = scale * 3;
			side2 = scale * 4;
			side3 = scale * 5;
		} else {
			side1 = leg1[sideConfig];
			side2 = leg2[sideConfig];
			side3 = hypo[sideConfig];
		}
		if (chooser == 0) { // find one side
			int sideToFind = rand.nextInt(3);
			if (sideToFind == 0) { // hypotenuse
				questions.add("(" + i
						+ ") What is the hypotenuse of a right triangle with integer side lengths and one leg being $"
						+ side1 + "$?");
				answers.add(String.valueOf(side3));
			}
			if (sideToFind == 1) { // side1
				questions.add("(" + i
						+ ") What is the shortest leg of a right triangle with integer side lengths and the hypotenuse being $"
						+ side3 + "$?");
				answers.add(String.valueOf(side1));
			}
			if (sideToFind == 2) { // side2
				questions.add("(" + i
						+ ") What is the longest leg of a right triangle with integer side lengths and the hypothenuse being $"
						+ side3 + "$?");
				answers.add(String.valueOf(side2));
			}
		}
		if (chooser == 1) { // median length
			questions.add("(" + i + ") What is the length of the median to the hypotenuse of a right triangle with sides $"
					+ side1 + ", " + side2 + ", \\text{ and }" + side3 + "$?");
			answers.add(simp.getFraction(side3 + "/" + 2) + ", " + side3 / 2.0);
		}
		if (chooser == 2) { // altitude length
			questions.add("(" + i + ") What is the length of the altitude to the hypotenuse of a right triangle with sides $"
					+ side1 + ", " + side2 + ", \\text{ and }" + side3 + "$?");
			answers.add(simp.getFraction((side1 * side2) + "/" + side3) + ", " + (side1 * side2) / side3);
		}
	}
}
