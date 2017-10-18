import java.util.Scanner;

public class vowel_or_consonant {
	public static void main(String[] args) {
		//input and directions
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a letter to see if it's a vowel or a consonant");
		char letter = s.next().charAt(0);
	
		//check if vowel or not
		char[] vowels = {'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'};
		boolean is_vowel = false;
		for(int i = 0; i < vowels.length; i++) {
			if (vowels[i] == letter) {
				is_vowel = true;
				break;
			}
		}

		//print result
		if (is_vowel) {
			System.out.println("The letter you entered is a vowel");
		} else {
			System.out.println("The letter you entered is a consonant");
		}
	}
}
