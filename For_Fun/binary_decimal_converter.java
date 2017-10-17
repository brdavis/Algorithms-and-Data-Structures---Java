import java.util.Scanner;
import java.lang.*;

public class binary_decimal_converter {
	public static void main(String[] args) {
		//directions
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of digits in your binary number");
		int digits = s.nextInt();
		System.out.println("Enter the binary you wish to convert to decimal");

		// gather input into array
		int[] binary = new int[digits];
		for(int i = 0; i < digits; i++) {
			int input = s.nextInt();
			if(input > 1) {
				System.out.println("Error - incorrect binary input");
				System.exit(1);
			} else {
				binary[i] = input;
			}
		} 

		//calculate
		int decimal = 0;
		for(int i = 0; i < digits; i++) {
			decimal += binary[i] * Math.pow(2, i);
		}

		//print result
		System.out.println("The decimal value of ");
 		for(int j = 0; j < digits; j++) {
	            System.out.printf("%d", binary[j]);
	        }
		System.out.println(" is " + decimal);
	}
}
