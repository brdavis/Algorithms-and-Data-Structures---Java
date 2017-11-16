import java.util.Scanner;

public class subtract_matrices {
	public static void main(String[] args) {
		// directions and gather user input
		Scanner s = new Scanner(System.in);
	
		System.out.print("How many rows do your matrices have?: ");
		int rows = s.nextInt();
	
		System.out.print("How many columns do your matrices have? :");
		int columns = s.nextInt();

		int first_matrix[][] = new int[rows][columns];	
		int second_matrix[][] = new int[rows][columns];
		int result_matrix[][] = new int[rows][columns];

		// collect data for each matrix
		// first matrix
		System.out.println("Please enter the first matrix");
		for(int row_num = 0; row_num < rows; row_num++) {
			for(int col_num = 0; col_num < columns; col_num++) {
				first_matrix[row_num][col_num] = s.nextInt();
			}
		}

		// second matrix
		System.out.println("Please enter the second matrix");
		for(int row_num = 0; row_num < rows; row_num++) {
			for(int col_num = 0; col_num < columns; col_num++) {
				second_matrix[row_num][col_num] = s.nextInt();
			}
		}

		// calculate results
		for(int row_num = 0; row_num < rows; row_num++) {
			for(int col_num = 0; col_num < columns; col_num++) {
				result_matrix[row_num][col_num] = first_matrix[row_num][col_num] - second_matrix[row_num][col_num];
			}
		}

		// print results
		System.out.println("The resulting matrix is: ");
		for(int row_num = 0; row_num < rows; row_num++) {
			for(int col_num = 0; col_num < columns; col_num++) {
				System.out.print(result_matrix[row_num][col_num] + " ");
			}
			System.out.println();
		}
	}
}
