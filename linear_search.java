import java.util.Scanner;
import java.util.ArrayList;

public class linear_search {
	public static void main(String[] args) {
		// Gather list and target from user
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a list, then type 'done'");
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(s.hasNextInt()) {
			list.add(s.nextInt());
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number you wish to find in the list");
		int target = sc.nextInt();

		// Perform linear search on list
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == target) {
				System.out.println( "The number you requested, " + target + ", was found " +
						    "at spot " + (i + 1) + " in the list.");
				return;	
			}
		}
		System.out.println("The number you requested could not be found in the list.");
	}
	
}
