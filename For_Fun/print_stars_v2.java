import java.util.Scanner;

public class print_stars_v2 {
	public static void main(String[] args) {
		//directions and user input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows you would like in the star pyramid");
		int rows = s.nextInt();

		//print star pyramid
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}
