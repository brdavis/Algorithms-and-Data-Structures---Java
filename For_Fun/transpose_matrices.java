import java.util.Scanner;

class transpose_matrices {
	public static void main(String[] args) {
		// directions and gather user input
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number of rows in your matrix: ");
		int rows = s.nextInt();

		System.out.print("Enter the number of columns in your matrix: ");
		int columns = s.nextInt();

		// set up matrices
		int original_matrix[][] = new int[rows][columns];
	//	int transposed_matrix[][] = new int[columns][rows];

		// collect elements in original matrix
		System.out.println("Enter the elements for the matrix:");
		for(int row_num = 0; row_num < rows; row_num++){
			for(int col_num = 0; col_num < columns; col_num++) {
				original_matrix[row_num][col_num] = s.nextInt();
			}
		}

		// set up transposed matrix
		int transposed_matrix[][] = new int[columns][rows];
		
		// transpose original matrix
		for(int row_num = 0; row_num < rows; row_num++) {
			for(int col_num = 0; col_num < columns; col_num++) {
				transposed_matrix[col_num][row_num] = original_matrix[row_num][col_num];
			}
		}

		// print out results
		System.out.println("The transposed matrix of the original matrix is: ");
		for(int row_num = 0; row_num < rows; row_num++) {
			for(int col_num = 0; col_num < columns; col_num++) {
				System.out.print(transposed_matrix[row_num][col_num] + " ");	
			}
			System.out.println();
		}		
	}
}
