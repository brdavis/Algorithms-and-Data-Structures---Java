import java.util.Scanner;

public class tip_calculator {
	public static void main(String[] args) {
		//directions and user input
		Scanner s = new Scanner(System.in);
		System.out.println("What is your total?");
		int total = s.nextInt();
		s.close();
			
		//calculate 
		double ten_percent = total + (total * 0.1);
		double fifteen_percent = total + (total * 0.15);
		double twenty_percent = total + (total * 0.2);

		//print result
		System.out.println(" 10% tip = " + ten_percent +
				  " 15% tip = " + fifteen_percent + 
				  " 20% tip = " + twenty_percent);  
	}
}
