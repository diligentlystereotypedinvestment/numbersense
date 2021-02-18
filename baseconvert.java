
public class baseconvert {
	public static String newnum(int deci, int base) {
		String tempnew = "";
		if (base > 10) {
			for (int i = 1; i < 10; i++) {
				char overTen = 0;
				if (deci == 0) {
					break;
				}
				if (deci % base >= 10) {
					overTen = (char) ((deci % base) + 55);
					tempnew = (char) overTen + tempnew;
				} else {
					tempnew = deci % base + tempnew;
				}
				deci = (int) (deci - (deci % (base))) / base;
			}
		} else {
			for (int i = 1; i < 10; i++) {
				if (deci == 0) {
					break;
				}
				tempnew = String.valueOf((deci % base)) + tempnew;
				deci = (int) (deci - (deci % (base))) / base;
			}
		}
		return tempnew;
	}

	public static int ognum(String deci, int base) {
		int tempog = 0;
		if (base < 10) {
			for (int i = 1; i < 10; i++) {
				if (Integer.valueOf(deci) == 0) {
					break;
				}
				tempog = (int) ((Integer.valueOf(deci) % 10) * Math.pow(base, i - 1) + tempog);
				deci = String.valueOf((int) (Integer.valueOf(deci) - (Integer.valueOf(deci) % (10))) / 10);
			}
		} else {
			String[] eachdeci = deci.split("");
			for (int j = 0; j < eachdeci.length; j++) {
				char letter = 65;
				for (int e = 0; e < 26; e++) {
					if (eachdeci[eachdeci.length - j - 1].equals(String.valueOf(letter))) {
						tempog = (int) (tempog + (int) (letter - 55) * Math.pow(base, j));
					}
					letter++;
				}
				int counter = 0;
				for (int k = 65; k < 26; k++) {
					char tempLetter = (char) k;
					if (!eachdeci[eachdeci.length - j - 1].equals(String.valueOf(tempLetter))) {
						counter++;
					}
				}
				if (counter == 26) {
					tempog = (int) (tempog + Integer.valueOf(eachdeci[eachdeci.length - j - 1]) * Math.pow(base, j));
				}
				//				if (eachdeci[eachdeci.length - j - 1].equals("A")) {
				//					tempog = (int) (tempog + 10 * Math.pow(base, j));
				//				}
				//				if (eachdeci[eachdeci.length - j - 1].equals("B")) {
				//					tempog = (int) (tempog + 11 * Math.pow(base, j));
				//				}
				//				if (eachdeci[eachdeci.length - j - 1].equals("C")) {
				//					tempog = (int) (tempog + 12 * Math.pow(base, j));
				//				}
				//				if (eachdeci[eachdeci.length - j - 1].equals("D")) {
				//					tempog = (int) (tempog + 13 * Math.pow(base, j));
				//				}
				//				if (!eachdeci[eachdeci.length - j - 1].equals("A") && !eachdeci[eachdeci.length - j - 1].equals("B") && !eachdeci[eachdeci.length - j - 1].equals("C") && !eachdeci[eachdeci.length - j - 1].equals("D")) {
				//					tempog = (int) (tempog + Integer.valueOf(eachdeci[eachdeci.length - j - 1]) * Math.pow(base, j));
				//				}

			}
		}
		return tempog;
	}
}
