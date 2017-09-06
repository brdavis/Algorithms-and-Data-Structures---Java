// 		STACK CLASS
// The intention behind this implementation is that this file can be used
// as an external class that can be added to future programs that wish
// to utilize the data structure of a stack
//
// Stylistically mimimal for functionality instead of readability
// flags implemented for unexpected action

public class Stack {
	// Class variables
	private int stack_size;
	private int[] stack;
	private int top_element;

	// Constructors

	// Constructor for large stack - doesn't need specific size specification
	public Stack() {
		this.stack_size = 100;
		this.stack = new int[100];
		this.top_element = -1;
	}
	
	public Stack(int size) {
		this.stack_size = size;
		this.stack = new int[stack_size];
		this.top_element = -1;
	}

	// Class methods

	public int push(int pushed_element) {
		if (!is_full()) {
			return stack[++top_element] = pushed_element;
		} else {
			return -1; //feedback that push could not execute
		}
	} 

	public int pop() {
		if (!is_empty()) {
			return stack[top_element--];
		} else {
			return -1; // feedback that pop could not execute
		}	
	}

	public int peak() {
		if(!is_empty()) {
			return stack[top_element];
		} else {
			return -1;// feedback that peak could not execute
		}
	}

	public boolean is_empty() {
		return (top_element == -1);
	}

	public boolean is_full() {
		return (top_element == (stack_size - 1));
	}
}

