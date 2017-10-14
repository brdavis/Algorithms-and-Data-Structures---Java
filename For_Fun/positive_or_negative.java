import java.util.Scanner;

public class positive_or_negative {
	public static void main(String[] args) {
		// directions and gather user input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number and see if it is positive or negative");
		int number = s.nextInt();

		// evaluate and print result
		if ( number > 0) {
			System.out.println("That number is positive.");
		} else if (number < 0) {
			System.out.println("That number is negative.");
		} else { // it is 0
			System.out.println("Zero is special.");
		}
	}
}
