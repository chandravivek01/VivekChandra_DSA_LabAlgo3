package com.vcs_gl.givenSumPairBst.model;

// Class for BST associated Operations (Insertion, Traversal)
public class BinarySearchTree {

	// Insertion in a BST
	static Node insert(Node root, int key) {
		
			if(root==null)
				return new Node(key);
		
			if(key<root.data)
				root.left = insert(root.left, key);
		
			if(key>root.data)
				root.right = insert(root.right, key);
			
			return root;
	}
	
	// Hard-coded Input for the BST
	public Node inputBst() {
	
		Node root=null;
		root = insert(root, 40);
		root = insert(root, 20);
		root = insert(root, 60);
		root = insert(root, 10);
		root = insert(root, 30);
		root = insert(root, 70);
		root = insert(root, 50);
		
		return root;
	}

	// Displaying the BST (In-order Traversal)
	public void inOrder(Node root) {
			
		if(root==null)
			return;
		
		inOrder(root.left);
		System.out.print(root.data+ " ");
		inOrder(root.right);
			
	}
		
}
