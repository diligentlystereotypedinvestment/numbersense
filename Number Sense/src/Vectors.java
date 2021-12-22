import java.util.Random;
import java.util.ArrayList;

public class Vectors {
	static int[][] pymag;

	public static void gen(ArrayList<String> questions, ArrayList<String> answers, int i){
		pymag = new int[RightTriangle.leg1.length][];
		for(int a = 0; a < RightTriangle.leg1.length; a++){
			pymag[a] = new int[] {RightTriangle.leg1[a], RightTriangle.leg2[a], RightTriangle.hypo[a]};
		}
		Random rand = new Random();
		boolean isMag = rand.nextBoolean();
		if(isMag){
			int type = rand.nextInt(); //add more types: by itself, multiplication
			int tri= rand.nextInt(pymag.length);
			int dev1 = rand.nextInt(pymag[tri][0]) - pymag[tri][0];
			int dev2 = rand.nextInt(pymag[tri][1]) - pymag[tri][1];
			questions.add("(" + i + ") If \\(\\vec{u} = (" + dev1 + ", " + dev2 + ")\\) and \\(\\vec{v} = (" + pymag[tri][0] + dev1 + ", " + pymag[tri][1] + dev2 + "), then what is |\\vec{u} + \\vec{v}|?");
			answers.add(String.valueOf(pymag[tri][2]));
		} else {
			int x1 = rand.nextInt(40) - 20;
			int x2 = rand.nextInt(40) - 20;
			int y1 = rand.nextInt(40) - 20;
			int y2 = rand.nextInt(40) - 20;
			int operation = rand.nextInt(3);
			if(operation == 0){
				questions.add("(" + i + ") If \\(\\vec{u} = (" + x1 + ", " + y1 + ")\\), $\\vec{v} = (" + x2 + ", " + y2 + ")$, and $u+v = (x,y)$, then what is $x+y$?");
				answers.add(String.valueOf(x1+x2+y1+y2));
			} else if(operation == 1){
				questions.add("(" + i + ") If \\(\\vec{u} = (" + x1 + ", " + y1 + ")\\), $\\vec{v} = (" + x2 + ", " + y2 + ")$, and $u+v = (x,y)$, then what is $x-y$?");
				answers.add(String.valueOf(x1-x2+y1-y2));
			} else if(operation == 1){
				questions.add("(" + i + ") If \\(\\vec{u} = (" + x1 + ", " + y1 + ")\\), $\\vec{v} = (" + x2 + ", " + y2 + ")$, and $u+v = (x,y)$, then what is $x\\cdot y$?");
				answers.add(String.valueOf((x1+x2) * (y2+y1)));
			}

		}
		
	}
}
