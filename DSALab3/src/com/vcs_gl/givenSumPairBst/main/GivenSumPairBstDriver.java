package com.vcs_gl.givenSumPairBst.main;

import com.vcs_gl.givenSumPairBst.model.BinarySearchTree;
import com.vcs_gl.givenSumPairBst.model.Node;
import com.vcs_gl.givenSumPairBst.service.GivenSumPairBstServices;

public class GivenSumPairBstDriver {

	public static void main(String[] args) {
		
		Node root;
		
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		GivenSumPairBstServices givenSumPairBstServices = new GivenSumPairBstServices();
		
		// Input BST (Hard-coded)
		root = binarySearchTree.inputBst();
		
		// Display BST (In-order Traversal)
		System.out.println("BST Inorder: ");
		binarySearchTree.inOrder(root);
		
		
		// Input Sum to be Paired 
		int  sum = givenSumPairBstServices.inputSum();
		
		
		boolean status = givenSumPairBstServices.isPairPresent(root, sum);
		
		if(!status)
			System.out.println("Nodes are not found" );
		
	}
}
