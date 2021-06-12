public class Factorial {
	public static int fac(int fact) {
		int answer = 1;
		// for(int i = fact; fact > 1; fact--) {
		// answer = answer * fact;
		// }
		while (fact > 1) {
			answer = answer * fact;
			fact--;
		}
		return answer;
	}
}
