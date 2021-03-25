import java.util.ArrayList;
import java.util.Random;

public class proportion
{
	public static void gen (ArrayList < String > questions,
			ArrayList < String > answers, int i)
	{
		Random rand = new Random ();
		int solveFor = rand.nextInt ();
		int number1 = rand.nextInt (30) + 21;
		int number2 = (rand.nextInt (18) + 1) / 2 * number1;
		int number3 = rand.nextInt (30) + 21;
		while (number3 == number2 || number3 == number1)
		{
			number3 = rand.nextInt (30) + 21;
		}
		if (solveFor == 0)
		{				//w of x, _ of z
			questions.add ("(" + i + ") $" + number1 + "$ is to $" + number2 +
					"$ as \\textunderscore\\textunderscore\\textunderscore is to $"
					+ number3 + "$");
			answers.add (simplify.
					getFraction (number1 * number3 + "/" + number2));
		}
		if (solveFor == 0)
		{				//w of x, y of ___
			questions.add ("(" + i + ") $" + number1 + "$ is to $" + number2 +
					"$ as $" + number3 +
					"$ is to\\textunderscore\\textunderscore\\textunderscore?");
			answers.add (simplify.
					getFraction (number2 * number3 + "/" + number1));
		}
	}
}
