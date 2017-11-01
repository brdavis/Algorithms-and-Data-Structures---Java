import java.util.Scanner;

public class graded_v2 {
	public static void main(String[] args) {
		// directions and user input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the grade you recieved: ");
		char grade = s.next().charAt(0);
		s.close();

		// determine given grade
		String letter_grade = "N/A";
		switch(grade) {
			case 'A':
				System.out.println("Your grade was between 90 - 100");
				break;
			case 'B':
				System.out.println("Your grade was between 80 - 90");
				break;
			case 'C':
				System.out.println("Your grade was between 70 - 80");
				break;
			case 'D':
				System.out.println("Your grade was between 60 - 70");
				break;
			case 'F':
				System.out.println("Your grade was lower than 60");
		}

	}
}
