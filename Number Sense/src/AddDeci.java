import java.util.Random;

public class AddDeci {
	Random rand = new Random();
	int maxnum1 = rand.nextInt(24) + 1;
	int maxnum2 = rand.nextInt(24) + 1;
	int addfracn = rand.nextInt(maxnum1);
	int addfracd = rand.nextInt(30 - addfracn) + addfracn;
	double adddeci = (rand.nextInt(900) + (1.000 * addfracn / addfracd)) * 100;
	int addfracn2 = rand.nextInt(maxnum2);
	int addfracd2 = rand.nextInt(30 - addfracn2) + addfracn2;
	double adddeci2 = (rand.nextInt(900) + (1.000 * addfracn2 / addfracd2)) * 100;
	double sumdeci = ((int) adddeci / 100.0) + ((int) adddeci2 / 100.0);
	double ddeci = ((int) adddeci / 100.0) - ((int) adddeci2 / 100.0);
	double pdeci = ((int) (adddeci / 100) / 100.0) * ((int) (adddeci2 / 100) / 100.0);
	double qdeci = 1.0 * ((int) adddeci / 10.0) / ((int) adddeci2 / 10.0);
}
