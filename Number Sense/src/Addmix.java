import java.util.Random;

public class Addmix {
	Random rand = new Random();
	int maxnum1 = rand.nextInt(24) + 1;
	int maxnum2 = rand.nextInt(24) + 1;
	int addmix = rand.nextInt(9000);
	int addfracn = rand.nextInt(maxnum1) + 1;
	int addfracd = rand.nextInt(30 - addfracn) + addfracn;
	int addmix2 = rand.nextInt(9000) + 999;
	int addfracn2 = rand.nextInt(maxnum2) + 1;
	int addfracd2 = rand.nextInt(30 - addfracn2) + addfracn2;
	String summix = "$" + Frac.properAdd((addmix * addfracd + addfracn) + "/" + addfracd, (addmix2 * addfracd2 + addfracn2) + "/" + addfracd2) + "$";
	double dmix = (addmix + (addfracn / addfracd)) - (addmix2 + (addfracn2 / addfracd2));
	double pmix = (addmix / 100 + (addfracn / addfracd)) * (addmix2 / 100 + (addfracn2 / addfracd2));
	double qmix = (addmix / 100 + (1.000 * addfracn / addfracd)) / (addmix2 / 100 + (1.000 * addfracn2 / addfracd2));
}
