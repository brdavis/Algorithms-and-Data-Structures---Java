import java.util.Scanner;

public class char_to_ascii_v1 {
	public static void main(String[] args) {
		// directions and gather user input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a letter and find out its ascii value");
		char letter = s.next().charAt(0);
		
		// evaluate via typecasting
		int ascii_value_of_letter = (int) letter;

		// print result
		System.out.println("The ascii value of " + letter + " is " + ascii_value_of_letter);

	}
}
