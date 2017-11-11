import java.util.Scanner;

public class print_multiplication_table {
	public static void main(String[] args) {
		// directions and gather user input
		System.out.println("What number would you like a multiplication table for?");
		Scanner s = new Scanner(System.in);
		int target = s.nextInt();
		s.close();

		//calculate and print results
		for(int i = 1; i <=12; i++) {
			System.out.println(target + " * " + i + " = " + (target * i));
		}		
	}
}
