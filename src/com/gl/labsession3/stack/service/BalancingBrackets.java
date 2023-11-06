package com.gl.labsession3.stack.service;

import java.util.Stack;

public class BalancingBrackets {

	public static boolean isBalancedBrackets(String inputString) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < inputString.length(); i++) {
			char currentChar = inputString.charAt(i);

			if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
				stack.push(currentChar);
			} else {
				if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
					if (stack.isEmpty()) {
						return false;
					}

					char topChar = stack.pop();

					if (currentChar == ')' && topChar != '(') {
						return false;
					} else if (currentChar == '}' && topChar != '{') {
						return false;
					} else if (currentChar == ']' && topChar != '[') {
						return false;
					}
				}
			}
		}

		return stack.isEmpty();

	}

}
