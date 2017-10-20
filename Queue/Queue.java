//	Queue Class
//
// FIFO data structure implemeneted as a Linked List

private static class Node {
	public static int data;
	public static Node next;

	// Constructor for Node
	public Node(int set_data) {
		data = set_data;
		next = null;
	}
}

public class Queue {
	// Class variables for queue
	public static Node first;// beginning of queue
	public static Node last; // end of queue
	public static int size; // size of queue

	// Constructor for Queue
	public Queue() {
		first = null;
		last = null;
		size = 0;
	}

	// Queue Functions

	// Add a node to last position in the queue
	public void enqueue(int new_data) {
		//create the new node
		Node new_node = Node(new_data);

		if (is_empty) {
			first = new_node;// if only node make it 'first'
		} else {
			last.next = new_node; // else point what was the 'last' node to this new node
			last = new_node; // transfer the position of 'last' to new node
		}
		//inc size counter
		n++;
	}
	
	//remove a node from the first position in the queue
	// --------- need to implement----------------

	// Checks if queue is empty
	public boolean is_empty() {
		return first == null;
	}

	// Peek to see the first item
	public int peek() {
		if(is_empty) {
			System.out.println("The queue is currently empty");
		}
		return first.data;
	}

}
