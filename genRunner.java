import java.util.ArrayList;

public class genRunner
{
	public static void main (String[]args)
	{
		ArrayList < String > questions = new ArrayList <> ();
		ArrayList < String > answers = new ArrayList <> ();
		System.out.
			println
			("\\documentclass{article}\n\\usepackage[margin=0.5in]{geometry}\n\\usepackage{lipsum}\n\\usepackage{amsmath}\n\\usepackage{setspace}\n\\usepackage{multicol}\n\\newcommand\\textbox[1]{%\n\\parbox{.333\\textwidth}{#1}%\n}\n\\pagenumbering{gobble}\n\\begin{document}\n\\begin{center}\n\\textbf{The University Interscholastic League\\\\\nNumber Sense Test $\\cdot$ HS District $\\cdot$ \\date}\n\\end{center}\n\\hfill Final \\textunderscore\\textunderscore\\textunderscore\\textunderscore \\textunderscore\\textunderscore\\textunderscore\\textunderscore\n\\textunderscore\\textunderscore\\textunderscore\\textunderscore\n\\textunderscore\\textunderscore\\textunderscore\\textunderscore\\textunderscore\\textunderscore\n\n\\noindent \\textbf{Contestant's Number} \\textunderscore\\textunderscore\\textunderscore\\textunderscore\\hfill  2nd \\textunderscore\\textunderscore\\textunderscore\\textunderscore\\textunderscore\\textunderscore\\textunderscore\\textunderscore\n\\textunderscore\\textunderscore\\textunderscore\\textunderscore\n\\textunderscore\\textunderscore\\textunderscore\\textunderscore\\textunderscore\\textunderscore\n\n\\noindent   .\\hfill  1st \\textunderscore\\textunderscore\\textunderscore\\textunderscore \\textunderscore\\textunderscore\\textunderscore\\textunderscore\n\\textunderscore\\textunderscore\\textunderscore\\textunderscore\n\\textunderscore\\textunderscore\\textunderscore\\textunderscore\\textunderscore\\textunderscore\n\n\\noindent \\textbf{Read directions carefully} \\hspace{.45in} {\\textbf{DO NOT UNFOLD THIS SHEET} }\\hfill{\\textbf{Score\\hspace {.05in} Initials}\n\n\\noindent \\textbf{before beginning test} \\hspace{1in}{\\textbf{UNTIL TOLD TO BEGIN}}\\hfill{}\n\n\n\\textbf{Directions}:  Do not turn this page until the person conducting this test gives the signal to begin. This is a ten-minute test. There are 80 problems. Solve accurately and quickly as many as you can in the order in which they appear. ALL  PROBLEMS  ARE  TO  BE SOLVED   MENTALLY.  Make  no  calculations with paper and  pencil.  Write only the answer  in the space provided at the end of each problem.  Problems marked with a  ( * )  require approximate integral answers;  any answer to a starred problem  that is within five percent of the exact answer will be scored correct; all other problems require exact answers.\n\n\n\\textbf{The person conducting this contest should explain these directions to the contestants.}\n\n\\center{\\textbf{STOP -- WAIT FOR SIGNAL!}}\n\n\n\\setstretch{2.1}\n\\begin{multicols}{2}\n\\begin{flushleft}");
		for (int i = 1; i <= 80; i++)
		{

			if (i % 10 == 0)
			{			// Estimation problems
				Estimation estimate = new Estimation (i);
				answers.add (String.valueOf (estimate.getAnswer ()));
				questions.add (("*(" + i + ") " + estimate.getMess ()));
				//for (int q = 0; q < 60 - estimate.getMess().length(); q++) {
				// System.out.print("\\textunderscore");
				//}
				// System.out.println();
				// System.out.println();
				continue;
			}
			if (i < 21)
			{
				qUp20 questions20 = new qUp20 ();
				questions20.Gen (questions, answers, i);
			}
			if (i > 20 && i < 41)
			{			// Questions 21-40
				qUp40 questions40 = new qUp40 ();
				questions40.Gen (questions, answers, i);
			}
			if (i > 40 && i < 61)
			{			// Questions 41-60
				qUp60 questions60 = new qUp60 ();
				questions60.Gen (questions, answers, i);
			}
			if (i > 60 && i < 71)
			{			// Questions 61-70
				qUp70 questions70 = new qUp70 ();
				questions70.Gen (questions, answers, i);
			}
			if (i > 70 && i < 81)
			{			// Questions 71-80
				qUp80 questions80 = new qUp80 ();
				questions80.Gen (questions, answers, i);
			}
		}

		while (questions.size () < 80)
		{
			questions.add ("0");
		}
		while (answers.size () < 80)
		{
			answers.add ("0");
		}
		questions.trimToSize ();
		answers.trimToSize ();
		for (String e:questions)
		{
			System.out.print (e);
			if (e.equals (null))
			{
				continue;
			}
			if (e.indexOf ("\\hrulefill") == -1)
			{
				System.out.println ("\\hrulefill");
			}
			System.out.print ("\n\n");
		}
		System.out.println ("\\end{flushleft}\\end{multicols}");
		System.out.println ("\\clearpage\n\\begin{multicols}{4}\n");
		int i = 1;
		for (String e:answers)
		{
			if (e.indexOf ("$") == -1)
			{
				System.out.print (i + ") $" + e + "$\n\n");
			}
			else
			{
				System.out.print (i + ") " + e + "\n\n");
			}
			i++;
		}
		System.out.println ("\n\n\\end{multicols}\n");
		System.out.println ("\n\n\\end{document}");
	}
}
