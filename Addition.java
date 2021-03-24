import java.util.Random;

public class Addition
{
	public int rand4 ()
	{
		Random rand = new Random ();
		return rand.nextInt (8999) + 1000;
	}

	int num1 = rand4 ();
	int num2 = rand4 ();
	double sum = num1 + num2;
	double d = num1 - num2;
	double p = num1 * num2;
	double q = 1.000 * (num1 / 100) / (num2 / 100);
}
