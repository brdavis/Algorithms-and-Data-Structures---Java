import java.util.Scanner;

public class palindrome_v1 {
	public static void main(String[] args) {
		//directions and gather input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a word to see if it's a palindrome");
		String word = s.nextLine();
		s.close();
	
		// check if it is a palindrome
		boolean is_palindrome = true;
		int length = word.length();
		int j = length - 1;
		for(int i = 0; i < length; i++) {
			if(word.charAt(i) != word.charAt(j)) {
				is_palindrome = false;
				break;
			}	
			j--;	
		}

		//print result
		if (is_palindrome) {
			System.out.println("The word you entered is a palindrome.");
		} else {
			System.out.println("The word you entered is not a palindrome.");
		}
	}
}
