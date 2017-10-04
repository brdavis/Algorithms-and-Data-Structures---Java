// Binary Search Tree
// 
// need to do insert


// Node class contains building blocks for binary tree
class Node {
	//class variables
	int data;
	Node left;
	Node right;

	//node constructor
	public Node(int new_data) {
		data = new_data;
		left = null;
		right = null;
	}
}

public class Binary_Tree {
	//class variables
	Node root;

	//constructors
	Binary_Tree(int new_data) {
		root = new Node(new_data);
	}
	
	Binary_Tree() {
		root = null;
	}

	//binary tree functions

	//search for value in binary tree
	public Node search(Node given_node, int value) {
		//base case of value is in root
		if (given_node == null || given_node.data == value) {
			return given_node;
		} 
		//value is greater than data in node
		if (given_node.data > value) {
			return search(given_node.left, value);
		}

		//value is less than data in node
	//	if (given_node.data < value) {
			return search(given_node.right, value);
	//	}
	}

	public static void main(String[] args) {
		Binary_Tree tree = new Binary_Tree();
		
		//create root
		tree.root = new Node(1);

		//create tree
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);

		//search for value
		
	}
}
