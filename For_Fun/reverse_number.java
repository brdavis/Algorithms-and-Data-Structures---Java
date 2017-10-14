import java.util.Scanner;

public class reverse_number {
	public static void main(String[] args) {
		// directions and gather input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to be reversed");
		int number = s.nextInt();

		//reverse number
		int reverse_number = 0;
		while(number != 0) {
			reverse_number = reverse_number * 10;
			reverse_number = reverse_number + number%10;
			number = number/10;
		}

		// print result
		System.out.println(reverse_number);
	}
}
