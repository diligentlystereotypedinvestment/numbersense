import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

public class Matrix {
	private int[][] matrix;
	private static Random rand = new Random();

	public Matrix(int[][] matrix){
		this.matrix = matrix;
	}

	public int determinant(){
		return determinant(matrix);
	}

	public static int determinant(int[][] matrix){
		int det = 0;
		if(matrix.length == 1){
			return matrix[0][0];
		} else{
			for(int i = 0; i < matrix.length; i++){
				if(i % 2 == 0){
					det += matrix[i][0] * determinant(smallerMatrix(matrix, i));
				} else{
					det -= matrix[i][0] * determinant(smallerMatrix(matrix, i));
				}
			}
		}
		return det;
	}

	public static int[][] smallerMatrix(int[][] matrix, int position){
		int[][] smol = new int[matrix.length - 1][matrix.length - 1];
		boolean pastColumn = false;
		for(int i = 0; i < matrix.length; i++){
			if(i == position){
				pastColumn = true;
			} else{
				for(int down = 1; down < matrix.length; down++){
					if(pastColumn){
						smol[i - 1][down - 1] = matrix[i][down];
					} else{
						smol[i][down - 1] = matrix[i][down];
					}
				}
			}
		}
		return smol;
	}
	
	public int getElement(int row, int column){
		return matrix[row][column];
	}

	public static Matrix random(int size){
		int[][] matrix = new int[size][size];
		for(int i = 0; i < matrix.length; i++){
			for(int a = 0; a < matrix[i].length; a++){
				int random = rand.nextInt(11) - 5;
				while(random == 0){
					random = rand.nextInt(11) - 5;
				}
				matrix[i][a] = random;
			}
		}
		return new Matrix(matrix);
	}

	public String toString(){
		String firstLine = "$\\big[\\begin{smallmatrix}\n";
		String entries = "";
		for(int i = 0; i < matrix.length; i++){
			if(i == matrix.length - 1){
				for(int a = 0; a < matrix[i].length; a++){
					if(a == 0){
						entries += matrix[i][a];
					} else{
						entries += " & " + matrix[i][a];
					}
				}
			} else{
				for(int a = 0; a < matrix[i].length; a++){
					if(a == 0){
						entries += matrix[i][a];
					} else if(a == matrix[i].length - 1){
						entries += " & " + matrix[i][a] + "\\\\";
					} else{
						entries += " & " + matrix[i][a];
					}
				}
			}
			entries += "\n";
		}
		String lastLine = "\\end{smallmatrix}\\big]$";
		return firstLine + entries + lastLine;
	}
	
	public String toString(int row, int column){//replacing a matrix element with k
		String firstLine = "$\\big[\\begin{smallmatrix}\n";
		String entries = "";
		for(int i = 0; i < matrix.length; i++){
			for(int a = 0; a < matrix[i].length; a++){
				if(a != 0){
					entries += " & ";
				}
				if(i == row && a == column){
					entries += "k";
				} else{
					entries += matrix[i][a];
				}
				if(a == matrix.length - 1 && i != matrix.length - 1){
					entries += "\\\\";
				}
			}
			entries += "\n";
		}
		String lastLine = "\\end{smallmatrix}\\big]$";
		return firstLine + entries + lastLine;
	}

	public static void gen(ArrayList<String> questions, ArrayList<String> answers, int i){
		int size = rand.nextInt(2) + 2;
		Matrix matrix = random(size);
		if(size == 2){//many possibile variations here; missing element, determinant, etc
			int type = rand.nextInt(2);
			if(type == 0){
				questions.add("(" + i + ") What is the determinant of " + matrix.toString() + "?");
				answers.add(String.valueOf(matrix.determinant()));
			} else if(type == 1){
				int row = rand.nextInt(2);
				int column = rand.nextInt(2);
				questions.add("(" + i + ") What is the value of $k$ if " + matrix.toString(row, column) + " = " + matrix.determinant() + "?");
				answers.add(String.valueOf(matrix.getElement(row, column)));
			}
		} else{
			questions.add("(" + i + ") What is the determinant of " + matrix.toString() + "?");
			answers.add(String.valueOf(matrix.determinant()));
		}
	}
}