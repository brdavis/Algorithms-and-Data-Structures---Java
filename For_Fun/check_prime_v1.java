import java.util.Scanner;

public class check_prime {
	public static void main(String[] args) {
		// directions
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to determine if it is prime or not");
		
		// collect user input
		int number = s.nextInt();

		// determine if it is prime and print result
		for(int i = 2; i < (number - 1); i++){
			if((number % i) == 0) {
				System.out.println("The number you entered is not prime");
				return;
			} 
		}		
		System.out.println("The number you entered is prime");
	}
}
