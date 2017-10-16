import java.util.Scanner;

public class print_stars_v1 {
	public static void main(String[] args) {
		// directions and gather user input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows of of the star pyramid");
		int rows = s.nextInt();
		String star = "*";

		// print star pyramid
		for(int i = 1; i <= rows; i++) {
			int j = i;
			while(j != 0) {
				System.out.printf("%s", star);
				j--;
			}
			System.out.printf("\n"); 
		}
	}
}

