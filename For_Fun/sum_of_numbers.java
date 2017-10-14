import java.util.Scanner;

public class sum_of_numbers {
	public static void main(String[] args) {
		// directions and gather user input
		Scanner s = new Scanner(System.in);
		System.out.println("This program will find the sum (inclusive) of a range of numbers.");
		System.out.println("Enter the number you would like to start at:");
		int start = s.nextInt();
		System.out.println("Enter the number you would like to end at:");
		int end = s.nextInt();

		// evaluate
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += i;
		}

		// print result
		System.out.println("The sum is " + sum);
	}
}
