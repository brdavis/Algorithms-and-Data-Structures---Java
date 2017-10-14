import java.util.Scanner;

public class reverse_string {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please inter a word you wish to reverse");
		String word = s.nextLine();
		String word_reversed = Reverse(word);
				
		System.out.println(word_reversed);
	}

	public static String Reverse(String word) {
		if(word.isEmpty()) {
			return word;
		}
		return Reverse(word.substring(1)) + word.charAt(0);
	}
}
