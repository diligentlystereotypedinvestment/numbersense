import java.util.Arrays;

public class Matrix {
	private int[][] matrix;

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
					det += determinant(smallerMatrix(matrix, i));
				} else{
					det -= determinant(smallerMatrix(matrix, i));
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
						smol[i - 1][down] = matrix[i][down];
					} else{
						smol[i][down] = matrix[i][down];
					}
				}
			}
		}
		return smol;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new int[][] {{0,1},
		       	{1,0}}));
		System.out.println(determinant(new int[][] {{0,1},
		       	{1,0}}));
	}
}
