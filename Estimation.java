import java.util.ArrayList;
import java.util.Random;

public class Estimation
{
	private int setOfTen;
	private String mess;
	private int answer;

	public Estimation (int questionNum)
	{
		Random rand = new Random ();
		if (questionNum == 10)
		{
			setOfTen = 1;
			ArrayList < Integer > big = new ArrayList < Integer > ();
			for (int i = 0; i < 4; i++)
			{
				int degree = rand.nextInt (2) + 3;
				big.add ((int) (rand.nextInt (500) + Math.pow (10, degree)));
			}
			this.mess =
				big.get (0) + " + " + big.get (1) + " + " + big.get (2) + " + " +
				big.get (3) + " =";
			for (int i = 0; i < big.size (); i++)
			{
				answer += big.get (i);
			}
		}
		if (questionNum == 20)
		{
			setOfTen = 2;
			mess = "";
			answer = 0;
		}
		if (questionNum == 30)
		{
			setOfTen = 3;
			mess = "";
			answer = 0;
		}
		if (questionNum == 40)
		{
			setOfTen = 4;
			mess = "";
			answer = 0;
		}
		if (questionNum == 50)
		{
			setOfTen = 5;
			mess = "";
			answer = 0;
		}
		if (questionNum == 60)
		{
			setOfTen = 6;
			mess = "";
			answer = 0;
		}
		if (questionNum == 70)
		{
			setOfTen = 7;
			mess = "";
			answer = 0;
		}
		if (questionNum == 80)
		{
			setOfTen = 8;
			mess = "";
			answer = 0;
		}
	}

	public int getAnswer ()
	{
		return answer;
	}

	public String getMess ()
	{
		return mess;
	}
}
