import java.util.Scanner;

public class swap {
	public static void main(String[] args) {
		//directions and gather user input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your first number for value A: ");
		int A = s.nextInt();
		System.out.println("Enter your second number for value B: ");
		int B = s.nextInt();

		//Print before swap
		System.out.println("Before swapping A = " + A + " and B = " + B);
		//perform swap
		int temp = A;
		A = B;
		B = temp;
		
		//Print after swap
		System.out.println("After swapping A = " + A + " and B = " + B);
		
	}
}
