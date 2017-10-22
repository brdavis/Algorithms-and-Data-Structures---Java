public class reverse_array {
	public static void main(String[] args) {
		//array before
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Original array order: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		//reverse array
		int mid_pt = array.length / 2;
		int end_of_array = array.length - 1;
		for(int i = 0; i < mid_pt; i++) {
			//swap
			int temp = array[i];
			array[i] = array[end_of_array - i];
			array[end_of_array - i] = temp;
			
		}

		//print result
		System.out.println("Reverse of array: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
