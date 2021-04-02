import java.util.Random;
import java.util.ArrayList;

public class Nagon {
	Random rand = new Random();
	private int sides;
	private String name;
	private double area;
	private int perimeter;
	private int sideLength;
	private int apothem;
	private int vertexName;

	public Nagon(int sides, int sideLength, String name) {
		this.sides = sides;
		for (int i = 97; i < 97 + sides; i++) {
			this.vertexName = this.vertexName + (char) i;
		}
		this.name = "regular " + name;
		this.apothem = rand.nextInt(5) + 1;
		this.sideLength = sideLength;
		this.perimeter = sides * this.sideLength;
		this.area = Double.valueOf(EliminateZero.zero(this.apothem * perimeter / 2.0));
	}

	public double getPerimeter() {
		return perimeter;
	}

	public int getApothem() {
		return apothem;
	}

	public double getArea() {
		return area;
	}

	public String getName() {
		return name;
	}

	public int getSum() {
		return 180 * (sides - 2);
	}

	public int getInterior() {
		return getSum() / (sides);
	}

	public String getCenter() {
		return Simp.getFraction(360 + "/" + sides);
	}

	public static void gen(int sides, int sideLength, int tracker, int realPolySides, String name,
			ArrayList<String> questions, ArrayList<String> answers, int i) {
		Random rand2 = new Random();
		if (sides == tracker) {
			int problem = rand2.nextInt(4);
			Nagon penta = new Nagon(sides, sideLength, name);
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
	}
}
