import java.util.Scanner;

public class insertion_sort{
	public static void main(String[] args){
		//gather input array from user
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the number of integers in your list");
		int array_length = s.nextInt();

		int array[] = new int[array_length];

		System.out.println("Now enter the " + array_length + " integers in your list.");
	
		for(int l = 0; l < array.length; l++) {
			array[l] = s.nextInt();
		}

		//insertion sort
		int[] sorted = insertion_sort(array);
		
		//print result
		System.out.println("The list you entered in ascending order is as follows: ");
		for (int k = 0; k < sorted.length; k++) {
			System.out.printf(sorted[k] + " ");
		}
		System.out.println("\n");
	}

	public static int[] insertion_sort(int[] unsorted) {
 		int[] sorted = unsorted;

 		for(int i = 1; i < sorted.length; i++) {
			int j = i;
			while(( j > 0) && (sorted[j] < sorted[j - 1])) {
				int temp = sorted[j];
				sorted[j] = sorted[j-1];	
				sorted[j-1] = temp;
				j = j - 1;
			}
		}
		return sorted;
	}
}


