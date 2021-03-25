public class SumOfDivisors
{
	int num (int base)
	{
		int number = base;
		int divisorCNT;

		divisorCNT = 0;

		for (int loop = 1; loop <= number; loop++)
		{
			if (number % loop == 0)
				divisorCNT++;
		}
		return divisorCNT;

	}

	int sum (int base)
	{
		int tempsum = 0;

		for (int loop = 1; loop <= base; loop++)
		{
			if (base % loop == 0)
				tempsum = tempsum + loop;
		}
		return tempsum;

	}
}
