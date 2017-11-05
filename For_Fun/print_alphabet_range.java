import java.util.Scanner;

public class print_alphabet_range {
	public static void main(String[] args) {
		// directions and gather user input
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the letter you would like to start with: ");
		char first = s.next().charAt(0);

		System.out.println("Enter the letter you would like to end at: ");
		char last = s.next().charAt(0);

		s.close();
		
		// calculate and print requested alphabet range
		System.out.println("The alphabet range you requested is as follows: ");
		if (first > last) {
			System.out.println("Sorry, " + first + " occurs in the alphabet after " + last);
		} else {
			for(char current = first; current <= last; current++) {
				System.out.printf(current + " " );
			}
			System.out.println();
		}
	}

}
