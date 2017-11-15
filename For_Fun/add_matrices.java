import java.util.Scanner;

class add_matrices {
	public static void main(String[] args) {
		// directions and gather user input
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the number of rows in your matrix: ");
		int rows = s.nextInt();

		System.out.print("Enter the number of columns in your matrix: ");
		int columns = s.nextInt();

		// set up matrices
		int first_matrix[][] = new int[rows][columns];
		int second_matrix[][] = new int[rows][columns];
		int result_matrix[][] = new int[rows][columns];

		// collect data
		// collect first matrix
		System.out.println("Enter the elements for the first matrix");
		for(int row_num = 0; row_num < rows; row_num++) {
			for(int col_num = 0; col_num < columns; col_num++) {
				first_matrix[row_num][col_num] = s.nextInt();
			}
		}
	
		// collect second matrix
		System.out.println("Enter the elements for the second matrix");
		for(int row_num = 0; row_num < rows; row_num++) {
			for(int col_num = 0; col_num < columns; col_num++) {
				second_matrix[row_num][col_num] = s.nextInt();
			}
		}

		// calculate the resulting sum matrix
		for(int row_num = 0; row_num < rows; row_num++) {
			for(int col_num = 0; col_num < columns; col_num++) {
				result_matrix[row_num][col_num] = first_matrix[row_num][col_num] + second_matrix[row_num][col_num];
			}
		}

		// print out results
		System.out.println("The sum of the entered matrices is the following matrix: ");
		for(int row_num = 0; row_num < rows; row_num++) {
			for(int col_num = 0; col_num < columns; col_num++) {
				System.out.print(result_matrix[row_num][col_num] + " ");
			}
			System.out.println();
		}
	}
}
