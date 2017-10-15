import java.util.Scanner;

public class mathematic_operations {
	public static void main(String[] args) {
		//directions and gather user input
		Scanner s = new Scanner(System.in);
		System.out.println("This program can perform any mathematical operation on two numbers.");
		System.out.println("Please two  numbers:");
		int first_number = s.nextInt();
		int second_number = s.nextInt();

		// indicate mathematic operation and find result
		System.out.println("Please indicate the mathematic operation (+, -, *, /)"); 
		char operator = s.next().charAt(0);

		int result;
		switch(operator) {
			case '+': 
				result = addition(first_number, second_number); 
				break;
			case '-':
				result = subtraction(first_number, second_number);
				break;
			case '*':
				result = multiplication(first_number, second_number);
				break;
			case '/':
				result = division(first_number, second_number);
				break;
			default:
				System.out.println("Error");
				return; 
		}
		// print result
		System.out.println("The result is " + result);
	}

	public static int addition(int x, int y) {
		return x + y;
	}

	public static int subtraction(int x, int y) {
		return x - y;
	}

	public static int multiplication(int x, int y) {
		return x * y;
	}

	public static int division(int x, int y) {
		return x/y;
	}
}
