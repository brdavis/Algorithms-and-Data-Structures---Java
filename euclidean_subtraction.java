import java.util.*;
import java.util.Scanner;

public class euclidean_subtraction {
	public static void main (String[] args) {
		//gather input variables from user
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter two numbers to find their gcd.");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("a = " + a + " b = " + b );
		
		//Perform Euclidean algorithm to find gcd
		int gcd = euclidean_algo(a, b);

		// print result
		System.out.println("The gcd of " + a + " and " + b + " is " + gcd);
	}

	public static int euclidean_algo(int a, int b) {
		//Euclidean algorithm
		while( a != b) {
			if (a > b) {
				a = a - b; 
			} else {
				b = b - a;
			}
		}
		return a;
	}
}
