import java.util.Scanner;
import java.util.Arrays;

public class binary_search {
	public static void main(String[] args) {
		// Gather list and target from user

		// Get list
		System.out.println("Enter the number of numbers in your list");
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		int list[] = new int[length];
		System.out.println("Enter your list");
		for (int i = 0; i < length; i++) {
			list[i] = s.nextInt();
		}

		// Get target
		System.out.println("Enter the number you wish to find");
		int target = s.nextInt();
				
		// Perform binary search and print results

		// Start with a sorted list
		Arrays.sort(list);

		// Run search
		int left_index = 0;
		int right_index = list.length - 1; //adjust for zero-based array indexing
		int index = search(list, left_index, right_index, target);

		//print results
		if (index != -1) {
			System.out.println("The number you requested, " + target + ", was found " +
					   "at spot " + (index + 1) + " in the sorted list.");// adjust for zero-based array indexing
		} else {
			System.out.println("The number you requested could not be found in the list");
		}
	}

	public static int search(int[] list, int left_index, int right_index, int target) {
		if (right_index >= left_index) {	
			// right- left gives you the length of the current array, divide by 2 to get the mid-pt
			// add the left index to provide the current array offset (if target is on right-side array)
			int middle_index = left_index + (right_index-left_index)/2;
			
			if (list[middle_index] == target) {
				return middle_index; // if target exists it will eventually be the middle index and be returned
			} else if (list[middle_index] > target) {
				return search(list, left_index, middle_index - 1, target); // target is smaller than mid pt so use left-side array
			} else {
				return search(list, middle_index + 1, right_index, target);// target is larger than mid pt so use right-side array 
			}
		} else { 
			return -1; // target does not exist in list
		}
	}
}
