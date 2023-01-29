package com.vcs_gl.balancedParanthesis.service;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesisServices {

	Scanner scanner = new Scanner(System.in);
	
	// Accepting the String of Brackets
	public String getData() {
		
		String paranthesisString;
		System.out.println("Sample Input:\n Enter the String of Paranthesis:");
		paranthesisString = scanner.nextLine();
		
		return paranthesisString;
		
	}
	
	public boolean isParanthesisMatching(String paranthesisString) {
		
		Stack<Character> stack = new Stack<>();
		char currentCharcter;
		for(int i=0; i<paranthesisString.length();i++) {
			
			currentCharcter = paranthesisString.charAt(i);
			
			if(isOpeningBracket(currentCharcter))
				stack.push(currentCharcter);
			
			else {
				if(stack.isEmpty())
					return false;
				
				else if(!isMatching(stack.peek(), currentCharcter))
					return false;
				else
					stack.pop();
			}
			
		}
		return stack.isEmpty();
		
	}
	
	// Matching Closing Bracket for its Corresponding Opening Bracket
	private boolean isMatching(char peek, char currentCharcter) {
		
		return (peek=='(' && currentCharcter==')') || (peek=='{' && currentCharcter=='}') || (peek=='[' && currentCharcter==']');
	}
	
	// Identifying an Opening Bracket
	private boolean isOpeningBracket(char currentCharcter) {
		
		return currentCharcter=='(' || currentCharcter=='{' || currentCharcter=='[';
	}

}
