import java.util.ArrayList;
import java.util.Random;

public class polygonalNumbers
{
	public static void gen (ArrayList < String > questions,
			ArrayList < String > answers, int i)
	{
		Random rand = new Random ();
		int sides = rand.nextInt (8) + 3;
		int alNumber = rand.nextInt (8) + 4;
		String shapeName = "";
		if (sides == 3)
		{
			shapeName = "triangular";
		}
		if (sides == 4)
		{
			shapeName = "rectangular";
		}
		if (sides == 5)
		{
			shapeName = "pentagonal";
		}
		if (sides == 6)
		{
			shapeName = "hexagonal";
		}
		if (sides == 7)
		{
			shapeName = "heptagonal";
		}
		if (sides == 8)
		{
			shapeName = "octagonal";
		}
		if (sides == 9)
		{
			shapeName = "nonagonal";
		}
		if (sides == 10)
		{
			shapeName = "decagon";
		}
		questions.add ("(" + i + ") What is the " + alNumber + "th " + shapeName +
				" number?");
		answers.add (String.
				valueOf (alNumber * (alNumber * (sides - 2) - (sides - 4)) /
					2));
	}
}
