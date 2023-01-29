package com.vcs_gl.balancedParanthesis.main;

import com.vcs_gl.balancedParanthesis.service.BalancedParanthesisServices;

public class BalancedParanthesisDriver {
	
	public static void main(String[] args) {
		
		BalancedParanthesisServices balancedParanthesisServices = new BalancedParanthesisServices();
		
		String paranthesisString =  balancedParanthesisServices.getData();
		
		boolean status = balancedParanthesisServices.isParanthesisMatching(paranthesisString);
		
		if(status)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets !!!");
	}

}
