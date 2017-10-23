public class compare_strings {
	public static void main(String[] args) {
		// Strings 
		String string_1 = "String 1";
		String string_2 = "String 2";
		String string_1_match = "String 1";
		String string_2_match = string_2;
		String string_1_upper = "STRING 1";
	
		//make comparisons 
		System.out.println(string_1.compareTo(string_1_match)); // expects 0, b/c it's a match
		System.out.println(string_1.compareTo(string_2)); // not a match
		System.out.println(string_2.compareTo(string_2_match)); //match
		System.out.println(string_1.compareToIgnoreCase(string_1_upper)); // match

		//optimized with helper function
		pretty_print(string_1, string_1_match);
		pretty_print(string_1, string_2);
		pretty_print(string_2, string_2_match);
		pretty_print(string_1, string_1_upper);
	}

	// prints it in a nice and readable way
	public static void pretty_print(String s1, String s2) {
		int match = s1.compareTo(s2);
		if (match == 0) {
			System.out.println(s1 + " matches " + s2);
		} else {
			System.out.println(s1 + " does not match " + s2);
		}
		
	}
}
