public class remove_char {
	public static void main(String[] args) {
		//Strings
		String s = "HeXllo";
		System.out.println("The string before removal : " + s);

		//remove 'X'
		String first_half = s.substring(0,2);
		String second_half = s.substring(3);
		
		System.out.println("The string after removal : " + first_half + second_half); 
	}
}
