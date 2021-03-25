import java.util.Random;
import java.util.ArrayList;

class qUp60
{
	public void Gen (ArrayList < String > questions, ArrayList <String> answers, int i)
	{
		Random rand = new Random ();
		int random = rand.nextInt (97) + 1;
		if (random == 1 || random == 2 || random == 3)
		{				//exponents
			OofO o = new OofO ();
			questions.add ("(" + i + ") " + o.exponent ());
			answers.add (String.valueOf (o.outsolution));
		}

		if (random == 4 || random == 5 || random == 6)
		{				//polygons
			polygons shapes = new polygons ();
			shapes.gen (questions, answers, i);
		}

		if (random == 7 || random == 8 || random == 9)
		{				//right triangle problems
			rightTriangle.gen (questions, answers, i);
		}

		if (random == 10 || random == 11 || random == 12)
		{				//sequences
			sequences seq = new sequences ();
			seq.questionGen (i);
			questions.add (seq.getQuestion ());
			answers.add (seq.getAnswer ());
		}
		if (random == 13 || random == 14 || random == 15)
		{				//polygonal numbers
			polygonalNumbers.gen (questions, answers, i);
		}

		if (random == 16 || random == 17 || random == 18)
		{				//base operations
			OofO.baseGen (questions, answers, i);
		}

		if (random == 19 || random == 20 || random == 21)
		{				//inverses/direct
			ratio.gen (questions, answers, i);
		}

		if (random == 22 || random == 23 || random == 24)
		{				//inequality problems (not polticial, mathematical)
			equations.genInequal (i, questions, answers);
		}

		if (random == 25 || random == 26 || random == 27)
		{				//binomial theorem
			binomialTheorem.gen (questions, answers, i);
		}

		if (random == 28 || random == 29 || random == 30)
		{				//polynomial roots
			polynomial.polynomialRoots (questions, answers, i);
		}

		if (random == 31 || random == 32 || random == 33)
		{				//coordinate problems
			coord.gen (questions, answers, i);
		}

		if (random == 34 || random == 35 || random == 36)
		{				//complex num
			complexNum.gen (questions, answers, i);
		}

		if (random == 37 || random == 38 || random == 39)
		{				//probability
			prob probab = new prob ();
			probab.gen (questions, answers, i);
		}

		if (random == 40 || random == 41 || random == 42)
		{				//logarithms
			log.gen (questions, answers, i);
		}

		if (random == 43 || random == 44 || random == 45)
		{
			//combin combinations = new combin();
			combin.gen (questions, answers, i);
		}

		int thirdEqual = 48;
		if (random == thirdEqual - 2 || random == thirdEqual - 1 || random == thirdEqual)
		{				//conics
			conic.gen (questions, answers, i);
		}
		//thirdEqual += 3;

		if (random > thirdEqual)
		{				//older problems
			qUp40 questions40 = new qUp40 ();
			questions40.Gen (questions, answers, i);
		}

	}
}
