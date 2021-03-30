
public enum Unit {

	// 1 : length
	MILLIMETER(1, pow(10, -3)), CENTIMETER(1, pow(10, -2)), DECIMETER(1, pow(10, -1)), METER(1, 1),
	DEKAMETER(1, pow(10, 1)), HECTOMETER(1, pow(10, 2)), KILOMETER(1, pow(10, 3)), INCH(1, CENTIMETER.value * 2.54),
	FOOT(1, INCH.value * 12), YARD(1, FOOT.value * 3), MILE(1, FOOT.value * 5280), NAUTICAL_MILE(1, METER.value * 1852),

	// 2 : time
	MILLISECOND(2, pow(10, -3)), SECOND(2, 1), MINUTE(2, 60), HOUR(2, 3600), DAY(2, 3600 * 24), WEEK(2, 3600 * 24 * 7),

	// 3 : weight
	MILLIGRAM(3, pow(10, -3)), CENTIGRAM(3, pow(10, -2)), DECIGRAM(3, pow(10, -1)), GRAM(3, pow(10, 0)),
	DEKAGRAM(3, pow(10, 1)), HECTOGRAM(3, pow(10, 2)), KILOGRAM(3, pow(10, 3)), METRIC_TON(3, KILOGRAM.value),
	POUND(3, 453.59237), STONE(3, POUND.value * 14), OUNCE(3, POUND.value / 16), TON(3, POUND.value * 2000),
	LONG_TON(3, POUND.value * 2240),

	// 4 : area
	SQUARE_METER(4, 1),
//	SQUARE_METER(4, pow(10, -2)),
//	DECIGRAM(4, pow(10, -1)),
//	GRAM(4, pow(10, 0)),
//	DEKAGRAM(4, pow(10, 1)),
//	HECTOGRAM(4, pow(10, 2)),
//	KILOGRAM(4, pow(10, 3)),
//	METRIC_TON(4, KILOGRAM.value),
//	POUND(4, 453.59237),
//	STONE(4, POUND.value * 14),
//	OUNCE(4, POUND.value / 16),
//	TON(4, POUND.value * 2000),
//	LONG_TON(4, POUND.value * 2240),

	;

	public final int type; // 1 is length, 2 is time, 3 is weight, 4 is area, 5 is volume, 6 is speed
	public final double value;

	private Unit(int type, double value) {
		this.type = type;
		this.value = value;
	}

	private static double pow(double base, double exp) {
		return Math.pow(base, exp);
	}

	// NOTE: precision won't be completely accurate when using very large or small numbers, but I don't think that a number sense test will call for something of the order 10^-15 or 10^15
	public static double convert(double input, Unit inputUnit, Unit outputUnit) {
		if (inputUnit.type != outputUnit.type) {
			System.out.println(inputUnit.toString() + " is not of the same type as " + outputUnit.toString());
			return Double.NaN;
		} else {
			return input * (outputUnit.value / inputUnit.value);
		}
	}

}
