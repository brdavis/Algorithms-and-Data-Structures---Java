public class compare_strings_v3 {
	public static void main(String[] args) {
		// Strings
		String s1 = "one";
		String s2 = "two";
		String s1_duplicate = s1;
		String s1_same_value = "one";

		// equality comparisons - reference equality not value equality
		System.out.println("Does s1 equal its duplicate?" + (s1 == s1_duplicate));
		System.out.println("Does s1 equal s2?" + (s1 == s2));
		System.out.println("Does s1 equal s1_same_value?" + (s1 == s1_same_value));
	}
}
