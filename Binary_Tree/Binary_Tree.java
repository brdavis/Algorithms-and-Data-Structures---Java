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

	//insert a node into the binary tree
	//set up recursively
	void insert(int data) {
		root = insertRecursively(root, data);
	}

	Node insertRecursively(Node root, int data) {
		//if tree is empty
		if(root == null) {
			root = new Node(data);
			return root;
		}
		
		//otherwise, recursively search tree
		if (data < root.data) {
			root.left = insertRecursively(root.left, data);
		} else if (data > root.data) {
			root.right = insertRecursively(root.right, data);
		}

		// else it matches, so return it
		return root;
	}

	//call inorder recurssion
	void inorder() {
		inorder_transversal(root);
	}

	//do inorder transversal of BST
	void inorder_transversal(Node root) {
		if(root != null) {
			inorder_transversal(root.left);
			System.out.println(root.data);
			inorder_transversal(root.right);
		}
	}

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
		tree.root.right.right = new Node(4);

		// print tree inorder
		tree.inorder();
		//search for value
		
	}
}
