import java.util.ArrayList;
import java.util.Random;;

public class ThreeDGeo {
	public void gen(ArrayList<String> questions, ArrayList<String> answers, int i) {
		Random rand = new Random();
		boolean isVolume = rand.nextBoolean();
		boolean isCube = rand.nextBoolean();
		if (isVolume) {// problem is about volume
			if (isCube) {
				int side = rand.nextInt(17) + 3;
				questions.add("(" + i + ") What is the volume of a cube with side length of " + side + "?");
				answers.add(String.valueOf((int) (Math.pow(side, 3))));
			} else {
				int radius = rand.nextInt(7) + 3;
				boolean isRadius = rand.nextBoolean();
				if (isRadius) {
					questions.add("(" + i + ") What is the volume of a sphere with radius of " + radius + "?");
					answers.add(Frac.mult("4/3", (int) Math.pow(radius, 3) + "\\pi"));
				} else {
					questions.add("(" + i + ") What is the volume of a sphere with diameter of " + 2 * radius + "?");
					answers.add(Frac.mult("4/3", (int) Math.pow(radius, 3) + "\\pi"));
				}
			}
		} else if (isCube) {
			int side = rand.nextInt(17) + 3;
			questions.add("(" + i + ") What is the surface area of a cube with side length of " + side + "?");
			answers.add(String.valueOf(6 * (int) (Math.pow(side, 2))));
		} else {
			int radius = rand.nextInt(7) + 3;
			boolean isRadius = rand.nextBoolean();
			if (isRadius) {
				questions.add("(" + i + ") What is the surface area of a sphere with radius of " + radius + "?");
				answers.add((int) (6 * Math.pow(radius, 2)) + "\\pi");
			} else {
				questions.add("(" + i + ") What is the surface area of a sphere with diameter of " + 2 * radius + "?");
				answers.add((int) (6 * Math.pow(radius, 2)) + "\\pi");
			}
		}
	}
}
