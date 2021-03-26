import java.util.Random;
import java.util.ArrayList;

public class conic {
	private int xLength;
	private int yLength;
	private int radius;
	private int area;

	public conic(int x, int y, int radius) {
		xLength = x;
		yLength = y;
		this.radius = radius;
		calcArea();
	}

	public int getArea() {
		return area;
	}

	public int getRadius() {
		return radius;
	}

	public void calcArea() {
		area = (radius / xLength) * (radius / yLength);
	}

	public static void gen(ArrayList<String> questions, ArrayList<String> answers, int i) {
		Random rand = new Random();
		int xLength = rand.nextInt(5) + 1;
		int yLength = rand.nextInt(5) + 1;
		int radius = rand.nextInt(27) + 13;
		conic circ = new conic(xLength, yLength, radius);
		if (xLength == 1 && yLength == 1) {
			int problem = rand.nextInt(2);
			if (problem == 0) {
				questions.add("(" + i + ") What is the area of a circle with the equation $x^2 + y^2 = "
						+ Math.pow(radius, 2) + "?$");
				answers.add("$" + circ.getArea() + "\\pi$");
			}
			if (problem == 1) {
				questions.add("(" + i + ") What is the circumference of a circle with the equation $x^2 + y^2 = "
						+ Math.pow(radius, 2) + "?$");
				answers.add("$" + (2 * circ.getRadius()) + "\\pi$");
			}
		} else {
			if (xLength == 1) {
				questions.add("(" + i + ") What is the area of a conic with the equation $x^2 + " + Math.pow(yLength, 2)
						+ "y^2 = " + Math.pow(radius, 2) + "?$");
				answers.add("$" + circ.getArea() + "\\pi$");
			}
			if (yLength == 1) {
				questions.add("(" + i + ") What is the area of a conic with the equation $" + Math.pow(xLength, 2)
						+ "x^2 + y^2 = " + Math.pow(radius, 2) + "?$");
				answers.add("$" + circ.getArea() + "\\pi$");
			}
			questions.add("(" + i + ") What is the area of a conic with the equation $" + Math.pow(xLength, 2)
					+ "x^2 + " + Math.pow(yLength, 2) + "y^2 = " + Math.pow(radius, 2) + "?$");
			answers.add("$" + circ.getArea() + "\\pi$");
		}
	}
}
