package com.gl.labsession3.stack.main;

import com.gl.labsession3.stack.service.BalancingBrackets;

public class DriverClass {
	public static void main(String[] args) {
		String inputString = "([{}])";

		Boolean result;

		result = BalancingBrackets.isBalancedBrackets(inputString);

		if (result) {
			System.out.println("The entered string has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}
}
