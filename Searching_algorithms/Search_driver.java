import java.util.Scanner;
import java.util.Arrays;

 public class Search_driver {

	public static int target;
	public static int list[];

 	public static void main(String[] args) {
		// Gather list and target from user
          
	        // Get list
		System.out.println("Enter the number of integers in your list");
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		list = new int[length];
		System.out.println("Enter your list");
		for (int i = 0; i < length; i++) {
			list[i] = s.nextInt();
 		}

                // Get target
		System.out.println("Enter the number you wish to find");
		target = s.nextInt();
  
 		// Perform linear and binary searches and print results
 
                // Start with a sorted list
                Arrays.sort(list);

		// run linear search
		int index_of_target = search.linear_search(list, target);

		System.out.println("Linear search:");
		print_result(index_of_target);

 		// Run binary search
		int left_index = 0;
		int right_index = list.length - 1; //adjust for zero-based array indexing
		index_of_target= search.binary_search(list, left_index, right_index, target);
 		
		System.out.println("Binary search:");
		print_result(index_of_target);
	}

	public static void print_result(int target_index) {
		//print results
 		if (target_index != -1) {
		System.out.println("The integer  you requested, " + target + ", was found " +
                                   "at spot " + (target_index + 1) + " in the sorted list.");// adjust for zero-based array indexing
                } else {
			System.out.println("The integer you requested could not be found in the list.");
		}
	}
}
