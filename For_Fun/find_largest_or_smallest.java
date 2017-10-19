import java.util.Scanner;

public class find_largest_or_smallest {
	public static void main(String[] args) {
		//directions and gather user input
		Scanner s = new Scanner(System.in);

		System.out.println("How many numbers are in your list?");
		int length = s.nextInt();
		
		int[] list = new int[length];
		System.out.println("Enter your list");
		for(int i = 0; i < length; i++) {
			list[i] = s.nextInt();
		}		
		s.nextLine();

		System.out.println("Would you like to find the smallest or largest number?");
		String target = s.nextLine();

		s.close();

		//calculate and print result
		switch(target) {
			case "smallest": 
				int smallest = smallest(list);
				System.out.println("The smallest number in the list is: " + smallest);
				break;
			case "largest":
				int largest = largest(list);
				System.out.println("The largest number in the list is: " + largest);
				break;	
			default:
				System.out.println("Invalid selection");
		}
	}

	public static int smallest(int[] list) {
		int smallest = list[0];
		for(int i = 0; i < list.length; i++) {
			if(smallest > list[i]) {
				smallest = list[i];
			}
		}
		return smallest;
	}
	
	public static int largest(int[] list) {
		int largest = list[0];
		for(int i = 0; i < list.length; i++) {
			if(largest < list[i]){
				largest = list[i];
			}
		}
		return largest;
	}
}
