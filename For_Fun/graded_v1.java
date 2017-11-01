import java.util.Scanner;

public class graded_v1 {
	public static void main(String[] args) {
		// directions and gather user input
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the grade you recieved: ");
		int grade = s.nextInt();
		s.close();

		// determine grade
		String letter_grade = "N/A";
		if (grade >= 90) {
			letter_grade = "A";
		} else if (grade >= 80) {
			letter_grade = "B";
		} else if (grade >= 70) {
			letter_grade = "C";
		} else if (grade >= 60) {
			letter_grade = "D";
		} else {
			letter_grade = "F";
		}

		// print result
		System.out.println("You recieved a " + letter_grade);
	}
}
