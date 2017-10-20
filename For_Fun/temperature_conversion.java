import java.util.Scanner;

public class temperature_conversion{
	public static void main(String[] args) {
		//directions and user input
		Scanner s = new Scanner(System.in);
		System.out.println("Indicate by number if you would like to convert\n 1. From Farenheit to Celsius\n 2. From Celsius to Farenheit");
		int conversion_option = s.nextInt();
		s.nextLine();

		//calculate and print results
		if(conversion_option == 1) {
			System.out.println("Please enter your temperature in Farenheit: ");
			int Far = s.nextInt();
			float Cel = Farenheit_to_Celsius(Far);
			System.out.println("That temperature is " + Cel + " degrees in Celsius");
		} else if (conversion_option == 2) {
			System.out.println("Please enter your temperature in Celsius");
			int Cel = s.nextInt();
			float Far = Celsius_to_Farenheit(Cel);
			System.out.println("That temperatue is " + Far + " degrees in Farenheit");
		} else {
			System.out.println("Not a valid selection.");
		}
	}	

	public static float Farenheit_to_Celsius(int temp) {
		return (((temp - 32) * 5)/9);
	}

	public static float Celsius_to_Farenheit(int temp) {
		return (((temp * 9) /5)+ 32);
	}
}
