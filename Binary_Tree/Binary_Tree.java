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

	public static void main(String[] args) {
		Binary_Tree tree = new Binary_Tree();
		
		//create root
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
	}
}
