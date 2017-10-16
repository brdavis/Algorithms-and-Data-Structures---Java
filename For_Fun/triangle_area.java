import java.util.Scanner;

public class triangle_area {
	public static void main(String[] args) {
		//directions and user input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the base of the triangle: ");
		int base = s.nextInt();
		System.out.println("Enter the height of the triangle: ");
		int height = s.nextInt();
		
		//calculate area of triangle
		int area = ( base * height ) / 2;

		//print result
		System.out.println("The area of your triangle is " + area);
	}
}
