import java.util.Scanner;

public class char_to_ascii_v2 {
	public static void main(String[] args) {
		// directions and gather user input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character to find its ascii value");
		char character = s.next().charAt(0);
		
		// find ascii value
		int ascii_value = character;

		// print result
		System.out.println("The ascii value of " + character + " is " + ascii_value);
	}
}
