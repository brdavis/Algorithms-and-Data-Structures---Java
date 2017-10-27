import java.util.Scanner;

public class echo {
	public static void main(String[] args) {
		//gather user input
		Scanner s = new Scanner(System.in);
		while (true) {
			String echo = s.nextLine();
			System.out.println(echo);
		}
	}
}
