import java.util.ArrayList;
import java.util.Random;

public class Coord {

	public static void gen(ArrayList<String> questions, ArrayList<String> answers, int i) {
		Random rand = new Random();
		int choose = rand.nextInt(4);
		int solveFor = rand.nextInt(2);
		int x = rand.nextInt(10);
		int y = rand.nextInt(10) + 1;
		if (solveFor == 0) { // solve for x
			if (choose == 0) { // reflect over y axis
				questions.add("(" + i + ") The point $(" + x + ", " + y + ")$ is reflected over the y-axis onto $(h, "
						+ y + ")$ What is $h$?");
				answers.add(String.valueOf(-1 * x));
			}
			if (choose == 1) { // reflect over x axis
				questions.add("(" + i + ") The point $(" + x + ", " + y + ")$ is reflected over the x-axis onto $(h, "
						+ -1 * y + ")$ What is $h$?");
				answers.add(String.valueOf(x));
			}
			if (choose == 2) { // reflect over y = x
				questions.add("(" + i + ") The point $(" + x + ", " + y
						+ ")$ is reflected over the line $y = x$ onto $(h, " + x + ")$ What is $h$?");
				answers.add(String.valueOf(y));
			}
			if (choose == 3) { // reflect over y = -x
				questions.add("(" + i + ") The point $(" + x + ", " + y
						+ ")$ is reflected over the line $y = -x$ onto $(h, " + -1 * x + ")$ What is $h$?");
				answers.add(String.valueOf(-1 * y));
				;
			}
		}
		if (solveFor == 1) { // solve for y
			if (choose == 0) { // reflect over y axis
				questions.add("(" + i + ") The point $(" + x + ", " + y + ")$ is reflected over the y-axis onto $("
						+ -1 * x + ", h)$ What is $h$?");
				answers.add(String.valueOf(y));
			}
			if (choose == 1) { // reflect over x axis
				questions.add("(" + i + ") The point $(" + x + ", " + y + ")$ is reflected over the x-axis onto $(" + x
						+ ", h)$ What is $h$?");
				answers.add(String.valueOf(-1 * y));
			}
			if (choose == 2) { // reflect over y = x
				questions.add("(" + i + ") The point $(" + x + ", " + y
						+ ")$ is reflected over the line $y = x$ onto $(" + y + ", h)$ What is $h$?");
				answers.add(String.valueOf(x));
			}
			if (choose == 3) { // reflect over y = -x
				questions.add("(" + i + ") The point $(" + x + ", " + y
						+ ")$ is reflected over the line $y = -x$ onto $(" + -1 * y + ", h)$ What is $h$?");
				answers.add(String.valueOf(-1 * x));
			}
		}
	}
}
