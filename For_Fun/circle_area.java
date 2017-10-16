import java.util.Scanner;
import java.lang.Math;

public class circle_area {
	public static void main(String[] args) {
		// directions and user input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		double radius = s.nextInt();

		// calculate area of circle
		double area = Math.PI * Math.pow(radius, 2);

		//print result
		System.out.println("The area of your circle is " + area);
	}
}
