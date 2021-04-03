import java.util.Random;

public class AddImpro {
	Random rand = new Random();
	int maxnum1 = rand.nextInt(24) + 2;
	int maxnum2 = rand.nextInt(24) + 2;
	int addfracd = rand.nextInt(maxnum1) + 2;
	int addfracn = rand.nextInt(75 - addfracd);
	int addfracd2 = rand.nextInt(maxnum2) + 2;
	int addfracn2 = rand.nextInt(75 - addfracd2) + maxnum2;
	String sumimpro = Frac.fracAdd(addfracn + "/" + addfracd, addfracn2 + "/" + addfracd2, false);
	String dimpro = Frac.fracSub(addfracn + "/" + addfracd, addfracn2 + "/" + addfracd2, false);
	String pimpro = Frac.fracMult(addfracn + "/" + addfracd, (addfracn2 + "/" +addfracd2), false);
	String qimpro = Frac.fracDivide(addfracn + "/" + addfracd, addfracn2 + "/" + addfracd2, false);
}
