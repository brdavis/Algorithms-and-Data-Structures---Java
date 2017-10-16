import java.util.Scanner;

public class square_area {
	public static void main(String[] ars) {
		//directions and user input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of the sides of the square");
		int length = s.nextInt();
		s.close();

		//calculate area of square
		int area = length * length;

		//print results
		System.out.println("The area of your square is " + area);
	}
}
