import java.util.Random;

public class AddImpro
{
	Random rand = new Random ();
	int maxnum1 = rand.nextInt (24) + 1;
	int maxnum2 = rand.nextInt (24) + 1;
	int addfracd = rand.nextInt (maxnum1) + 1;
	int addfracn = rand.nextInt (75 - addfracd);
	int addfracd2 = rand.nextInt (maxnum2) + 1;
	int addfracn2 = rand.nextInt (75 - addfracd2) + maxnum2;
	double sumimpro =
		(1.0 * addfracn / addfracd) + (1.0 * addfracn2 / addfracd2);
	double dimpro = (addfracn / addfracd) - (addfracn2 / addfracd2);
	double pimpro = (addfracn / addfracd) * (addfracn2 / addfracd2);
	double qimpro =
		(1.000 * addfracn / addfracd) / (1.000 * addfracn2 / addfracd2);
}
