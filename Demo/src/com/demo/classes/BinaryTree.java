package com.demo.classes;

//Java program for different tree traversals

/* Class containing left and right child of current
node and key value*/
class Node {

	int key;
	Node left;
	Node right;

	public Node(int key) {

		this.key = key;
		this.left = this.right = null;
	}

}

class BinaryTree {

	Node root;

	BinaryTree() {

		root = null;

	}

	////Wrappers
	void printPostOrder(){
		printPostOrder(root);
	}
	
	void printInOrder(){
		printInOrder(root);
	}
	
	void printPreOrder(){
		printPreOrder(root);
	}
	
	//// Print Post order
	void printPostOrder(Node node) {

		if (node == null) {
			return;
		}

		//// Left
		printPostOrder(node.left);

		//// Right
		printPostOrder(node.right);

		//// Root of node
		System.out.println(node.key + " ");

	}

	//// Print In order
	void printInOrder(Node node) {

		if (node == null) {
			return;
		}

		//// Left
		printInOrder(node.left);

		//// Root of node
		System.out.println(node.key + " ");
		
		//// Right
		printInOrder(node.right);
		
	}
	
	//// Print Pre order
	void printPreOrder(Node node) {

		if (node == null) {
			return;
		}

		//// Root of node
		System.out.println(node.key + " ");
		
		//// Left
		printPreOrder(node.left);

		//// Right
		printPreOrder(node.right);
		
	}

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
	}
}
