import java.util.Scanner;

public class rectangle_area {
	public static void main(String[] args) {
		// directions and user input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle:");
		int length = s.nextInt();
		System.out.println("Enter the width of the rectangle:");
		int width = s.nextInt();
		s.close();
		
		//calculate area
		int area = length * width;

		//print results
		System.out.println("The area of your rectangle is: " + area);
	}
}
