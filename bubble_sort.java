import java.util.Scanner;

public class bubble_sort {
	public static void main(String[] args){
		// Gather input array from user
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the number of integers in your list");
		int array_length = s.nextInt();

		int array[] = new int[array_length];

		System.out.println("Now enter the " + array_length + " integers in your list.");
	
		for(int l = 0; l < array.length; l++) {
			array[l] = s.nextInt();
		}

		// Start bubble sort algorithm
		boolean swap_occured = true;
		while(swap_occured) {
			swap_occured = false;
			for(int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					swap_occured = true;	
				}
			}
		}			

		// Print result
		System.out.println("The list you entered in ascending order is as follows: ");
		for (int k = 0; k < array.length; k++) {
			System.out.printf(array[k] + " ");
		}
		System.out.println("\n");
	}
}
