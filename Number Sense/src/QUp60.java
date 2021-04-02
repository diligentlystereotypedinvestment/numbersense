import java.util.Random;
import java.util.ArrayList;

class QUp60 {
	public void Gen(ArrayList<String> questions, ArrayList<String> answers, int i) {
		Random rand = new Random();
		int random = rand.nextInt(97) + 1;
		if (random == 1 || random == 2 || random == 3) { // exponents
			OofO o = new OofO();
			questions.add("(" + i + ") " + o.exponent());
			answers.add(String.valueOf(o.outsolution));
		}

		if (random == 4 || random == 5 || random == 6) { // polygons
			Polygons shapes = new Polygons();
			shapes.gen(questions, answers, i);
		}

		if (random == 7 || random == 8 || random == 9) { // right triangle problems
			RightTriangle.gen(questions, answers, i);
		}

		if (random == 10 || random == 11 || random == 12) { // sequences
			Sequences seq = new Sequences();
			seq.questionGen(i);
			questions.add(seq.getQuestion());
			answers.add(seq.getAnswer());
		}
		if (random == 13 || random == 14 || random == 15) { // polygonal numbers
			PolygonalNumbers.gen(questions, answers, i);
		}

		if (random == 16 || random == 17 || random == 18) { // base operations
			OofO.baseGen(questions, answers, i);
		}

		if (random == 19 || random == 20 || random == 21) { // inverses/direct
			Ratio.gen(questions, answers, i);
		}

		if (random == 22 || random == 23 || random == 24) { // inequality problems (not polticial, mathematical)
			Equations.genInequal(i, questions, answers);
		}

		if (random == 25 || random == 26 || random == 27) { // binomial theorem
			BinomialTheorem.gen(questions, answers, i);
		}

		if (random == 28 || random == 29 || random == 30) { // polynomial roots
			Polynomial.polynomialRoots(questions, answers, i);
		}

		if (random == 31 || random == 32 || random == 33) { // coordinate problems
			Coord.gen(questions, answers, i);
		}

		if (random == 34 || random == 35 || random == 36) { // complex num
			ComplexNum.gen(questions, answers, i);
		}

		if (random == 37 || random == 38 || random == 39) { // probability
			Prob probab = new Prob();
			probab.gen(questions, answers, i);
		}

		if (random == 40 || random == 41 || random == 42) { // logarithms
			Log.gen(questions, answers, i);
		}

		if (random == 43 || random == 44 || random == 45) {
			// combin combinations = new combin();
			Combin.gen(questions, answers, i);
		}

		int thirdEqual = 48;
		if (random == thirdEqual - 2 || random == thirdEqual - 1 || random == thirdEqual) { // conics
			Conic.gen(questions, answers, i);
		}
		// thirdEqual += 3;

		if (random > thirdEqual) { // older problems
			QUp40 questions40 = new QUp40();
			questions40.Gen(questions, answers, i);
		}

	}
}
