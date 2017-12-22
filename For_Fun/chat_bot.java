import java.util.Scanner;

public class chat_bot {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("How are you feeling?" );
		String emotion = s.nextLine();

		System.out.println("I hear that you are feeling " + emotion);
	}
}
