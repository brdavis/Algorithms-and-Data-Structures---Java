// Add deletion, Search, Search and Delete

class Node {
	// Class variables
	public int data; // data that node holds
	public Node next; // "pointer" or reference to next node in linked list
    
	// Constructor method
	Node(int data) {
		this.data = data;
		this.next = null;
	}
    
}

public class Linked_list {
	// Class variables
	Node head; // The start or "head" of the linked list

	// Class methods
	
	// Print linked list
	public void print_linked_list() {
		Node current_node = head;
		System.out.println("The linked list: ");
		while(current_node != null) {
			System.out.print(current_node.data + " -> ");
			current_node = current_node.next;
		}
		System.out.println();
	}

	// Insert a new node
	// Can be done at the front of the linked list - insert_front()
	// After a certain node in the linked list - insert_after()
	// At the end of the linked list - insert_end()
	
	public void insert_front(int data) {
		// make node to add to list
		Node new_node = new Node(data);
	
		// make new node point to head of linked list
		new_node.next = head;
	
		// now make new node the head of the list
		head = new_node;

	}

	// given node we should insert after, and data to be inserted
	public void insert_after(Node node, int data) 	{
		// make node to add to list
		Node new_node = new Node(data);

		// take the pointer of the given node and make the 
		// new node point to it
		new_node.next = node.next;

		//now set the pointer of the node to the new node
		node.next = new_node;
	}

	public void insert_end(int data) {
		// make node to add to list
		Node new_node = new Node(data);

		// if linked list is empty make new node the start of new linked list
		if (head == null) {
			head = new_node;
			return;
		}
		
		// traverse list to find last node
		Node last_node = head;
		while(last_node.next != null) {
			last_node = last_node.next;
		}

		// once the last node has been found make it point to the new_node
		last_node.next = new_node;
		return;
		
	}

	public static void main(String[] args) {
		// initialize a linked list
		Linked_list list = new Linked_list();
		
		// create 3 nodes in the linked list with data
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		// link the nodes in order
		list.head.next = second;
		second.next = third;

		// print linked list
		list.print_linked_list();
		
		// insert nodes in front, after, and end
		list.insert_front(0);
		list.insert_end(4);
		list.insert_after(second, 7);

		list.print_linked_list();
	
	}
}
