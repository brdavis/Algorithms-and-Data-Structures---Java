public class Fizz_buzz {
	public static void main(String[] args) {
		//print program functionality
		System.out.println("This program prints the numbers 1 - 50, except for multiples of 3 the program will print the  word \"Fizz\", and for multiples of 5 the program will print the word \"Buzz\"  and for multiples of both 3 and 5 the program will print the word \"FizzBuzz\".");

		//print the result
		for(int i = 1; i <= 50; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}
