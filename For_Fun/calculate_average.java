public class calculate_average{
	public static void main(String[] args) {
	//set variables
	int[] numbers = {1, 3, 5, 7, 9};
	int total = 0;
	int i;	

	//calculate average
	for(i = 0; i < numbers.length; i++) {
		total += numbers[i];
	}
	int average = total/numbers.length;

	//print result
	System.out.printf("The average of:\n");
	for(i = 0; i < numbers.length; i++) {
		System.out.printf("%d ", numbers[i]);
	}
	System.out.printf("\nis %d \n", average);
	
	}
}
