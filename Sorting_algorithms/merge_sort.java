import java.util.Scanner;
import java.util.ArrayList;

public class merge_sort{	

	public static void main(String[] args){
		// Get list from user
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the list you would like sorted. Once you have finished type 'sort'.");
		ArrayList<Integer> input_list = new ArrayList<Integer>();
		
		while(s.hasNextInt()) {
			int number = s.nextInt();
			input_list.add(number);			
		}

		// Perform merge sort
		ArrayList<Integer> sorted = divide(input_list);		

		// Print sorted result
		print_result(sorted);
	}

	public static ArrayList<Integer> divide(ArrayList<Integer> input) {
		// If list has one element stop
		if (input.size() <= 1) {
			return input;
		}

 		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
 
		// Divide list into left and right sides
		for (int i = 0; i < input.size() ; i++) {
 			if (i < input.size()/2) {
				left.add(input.get(i));
			} else {       
				right.add(input.get(i));
 			}
		}
 
		// Divide recursively
		left = divide(left);
		right = divide(right);
 		
		// Merge the left and right lists
		ArrayList<Integer> sorted_list = merge(left, right);
		return sorted_list;
	}	

	// Merge the lists in sorted order
	public static ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		
		// Compare elements and add smalles to sorted array
		while((left.size() != 0) && (right.size() != 0)) {
			if(left.get(0) < right.get(0)) {
				sorted.add(left.get(0));
				left.remove(0);
			} else {
				sorted.add(right.get(0));
				right.remove(0);
			}			
		}
		
		// Add unadded elements if one list runs out of elements before the other list does
		while (left.size() != 0) {
			sorted.add(left.get(0));
			left.remove(0);
		}
		while (right.size() != 0) {
			sorted.add(right.get(0));
			right.remove(0);
		}
		
		// Return sorted list
		return sorted;
	}


	// Print sorted list
	public static void print_result(ArrayList<Integer> sorted) {
	System.out.println("The list you entered in ascending order is as follows: ");
		for (int i = 0; i < sorted.size(); i++) {
			System.out.printf(sorted.get(i) + " ");
		}
	System.out.println("\n");
	}
}
