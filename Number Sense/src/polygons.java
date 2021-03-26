import java.util.Random;
import java.util.ArrayList;
import java.lang.Math;

class polygons {

	public void gen(ArrayList<String> questions, ArrayList<String> answers, int i) {
		Random rand = new Random();
		int sides = rand.nextInt(3);
		int problem = rand.nextInt(3);
		int sideLength = 2 * (rand.nextInt(3) + 1);
		if (sides == 0) { // equilateral triangle
			if (problem == 0) { // height
				questions.add("(" + i + ") What is the height of a triangle with a side length of " + sideLength + "?");
				answers.add(sideLength / 2 + "$\\sqrt{3}$");
			}
			if (problem == 1) { // area
				questions.add("(" + i + ") What is the area of a triangle with a side length of " + sideLength + "?");
				answers.add("$" + simplify.getFraction((int) Math.pow(sideLength, 2) + "/" + 4, false)
						+ "\\cdot\\sqrt{3}$");
			}
			if (problem == 2) { // side length from area
				questions.add("(" + i + ") What is the side length of a triangle with an area of $"
						+ simplify.getFraction((int) Math.pow(sideLength, 2) + "/" + 4, false) + "\\cdot\\sqrt{3} $?");
				answers.add(String.valueOf(sideLength));
			}
		}
		if (sides == 1) { // rectangle
			if (problem == 0) { // diagonals
				questions.add("(" + i + ") What is the diagonal length of a square  with an area of "
						+ (int) Math.pow(sideLength, 2) + "?");
				answers.add("$" + sideLength + "\\sqrt{2}$");
			}
			if (problem == 1) { // perimeter
				questions.add("(" + i + ") What is the perimeter of a rectangle with a diagonal of " + sideLength
						+ "$\\sqrt{2}$?");
				answers.add("$" + (4 * sideLength) + "$");
			}
			if (problem == 2) { // area ratios
				int side2 = 0;
				int side3 = 0;
				int side4 = 0;
				do {
					side2 = 2 * (rand.nextInt(3) + 1);
					side3 = 2 * (rand.nextInt(3) + 1);
					side4 = 2 * (rand.nextInt(3) + 1);
				} while (side2 == sideLength || side3 == side4);
				questions.add("(" + i + ") Rectangle ABCD is " + sideLength + "\" by " + side2
						+ "\" and rectangle A\'B\'C\'D\' is " + side3 + "\" by" + side4
						+ "\" What is the ratio of the area of A to B?");
				answers.add(String.valueOf(simplify.getFraction((sideLength * side2) + "/" + (side3 * side4))));
			}
		}

		if (sides == 2) { // circles
			if (problem == 0) { // diameter to area
				questions.add("(" + i + ") What is the area of a circle with a diameter of " + (2 * sideLength) + "?");
				answers.add("$" + (int) Math.pow(sideLength, 2) + "\\pi$");
			}
			if (problem == 1) { // circumference
				questions.add("(" + i + ") What is the circumference of a circle with a radius of " + sideLength
						+ "$\\sqrt{2}$?");
				answers.add("$" + (2 * sideLength) + "\\pi$");
			}
			if (problem == 2) {
				questions.add("(" + i + ") What is the area of a circle with a radius of " + sideLength + "?");
				answers.add("$" + (int) Math.pow(sideLength, 2) + "\\pi$");
			}
		}
	}

	public void gen2(ArrayList<String> questions, ArrayList<String> answers, int i) {
		Random rand = new Random();
		int sides = rand.nextInt(7) + 2;
		int problem = rand.nextInt(3);
		int sideLength = 2 * (rand.nextInt(3) + 1);
		if (sides == 2) { // pentagons
			problem = rand.nextInt(4);
			nagon penta = new nagon(5, sideLength, "pentagon");
			if (problem == 0) { // area
				questions.add("(" + i + ") What is the area of a " + penta.getName() + " with a side length of "
						+ sideLength + " and an apothem of " + penta.getApothem() + "?");
				answers.add(String.valueOf(penta.getArea()));
			}
			if (problem == 1) { // perimeter
				questions.add("(" + i + ") What is the perimeter of a " + penta.getName() + "with a side length of "
						+ sideLength);
				answers.add(String.valueOf(penta.getPerimeter()));
			}
			if (problem == 2) { // interior angle measures
				questions.add("(" + i + ") What is the interior angle measure of a " + penta.getName() + "?");
				answers.add(String.valueOf(penta.getInterior()));
			}
			if (problem == 3) {
				questions.add("(" + i + ") What is the center angle of a " + penta.getName() + "?");
				answers.add(String.valueOf(penta.getCenter()));
			}
		}

		if (sides == 3) { // hexagons
			// I know I should probably rename the object but laziness go brrrr
			problem = rand.nextInt(4);
			nagon penta = new nagon(6, sideLength, "hexagon");
			if (problem == 0) { // area
				questions.add("(" + i + ") What is the area of a " + penta.getName() + " with a side length of "
						+ sideLength + " and an apothem of " + penta.getApothem() + "?");
				answers.add(String.valueOf(penta.getArea()));
			}
			if (problem == 1) { // perimeter
				questions.add("(" + i + ") What is the perimeter of a " + penta.getName() + "with a side length of "
						+ sideLength);
				answers.add(String.valueOf(penta.getPerimeter()));
			}
			if (problem == 2) { // interior angle measures
				questions.add("(" + i + ") What is the interior angle measure of a " + penta.getName() + "?");
				answers.add(String.valueOf(penta.getInterior()));
			}
			if (problem == 3) {
				questions.add("(" + i + ") What is the center angle of a " + penta.getName() + "?");
				answers.add(String.valueOf(penta.getCenter()));
			}
		}

		if (sides == 4) { // heptagon
			// I know I should probably rename the object but laziness go brrrr
			problem = rand.nextInt(4);
			nagon penta = new nagon(7, sideLength, "heptagon");
			if (problem == 0) { // area
				questions.add("(" + i + ") What is the area of a " + penta.getName() + " with a side length of "
						+ sideLength + " and an apothem of " + penta.getApothem() + "?");
				answers.add(String.valueOf(penta.getArea()));
			}
			if (problem == 1) { // perimeter
				questions.add("(" + i + ") What is the perimeter of a " + penta.getName() + "with a side length of "
						+ sideLength);
				answers.add(String.valueOf(penta.getPerimeter()));
			}
			if (problem == 2) { // interior angle measures
				questions.add("(" + i + ") What is the interior angle measure of a " + penta.getName() + "?");
				answers.add(String.valueOf(penta.getInterior()));
			}
			if (problem == 3) {
				questions.add("(" + i + ") What is the center angle of a " + penta.getName() + "?");
				answers.add(String.valueOf(penta.getCenter()));
			}
		}

		if (sides == 5) { // octagon
			// I know I should probably rename the object but laziness go brrrr
			problem = rand.nextInt(4);
			nagon penta = new nagon(8, sideLength, "octagon");
			if (problem == 0) { // area
				questions.add("(" + i + ") What is the area of a " + penta.getName() + " with a side length of "
						+ sideLength + " and an apothem of " + penta.getApothem() + "?");
				answers.add(String.valueOf(penta.getArea()));
			}
			if (problem == 1) { // perimeter
				questions.add("(" + i + ") What is the perimeter of a " + penta.getName() + "with a side length of "
						+ sideLength);
				answers.add(String.valueOf(penta.getPerimeter()));
			}
			if (problem == 2) { // interior angle measures
				questions.add("(" + i + ") What is the interior angle measure of a " + penta.getName() + "?");
				answers.add(String.valueOf(penta.getInterior()));
			}
			if (problem == 3) {
				questions.add("(" + i + ") What is the center angle of a " + penta.getName() + "?");
				answers.add(String.valueOf(penta.getCenter()));
			}
		}

		int tracker = 6;
		nagon.gen(sides, sideLength, tracker, 9, "nonagon", questions, answers, i);
		tracker++;
		nagon.gen(sides, sideLength, tracker, 10, "decagon", questions, answers, i);
		tracker++;
		nagon.gen(sides, sideLength, tracker, 11, "undecagon", questions, answers, i);
		tracker++;
		nagon.gen(sides, sideLength, tracker, 12, "dodecagon", questions, answers, i);

	}
}
