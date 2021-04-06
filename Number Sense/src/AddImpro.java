import java.util.Random;

public class AddImpro {
	Random rand = new Random();
	int maxnum1 = rand.nextInt(24) + 2;
	int maxnum2 = rand.nextInt(24) + 2;
	int addfracd = rand.nextInt(maxnum1) + 2;
	int addfracn = rand.nextInt(75 - addfracd);
	int addfracd2 = rand.nextInt(maxnum2) + 2;
	int addfracn2 = rand.nextInt(75 - addfracd2) + maxnum2;
	String sumimpro = Frac.add(addfracn + "/" + addfracd, addfracn2 + "/" + addfracd2, false);
	String dimpro = Frac.sub(addfracn + "/" + addfracd, addfracn2 + "/" + addfracd2, false);
	String pimpro = Frac.mult(addfracn + "/" + addfracd, (addfracn2 + "/" +addfracd2), false);
	String qimpro = Frac.div(addfracn + "/" + addfracd, addfracn2 + "/" + addfracd2, false);
}
