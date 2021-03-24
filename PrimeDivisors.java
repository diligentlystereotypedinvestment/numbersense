import java.util.ArrayList;

public class PrimeDivisors
{
	public ArrayList < Integer > prime (int num)
	{
		IsPrime check = new IsPrime ();
		ArrayList < Integer > list1 = new ArrayList <> ();
		for (int i = 1; i <= num / 2; i++)
		{
			if (num % i == 0)
			{
				if (check.prime (i))
				{
					list1.add (i);
				}
			}
		}
		return list1;
	}

	public int primesum (int base)
	{
		int sum = 0;
		for (int i = 1; i <= base / 2; i++)
		{
			if (base % i == 0)
			{
				sum = sum + i;
			}
		}
		return sum;
	}

	public static ArrayList < Integer > factor (int num)
	{
		ArrayList < Integer > list1 = new ArrayList <> ();
		for (int i = 1; i <= num / 2; i++)
		{
			if (num % i == 0)
			{
				list1.add (i);
			}
		}
		return list1;
	}
}
