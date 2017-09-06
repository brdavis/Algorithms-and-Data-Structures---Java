// Executes stack class

public class stack_driver {
	public static void main(String[] main) {
		Stack stack = new Stack(10);
		
		// add elements
		for(int i = 0; i < 10; i++) {
			stack.push(i);
			int previous = stack.peak();
			if (previous != -1) {
				System.out.println("Just added: " + previous);
			}
		}
		
		for(int j = 0; j < 10; j ++) {
			int popped = stack.pop();
			System.out.println("Just popped: " + popped);
		}
	}
}
