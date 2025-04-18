package basicprogram;

public class Q12_Matrix_Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This program is done by Sumit Malav:");
		int r1 = 2, c1 = 3; // Rows and columns for the first matrix 
		int c2 = 2; // Rows and columns for the second matrix 
		 
		int[][] firstMatrix = { 
		{3, -2, 5}, 
		{3, 0, 4} 
		}; 
		 
		int[][] secondMatrix = { 
		{2, 3}, 
		{-9, 0}, 
		{0, 4} 
		}; 
		 
		// Initialize the product matrix 
		int[][] product = new int[r1][c2]; 
		 
		// Perform matrix multiplication 
		for (int i = 0; i < r1; i++) { 
		for (int j = 0; j < c2; j++) { 
		for (int k = 0; k < c1; k++) { 
		product[i][j] += firstMatrix[i][k] * secondMatrix[k][j]; 
		} 
		} 
		} 
		 
		// Display the result 
		System.out.println("Multiplication of two matrices is:"); 
		for (int[] row : product) { 
		for (int column : row) { 
		System.out.print(column + " "); 
		} 
		System.out.println(); 
		} 
		
	}

}
