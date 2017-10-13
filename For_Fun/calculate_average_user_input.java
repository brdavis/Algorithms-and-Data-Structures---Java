import java.util.Scanner;

public class calculate_average_user_input {
	public static void main(String[] args) {
		//get user input
		Scanner s = new Scanner(System.in);
		System.out.println("Please input all numbers you wish to find and average of, then type 'done'");
	
		//calculate average
		int sum = 0;
		int number_of_elements = 0;
		while(s.hasNextInt()){
			sum += s.nextInt();
			number_of_elements++;
		}
		int average = sum/number_of_elements;

		//print result
		System.out.println("The average is:" + average);		
	}
}
