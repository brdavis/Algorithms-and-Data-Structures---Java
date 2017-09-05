// This program implements the traditional push, pop, peek, is_empty, and is_full
// functionality of a stack data structure utilizing an array
// reminder - Stack functions in a LIFO manner

public class Stack_via_array {
	public static int size;
	public static int[] stack;
	public static int top_element;

	Stack_via_array(int size) {
		this.size = size;
		this.stack = new int[size];
		this.top_element = -1;
	}
	
	public void push(int pushed_element) {
		if(!is_full()) {
			top_element++;
			stack[top_element] = pushed_element;
			System.out.println("Your element has been pushed onto the stack");
		} else {
			System.out.println("The stack is currently full. Your element has not been pushed onto the stack");
		}
	}

	public int pop() {
		if(!is_empty()) {
			int popped_element = stack[top_element];
			top_element--;
			return popped_element;
		} else {
			System.out.println("Unable to pop an element. The stack was empty.");
			return -1;
		}
	}

	public int peek() {
		if (!is_empty()) {
			return stack[top_element];
		} else {
			System.out.println("Stack is empty.");
			return -1;
		}
	}

	public boolean is_empty() {
		if (top_element == -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean is_full() {
		if(top_element == (size-1)) {
			return true;
		} else {
			return false;
		}
	}


	public static void main(String[] args) {
		// create and call stack methods
		// make stack
		Stack_via_array stack = new Stack_via_array(5);
		int pop = stack.pop();
		stack.push(1);
		stack.push(2);
		int peek = stack.peek();
		System.out.println("Peek = " + peek);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6); // tests is_full()
		int popped = stack.pop();
		System.out.println("Popped = " + popped);
		popped = stack.pop();
		popped = stack.pop();
		popped = stack.pop();
		popped = stack.pop();
		popped = stack.pop(); //tests is_empty();
		peek = stack.peek();
		
	}
}
