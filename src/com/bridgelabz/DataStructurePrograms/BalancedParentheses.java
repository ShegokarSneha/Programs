/******************************************************************************
	 *  Compilation:  javac -d bin BalancedExpression.java
	 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.BalancedExpression
	 *  
	 *  Purpose: Determines whether given arithmetic expression is balanced or not.
	 *
	 *  @author  Sneha
	 *  @version 1.0
	 *  @since   14-06-2019
	 *
******************************************************************************/
  
     /**
	 * This method is used to check arithmetic expression is balanced or not.
	 * @param expression This is the parameter of isBalanced method .
	 * @return boolean This return expression is balanced or not.
	 */
package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.Util.Util;

public class BalancedParentheses {
	
		public boolean isBalanced(String expression) {
			//creating stack
			Stack <Character> stack = new Stack<Character>();
			
			for(int i = 0 ;i < expression.length() ; i++) {
				char ch = expression.charAt(i);
				if( ch == '(' || ch == '{' || ch == '[' ) {
					stack.push(ch);
				}
				if( ch == ')' || ch == '}' || ch == ']' ) {
					
					 /* If we see an ending parenthesis without  
	                 a pair then return false*/
					if(stack.isEmpty()) {
						return false;
					}
				}
				
				
				char charTemp;
				//switch case for removing corresponding paranthesis.
				switch(ch) {
				
					case ')' : 
						charTemp=stack.peek();
						stack.pop();
						if(charTemp == '{' || charTemp == '[') {
							return false;
						}
						break;
						
					case '}' :
						charTemp=stack.peek();
						stack.pop();
						if(charTemp == '(' || charTemp == '[') {
							return false;
						}
						break;
						
					case ']' :
						charTemp=stack.peek();
						stack.pop();
						if(charTemp == '(' || charTemp == '{') {
							return false;
						}
						break;
				}
				
			}
			return stack.isEmpty();
			
		}
		
		/**
		* This is the main method which makes use of isBalanced method.
		* @param args[0] Unused.
		* @return Nothing.
		* @exception IOException On input error.
		* @see IOException
		*/
public static void main(String[] args) {
	System.out.println("*** Balanced Parentheses Using Stack ***");
			// Taking input from the user.
	System.out.println("\nPlease enter the Arithmetic expression");
	String expression = Util.getInputString();
			
			//creating object 
	BalancedParentheses balanceExpression = new BalancedParentheses();
			
			// Calling is balanced method.
			boolean res=balanceExpression.isBalanced(expression);
			
			if(res)
				System.out.println("\nBalanced");
			else
				System.out.println("\nNot Balanced");
		}

	}
