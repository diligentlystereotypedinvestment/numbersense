
public class Factorial {
	int fac(int fact) {
		int answer = 1;
		for(int i = fact; fact > 1; fact--) {
			answer = answer * fact;
		}
	return answer;
	}
}
