import java.util.Scanner;

public class substring_last_index {
	public static void main(String[] args) {
		//directions and gather user input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string you wish to search");
		String given_string = s.nextLine();
		System.out.println("Enter the substring you wish to find the beginning of");
		String substring = s.nextLine();
		s.close();
		
		//calculate index of last substring
		int index = given_string.lastIndexOf(substring);
		
		//print result
		if(index < 0 ) {
			System.out.println("The substring you requested was not found within the search string");
		} else {
			System.out.println("The substring \"" + substring + "\" was found at index " + index + 
					   " of the given string \"" + given_string + "\"");
		}
	}
}
