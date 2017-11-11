import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		// directions and gather user input
		System.out.println("What number would you like a factorial of?");
		Scanner s = new Scanner(System.in);
		int target = s.nextInt();
		s.close();
		
		//catch exceptions
		if (target <= 0) {
			System.out.println("Cannot calculate factorial of zero or a negative number");
		}

		//calculate and print result
		int result = 1;
		for(int i = 1; i <= target; i++) {
			result = result * i; 
		}
		System.out.println("The factorial of " + target + " is " + result);
	}
}
