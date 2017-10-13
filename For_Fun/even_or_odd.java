import java.util.Scanner;

public class even_or_odd {
	public static void main(String[] args) {
		// directions
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to determine if it is even or odd: ");
		
		// collect user input
		int number = s.nextInt();
		
		// determine and print result
		if(number%2 == 0) {
			System.out.println("The number you entered is even.");
		} else {
			System.out.println("The number you entered is odd.");
		}	
	
	}
}
