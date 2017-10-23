public class replace_substrings {
	public static void main(String[] args) {
		//Strings
		String s = "Hi, how are you?";

		System.out.println(s.replace("ou", "a"));
		System.out.println(s.replaceFirst("o", "X")); // replaces first instance only
		System.out.println(s.replaceAll("o", "X")); // replaces all instances
	}
}
