package com.vcs_gl.givenSumPairBst.service;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.vcs_gl.givenSumPairBst.model.Node;

public class GivenSumPairBstServices {

	Scanner scanner = new Scanner(System.in);
	
	// Function to Input the Given Sum
	public int inputSum() {
		
		System.out.println("\n\nSum = ");
		int sum = scanner.nextInt();
		return sum;
	}
	
	public boolean isPairPresent(Node root, int sum) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		boolean answer = util(root, sum, set);
		
		return answer;
		
		// return util(root, sum, set);
	}
	
	// Utility Function to Find Pair
	static  boolean util(Node root, int sum, Set<Integer> set) {
		
		if(root==null)
			return false;
		
		if(util(root.left, sum, set))
			return true;
		
		// Searching the Complimentary Value in the HashSet 
		if(set.contains(sum-root.data)) {
			int pair1 = root.data;
			int pair2 = sum - pair1;
			int min = Math.min(pair1, pair2);
			int max = Math.max(pair1, pair2);
			
			// Displaying the Given Sum Pair in Ascending Order
			System.out.println("Pair is ("+min+", "+ max+")");
			return true;
		}
		
		// Pushing Value to the Set
		set.add(root.data);
		
		return util(root.right, sum, set);
	}

	
}
