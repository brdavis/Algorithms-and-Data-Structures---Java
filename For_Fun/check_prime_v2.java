import java.util.Scanner;

public class check_prime_v2 {
	public static void main(String[] args) {
		// directions
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to determine if it is prime.");

		// collect user input
		int number = s.nextInt();

		// determine result
		boolean is_prime = true;
		int mid_pt = number/2;
		for(int i = 2; i <=  mid_pt; i++) {
			if((mid_pt % 2) == 0) {
				is_prime = false;
				break;
			}
		}	

		// print result
		if (is_prime == true) {
			System.out.println("The number you entered is prime.");
		} else {
			System.out.println("The number you entered is not prime.");
		}
			
	}
}
