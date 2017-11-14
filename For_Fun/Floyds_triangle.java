import java.util.Scanner;

public class Floyds_triangle {
	public static void main(String[] args) {
		// gather user input
		Scanner s = new Scanner(System.in);
		System.out.print("How many lines of Floyds triangle would you like to print?: ");

		int num_lines = s.nextInt();

		s.close();

		// calculate and print Floyd's triangle for appropriate num of lines
		int current_count = 1;
		for(int i = 1; i < num_lines; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(current_count + " ");
				current_count++;
			}
			System.out.println();
		}		
	}
}
