import java.util.Random;
import java.util.ArrayList;

public class ratio
{
	public static void gen (ArrayList < String > questions,
			ArrayList < String > answers, int i)
	{
		Random rand = new Random ();
		int variation = rand.nextInt (2);
		int solveFor = rand.nextInt (2);
		int x = rand.nextInt (10) + 1;
		int y = rand.nextInt (10) + 1;
		if (variation == 0)
		{				//direct
			int postVar = rand.nextInt (10) + 1;
			if (solveFor == 0)
			{			//x
				while (postVar == y)
				{
					postVar = rand.nextInt (10) + 1;
				}
				questions.add ("(" + i + ") If $x = " + x + "$ and $y = " + y +
						"$ and vary directly, what is the value of $x$ when $y = "
						+ postVar + "$?");
				answers.add ("$" + simplify.getFraction (x * postVar + "/" + y) +
						"$");
			}
			if (solveFor == 1)
			{			//y
				while (postVar == x)
				{
					postVar = rand.nextInt (10) + 1;
				}
				questions.add ("(" + i + ") If $x = " + x + "$ and $y = " + y +
						"$ and vary directly, what is the value of $y$ when $x = "
						+ postVar + "$?");
				answers.add ("$" + simplify.getFraction (y * postVar + "/" + x) +
						"$");
			}
		}
		if (variation == 1)
		{				//inverse
			int scalar = rand.nextInt (10) + 1;
			if (solveFor == 0)
			{			//x
				questions.add ("(" + i + ") If $x = " + x + "$ and $y = " + y +
						"$ and are inverses, what is the value of $x$ when $y = "
						+ scalar * y + "$?");
				answers.add ("$" + simplify.getFraction (x + "/" + scalar) + "$");
			}
			if (solveFor == 1)
			{			//y
				questions.add ("(" + i + ") If $x = " + x + "$ and $y = " + y +
						"$ and are inverses, what is the value of $y$ when $x = "
						+ scalar * x + "$?");
				answers.add ("$" + simplify.getFraction (y + "/" + scalar) + "$");
			}
		}
	}
}
