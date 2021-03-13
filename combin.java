import java.util.Random;
import java.util.ArrayList;

public class combin{
	public static int comb(int n, int k){
		return binomialTheorem.factorial(n) / (binomialTheorem.factorial(k) * binomialTheorem.factorial(n - k));
	}

	public static int perm(int n, int k){
		return binomialTheorem.factorial(n) / (binomialTheorem.factorial(n - k));
	}

	public static void gen(Arraylist<String> questions, ArrayList<String> answers){
	}
}
