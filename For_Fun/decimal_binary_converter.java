import java.util.Scanner;
import java.lang.*;
import java.util.ArrayList;

public class decimal_binary_converter {
	public static void main(String[] args) {
		//directions and user input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the decimal number you wish to convert to binary");
		int decimal = s.nextInt();

		//calculate
		ArrayList<Integer> binary = new ArrayList<Integer>();
		while(decimal != 0) {
			int binary_digit = decimal%2;
			binary.add(0, binary_digit);
			decimal = decimal/2;
		}

		//print result
		System.out.println("The binary conversion of your number is" );
		for(int i = 0; i < binary.size(); i++) {
			System.out.printf("%d", binary.get(i));
		}
		System.out.println();
	}
}
