import java.util.Scanner;

public class selection_sort {
	public static void main(String[] args) {
		// Gather input array from user
		Scanner s = new Scanner(System.in);
        	System.out.println("Please enter the number of integers in your list");
        	int array_length = s.nextInt();

        	int array[] = new int[array_length];

        	System.out.println("Now enter the " + array_length + " integers in your list.");

		for (int l = 0 ; l < array.length; l++ ) {
        		array[l] = s.nextInt();
        	} 

		// Start selection sort algorithm
		for(int i = 0; i < array.length; i++) {
			int min_index = i;
			for(int j = i+1; j < array.length; j++) {
				if (array[j] < array[min_index]) {
					min_index = j;
				}	
			}		
			int temp = array[min_index];
                        array[min_index] = array[i];
			array[i] = temp;
		}
	
		// Print result
		System.out.println("The list you eneter in ascending order is as follows: ");
        	for (int k = 0 ; k< array.length; k++ ) {
        		System.out.printf(array[k] + " ");
        	}	
		System.out.println("\n");
	}
	
}
