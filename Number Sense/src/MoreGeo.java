import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoreGeo{
	public static double distance;
	public static void gen(ArrayList<String> questions, ArrayList<String> answers, int i){
		Random rand = new Random();
		int problem = rand.nextInt(6);
		if(problem == 0){//bisector
			int AM = rand.nextInt(7) + 1;
			int AB = rand.nextInt(7) + 1;
			int MC;
			do{
				MC = rand.nextInt(7) + 1;
			} while(AM == MC);
			Frac BC = new Frac(MC * AB, AM);
			List<String> sidesNames = new ArrayList<>(Arrays.asList("AM", "AB", "MC", "BC"));
			List<Object> sides = new ArrayList<>(Arrays.asList(AM, AB, MC, BC));
			int solveForIndex = rand.nextInt(4);
			Object solveFor = sides.get(solveForIndex);
			String solveForName = sidesNames.get(solveForIndex);
			sides.remove(solveForIndex);
			sidesNames.remove(solveForIndex);
			String listOfRemainingSides = sidesNames.get(0) + ", " + sidesNames.get(1) + ", and " + sidesNames.get(2);
			String listOfRemainingValues = sides.get(0) + ", " + sides.get(1) + ", and " + sides.get(2);
			questions.add("(" + i + ") What is the length of " + solveForName + " in $\\triangle ABC$, $M$ is the point where the angle bisector of $\\angle B$ intercepts with $\\overline AC$, and " + listOfRemainingSides + " equals " + listOfRemainingValues + " in that order respectively?");
			answers.add(solveFor.toString());
		} else
		if(problem == 1){//distance
			int[] relativePos = RightTriangle.getTriplet();
			int x = rand.nextInt(10) + 1;
			int y = rand.nextInt(10) + 1;
			questions.add("(" + i + ") What is the distance between the point $(" + (x + relativePos[0]) + ", " + (y + relativePos[1]) + ")$ and $(" + x + ", " + y + ")$?");
			answers.add(String.valueOf(relativePos[2]));
		} else
		if(problem == 2){//distance between parallel lines 
			int[] relativePos = RightTriangle.getTriplet();
			boolean sign = rand.nextBoolean();
			int c1 = rand.nextInt(15) - 5;
			int c2;
			do{
				c2 = rand.nextInt(15) - 5;
			} while(c1 == c2);
			String line1, line2;
			if(sign){
				line1 = "$" + relativePos[0] + "x + " + relativePos[1] + "y = " + (c1) + "$";
				line2 = "$" + relativePos[0] + "x + " + relativePos[1] + "y = " + (c2) + "$";
			} else{
				line1 = "$" + relativePos[0] + "x - " + relativePos[1] + "y = " + (c1) + "$";
				line2 = "$" + relativePos[0] + "x - " + relativePos[1] + "y = " + (c2) + "$";
			}
			questions.add("(" + i + ") What is the distance between the lines with the equations " + line1 + " and " + line2 + "?");
			answers.add(Simp.getFraction(Math.abs(c1 - c2) + "/" + relativePos[2]));
		} else
		if(problem == 3){//rotations
			int multiple = 90 * (rand.nextInt(3) + 1);
			boolean isClockwise = rand.nextBoolean();
			boolean isXUnknown = rand.nextBoolean();
			int rotateX = rand.nextInt(10) + 1;
			int rotateY = rand.nextInt(10) + 1;
			int x, y;
			do{
				x = rand.nextInt(10) + 1;
				y = rand.nextInt(10) + 1;
			} while(x == rotateX && y == rotateY);
			int h, k;
			if(multiple == 180){
				h = rotateX - (x - rotateX);
				k = rotateY - (y - rotateY);
				if(isXUnknown){
					questions.add("(" + i + ") If $(h, k)$ are the $x$ and $y$ coordinates of the rotation of $(" + x + ", " + y + ")$ " + multiple + " degrees around the point $(" + rotateX + ", " + rotateY + ")$, what is $h$?");
					answers.add(String.valueOf(h));
				} else{
					questions.add("(" + i + ") If $(h, k)$ are the $x$ and $y$ coordinates of the rotation of $(" + x + ", " + y + ")$ " + multiple + " degrees around the point $(" + rotateX + ", " + rotateY + ")$, what is $k$?");
					answers.add(String.valueOf(k));
				}
			} else if((multiple == 90 && isClockwise) || (multiple == 270 && !isClockwise)){
				h = x + (rotateY - y);
				k = y - (rotateX - x); 
				if(isClockwise){
					if(isXUnknown){
						questions.add("(" + i + ") If $(h, k)$ are the $x$ and $y$ coordinates of the rotation of $(" + rotateX + ", " + rotateY + ")$ " + multiple + " degrees clockwise around the point $(" + x + ", " + y + ")$, what is $h$?");
						answers.add(String.valueOf(h));
					} else{
						questions.add("(" + i + ") If $(h, k)$ are the $x$ and $y$ coordinates of the rotation of $(" + rotateX + ", " + rotateY + ")$ " + multiple + " degrees clockwise around the point $(" + x + ", " + y + ")$, what is $k$?");
						answers.add(String.valueOf(k));
					}
				} else{
					if(isXUnknown){
						questions.add("(" + i + ") If $(h, k)$ are the $x$ and $y$ coordinates of the rotation of $(" + rotateX + ", " + rotateY + ")$ " + multiple + " degrees counter-clockwise around the point $(" + x + ", " + y + ")$, what is $h$?");
						answers.add(String.valueOf(h));
					} else{
						questions.add("(" + i + ") If $(h, k)$ are the $x$ and $y$ coordinates of the rotation of $(" + rotateX + ", " + rotateY + ")$ " + multiple + " degrees counter-clockwise around the point $(" + x + ", " + y + ")$, what is $k$?");
						answers.add(String.valueOf(k));
					}
				}
			} else if((multiple == 90 && !isClockwise) || (multiple == 270 && isClockwise)){
				h = x - (rotateY - y);
				k = y + (rotateX - x); 
				if(isClockwise){
					if(isXUnknown){
						questions.add("(" + i + ") If $(h, k)$ are the $x$ and $y$ coordinates of the rotation of $(" + rotateX + ", " + rotateY + ")$ " + multiple + " degrees clockwise around the point $(" + x + ", " + y + ")$, what is $h$?");
						answers.add(String.valueOf(h));
					} else{
						questions.add("(" + i + ") If $(h, k)$ are the $x$ and $y$ coordinates of the rotation of $(" + rotateX + ", " + rotateY + ")$ " + multiple + " degrees clockwise around the point $(" + x + ", " + y + ")$, what is $k$?");
						answers.add(String.valueOf(k));
					}
				} else{
					if(isXUnknown){
						questions.add("(" + i + ") If $(h, k)$ are the $x$ and $y$ coordinates of the rotation of $(" + rotateX + ", " + rotateY + ")$ " + multiple + " degrees counter-clockwise around the point $(" + x + ", " + y + ")$, what is $h$?");
						answers.add(String.valueOf(h));
					} else{
						questions.add("(" + i + ") If $(h, k)$ are the $x$ and $y$ coordinates of the rotation of $(" + rotateX + ", " + rotateY + ")$ " + multiple + " degrees counter-clockwise around the point $(" + x + ", " + y + ")$, what is $k$?");
						answers.add(String.valueOf(k));
					}
				}
			}
		} else
		if(problem == 4){//number of regions formed by n intersecting lines
			int n = rand.nextInt(4) + 3;
			questions.add("(" + i + ") What is the maximum number of regions formed by " + n + " intercepting lines?");
			answers.add(String.valueOf((int) (Math.pow(n, 2) + n + 2) / 2));
		} else
		if(problem == 5){//number of possible lines
			int n = rand.nextInt(4) + 5;
			questions.add("(" + i + ") What is the maximum number of lines formed by " + n + " points, given no three are colinear?");
			answers.add(String.valueOf((n * (n - 3)) / 2 + n));
		}
		//if(problem == 6){//distance between point and line; Bryant Heath's book said this typically only appears in the last column
		//}
	}
}
