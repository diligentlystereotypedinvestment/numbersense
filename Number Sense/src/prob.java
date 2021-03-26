import java.util.ArrayList;
import java.util.Random;

public class prob {
	private int wins;
	private int losses;

	public void gen(ArrayList<String> questions, ArrayList<String> answers, int i) {
		Random rand = new Random();
		int problem = rand.nextInt(4);
		wins = rand.nextInt(16);
		losses = rand.nextInt(16);
		while (wins == 15 || losses == 15 || wins == losses) {
			wins = rand.nextInt(16);
			losses = rand.nextInt(16);
		}
		if (problem == 0) {
			questions.add("(" + i + ") What is the probability of a win if the odds of losing are $\\frac{" + losses
					+ "}{" + wins + "}$?");
			answers.add("$\\frac{" + wins + "}{" + (wins + losses) + "}$");
		}
		if (problem == 1) {
			questions.add("(" + i + ") What is the probability of a loss if the odds of losing are $\\frac{" + losses
					+ "}{" + wins + "}$?");
			answers.add("$\\frac{" + losses + "}{" + (wins + losses) + "}$");
		}
		if (problem == 2) {
			questions.add("(" + i + ") What is the probability of a win if the odds of winning are $\\frac{" + wins
					+ "}{" + losses + "}$?");
			answers.add("$\\frac{" + wins + "}{" + (wins + losses) + "}$");
		}
		if (problem == 3) {
			questions.add("(" + i + ") What is the probability of a loss if the odds of winning are $\\frac{" + wins
					+ "}{" + losses + "}$?");
			answers.add("$\\frac{" + losses + "}{" + (wins + losses) + "}$");
		}
		if (problem == 4) {
			questions.add("(" + i + ") What are the odds of a win if the probability of losing is $\\frac{" + losses
					+ "}{" + (wins + losses) + "}$?");
			answers.add("$\\frac{" + wins + "}{" + (losses) + "}$");
		}
		if (problem == 5) {
			questions.add("(" + i + ") What are the odds of a loss if the probability of losing is $\\frac{" + losses
					+ "}{" + (wins + losses) + "}$?");
			answers.add("$\\frac{" + losses + "}{" + (wins) + "}$");
		}
		if (problem == 6) {
			questions.add("(" + i + ") What are the odds of a win if the probability of winning is $\\frac{" + wins
					+ "}{" + (losses + wins) + "}$?");
			answers.add("$\\frac{" + wins + "}{" + (losses) + "}$");
		}
		if (problem == 7) {
			questions.add("(" + i + ") What are the odds of a loss if the probability of winning is $\\frac{" + wins
					+ "}{" + (losses + wins) + "}$?");
			answers.add("$\\frac{" + losses + "}{" + (losses) + "}$");
		}
	}
}
