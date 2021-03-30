import java.util.ArrayList;
import java.util.Random;

public enum Unit {

	// null Unit
	NULL_UNIT(-1, Double.NaN),
	
	// 1 : length
	MILLIMETER(Unit.LENGTH, pow(10, -3)), CENTIMETER(Unit.LENGTH, pow(10, -2)), DECIMETER(Unit.LENGTH, pow(10, -1)),
	METER(Unit.LENGTH, 1), DEKAMETER(Unit.LENGTH, pow(10, 1)), HECTOMETER(Unit.LENGTH, pow(10, 2)),
	KILOMETER(Unit.LENGTH, pow(10, 3)), INCH(Unit.LENGTH, CENTIMETER.value * 2.54), FOOT(Unit.LENGTH, INCH.value * 12),
	YARD(Unit.LENGTH, FOOT.value * 3), MILE(Unit.LENGTH, FOOT.value * 5280),
	NAUTICAL_MILE(Unit.LENGTH, METER.value * 1852),

	// 2 : time
	MILLISECOND(Unit.TIME, pow(10, -3)), SECOND(Unit.TIME, 1), MINUTE(Unit.TIME, 60), HOUR(Unit.TIME, 3600),
	DAY(Unit.TIME, 3600 * 24), WEEK(Unit.TIME, 3600 * 24 * 7),

	// 3 : weight
	MILLIGRAM(Unit.WEIGHT, pow(10, -3)), CENTIGRAM(Unit.WEIGHT, pow(10, -2)), DECIGRAM(Unit.WEIGHT, pow(10, -1)),
	GRAM(Unit.WEIGHT, pow(10, 0)), DEKAGRAM(Unit.WEIGHT, pow(10, 1)), HECTOGRAM(Unit.WEIGHT, pow(10, 2)),
	KILOGRAM(Unit.WEIGHT, pow(10, 3)), METRIC_TON(Unit.WEIGHT, KILOGRAM.value), POUND(Unit.WEIGHT, 453.59237),
	STONE(Unit.WEIGHT, POUND.value * 14), OUNCE(Unit.WEIGHT, POUND.value / 16), TON(Unit.WEIGHT, POUND.value * 2000),
	LONG_TON(Unit.WEIGHT, POUND.value * 2240),

	// 4 : area
	SQUARE_METER(Unit.AREA, 1),
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

	// 5 : volume

	// 6 : speed

	;

	public static final int LENGTH = 1, TIME = 2, WEIGHT = 3, AREA = 4, VOLUME = 5, SPEED = 6;

	private final int type; // 1 is length, 2 is time, 3 is weight, 4 is area, 5 is volume, 6 is speed
	private final double value;

	private Unit(int type, double value) {
		this.type = type;
		this.value = value;
	}

	private static double pow(double base, double exp) {
		return Math.pow(base, exp);
	}

	// NOTE: precision won't be completely accurate when using very large or small
	// numbers, but I don't think that a number sense test will call for something
	// of the order 10^-15 or 10^15
	public static double convert(double input, Unit inputUnit, Unit outputUnit) {
		if (inputUnit.type != outputUnit.type) {
			System.out.println(inputUnit.toString() + " is not of the same type as " + outputUnit.toString());
			return Double.NaN;
		} else {
			return input * (outputUnit.value / inputUnit.value);
		}
	}

	private final static ArrayList<Unit> LENGTH_UNITS = new ArrayList<>();
	private final static ArrayList<Unit> TIME_UNITS = new ArrayList<>();
	private final static ArrayList<Unit> WEIGHT_UNITS = new ArrayList<>();
	private final static ArrayList<Unit> AREA_UNITS = new ArrayList<>();
	private final static ArrayList<Unit> VOLUME_UNITS = new ArrayList<>();
	private final static ArrayList<Unit> SPEED_UNITS = new ArrayList<>();

	public static void init() {
		for (Unit unit : values()) {
			switch (unit.type) {
			case 1:
				LENGTH_UNITS.add(unit);
				break;
			case 2:
				TIME_UNITS.add(unit);
				break;
			case 3:
				WEIGHT_UNITS.add(unit);
				break;
			case 4:
				AREA_UNITS.add(unit);
				break;
			case 5:
				VOLUME_UNITS.add(unit);
				break;
			case 6:
				SPEED_UNITS.add(unit);
				break;
			}
		}
	}

	public static Unit getRandomUnit(int type) {
		switch (type) {
		case 1:
			return getRandomUnitFromList(LENGTH_UNITS);
		case 2:
			return getRandomUnitFromList(TIME_UNITS);
		case 3:
			return getRandomUnitFromList(WEIGHT_UNITS);
		case 4:
			return getRandomUnitFromList(AREA_UNITS);
		case 5:
			return getRandomUnitFromList(VOLUME_UNITS);
		case 6:
			return getRandomUnitFromList(SPEED_UNITS);
		default:
			System.out.println("Invalid type value: " + type);
			return NULL_UNIT;
		}
	}

	private static final Random random = new Random();

	private static Unit getRandomUnitFromList(ArrayList<Unit> list) {
		return list.get(random.nextInt(list.size()));
	}

}
