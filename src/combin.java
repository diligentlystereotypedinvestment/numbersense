import java.util.Random;
import java.util.ArrayList;

public class combin
{
	private boolean comb;
	private int n;
	private int k;

	public combin (int n, int k, boolean comb)
	{
		this.n = n;
		this.k = k;
		this.comb = comb;
	}

	public int toAns ()
	{
		//int n = combina.getN();
		//int k = combina.getK();
		if (comb)
		{
			return binomialTheorem.factorial (n) /
				(binomialTheorem.factorial (k) * binomialTheorem.factorial (n - k));
		}
		return binomialTheorem.factorial (n) /
			(binomialTheorem.factorial (n - k));
	}
	
	public static int choose(int n, int k){
        return new combin(n, k, true).toAns();
	}

	public boolean isComb ()
	{
		return comb;
	}

	public int getN ()
	{
		return n;
	}

	public int getK ()
	{
		return k;
	}

	public void setN (int n)
	{
		this.n = n;
	}

	public void setK (int k)
	{
		this.k = k;
	}

	public static combin random (range range1)
	{
		Random rand = new Random ();
		boolean comb = rand.nextBoolean ();
		int n = range1.gen ();
		int k = rand.nextInt (n - 1) + 1;
		return new combin (n, k, comb);
	}

	public static void gen (ArrayList < String > questions,
			ArrayList < String > answers, int i)
	{
		Random rand = new Random ();
		int problem = rand.nextInt (2);
		if (problem == 0)
		{
			combin problemC = random (new range (3, 9));
			questions.add ("(" + i + ") $" + problemC + "$ = ");
			answers.add (String.valueOf (problemC.toAns ()));
		}
		if (problem == 1)
		{
			OofO comb = new OofO ();
			comb.placeholder (random (new range (3, 8)),
					random (new range (3, 6)),
					random (new range (3, 6)), 2);
			questions.add ("(" + i + ") $" + comb.getQuest () + "$");
			answers.add (comb.getAns ());
		}
	}

	public String toString ()
	{
		if (comb)
		{
			return "_{" + n + "}C_{" + k + "}";
		}
		return "_{" + n + "}P_{" + k + "}";
	}
}
