import java.util.Scanner;
import java.util.Random;

public class dice_simulation {
	public static void main(String[] args) {
		//directions and user input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of faces your dice has: ");
		int faces = s.nextInt();
		s.close();
	
		// simulate roll of die
		Random r = new Random();
		int roll = 1 + r.nextInt(faces);

		//print result
		System.out.println("The number you rolled is : " + roll);
	}
}
