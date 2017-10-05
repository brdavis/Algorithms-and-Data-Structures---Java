import java.util.Scanner;

public class quick_sort {

	public static void main(String[] args) {
		// Gather input array from user
		int[] array = get_array();
		
		// Print sorted array
		print_array(array);
	}
	
	// Gather user input of unsorted array
	public static int[] get_array() {
		Scanner s = new Scanner(System.in);
	
		System.out.println("Please enter the number of integers in your list");
		int array_length = s.nextInt();
		int array[] = new int[array_length];

		System.out.println("Now enter the " + array_length + " integers in your list.");
		for (int i= 0; i < array.length; i++) {
			array[i] = s.nextInt();
		}
		
		return array;
	}

	// Prints sorted array
	public static void print_array(int[] array){
		System.out.println("Your list in ascending sorted order: ");
		for (int i = 0; i < array.length; i++) {
			System.out.printf(array[i] + " ");
		}
		System.out.println();
	}
}
