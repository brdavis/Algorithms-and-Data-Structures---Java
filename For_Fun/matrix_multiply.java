import java.util.Scanner;

public class matrix_multiply {
	public static void main(String[] args) {
	// directions and gather user input
	Scanner s = new Scanner(System.in);

	System.out.println("Enter the number of rows in your matrices: ");
	int rows = s.nextInt();

	System.out.println("Enter the number of columns in your matrices: ");
	int columns = s.nextInt();

	// set up matrices
	int first_matrix[][] = new int[rows][columns];
	int second_matrix[][] = new int[rows][columns];
	int result_matrix[][] = new int[rows][columns];

	// collect elements for  matrices
	System.out.println("Enter the elements for the first matrix:");
	for(int row_num = 0; row_num < rows; row_num++) {
		for(int col_num = 0; col_num < columns; col_num++) {
			first_matrix[row_num][col_num] = s.nextInt();
		}
	}

	System.out.println("Enter the elements for the second matrix:");
	for(int row_num = 0; row_num < rows; row_num++) {
		for(int col_num = 0; col_num < columns; col_num++) {
			second_matrix[row_num][col_num] = s.nextInt();
		}
	}

	// multiply the matrices
	int sum = 0;
	for(int row_num = 0; row_num < rows; row_num++) {
		for(int col_num = 0; col_num < columns; col_num++) {
			for(int pass_num = 0; pass_num < rows; pass_num++) {
				sum = sum + first_matrix[row_num][pass_num] * second_matrix[pass_num][col_num];
			}
			result_matrix[row_num][col_num] = sum;
			sum = 0;
		}
	}	

	// print result
	System.out.println("The result is: ");
	for(int row_num = 0; row_num < rows; row_num++) {
		for(int col_num = 0; col_num < columns; col_num++) {
			System.out.print(result_matrix[row_num][col_num] + " ");
		}
		System.out.println();
	}

	}
}
