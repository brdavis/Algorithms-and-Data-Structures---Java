public class compare_strings_v2 {
	public static void main(String[] args) {
		//strings 
		String hello = "hello";
		String hello_2 = "hello";
		String hi = "hi";
		
		//compare using .equals() will return boolean value
		System.out.println("Does " + hello + " match " + hello + "? " + hello.equals(hello));
                System.out.println("Does " + hello + " match " + hi + "? " + hello.equals(hi));
	}
}
