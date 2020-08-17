package stack;

import java.util.Stack;

public class bracetBalancing {

	public static boolean balancedParenthensies(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '[' || c == '(' || c == '{') {
				stack.push(c);
			} else if (c == ']') {
				if (stack.isEmpty() || stack.pop() != '[') {
					return false;
				}
			} else if (c == ')') {
				if (stack.isEmpty() || stack.pop() != '(') {
					return false;
				}
			} else if (c == '}') {
				if (stack.isEmpty() || stack.pop() != '{') {
					return false;
				}
			}

		}
		return stack.isEmpty();
	}

	public static boolean isBraceBalanced(String braces) {
		Stack<Character> stack = new Stack<Character>();

		for (char c : braces.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else if ((c == ')' && (stack.isEmpty() || stack.pop() != '('))
					|| (c == ']' && (stack.isEmpty() || stack.pop() != '['))
					|| (c == '}' && (stack.isEmpty() || stack.pop() != '{'))) {
				return false;
			}
		}

		return stack.isEmpty();
	}

	 
	  
	  
	  
	    public static boolean isValidExpression(String expressionStr)
	    {
	        boolean flag = false;
	        
	           Stack<Character> stack = new Stack<Character>();

			    for(char c : expressionStr.toCharArray()) {
			        if(c == '(' || c == '[' || c == '{') {
			            stack.push(c);
			        } else if((c == ')' && (stack.isEmpty() || stack.pop() != '(')) ||
			                  (c == ']' && (stack.isEmpty() || stack.pop() != '[')) ||
			                  (c == '}' && (stack.isEmpty() || stack.pop() != '{'))) {
			            return false;
			        }
			    }

		
	         flag= stack.isEmpty();
	        return flag;
	       
	    }
	  
	  
	public static void main(String[] args) {

		// System.out.println(balancedParenthensies("{(@@@@@@@@#####a,n.n,b,b)}"));
		//System.out.println(isBraceBalanced("({})"));
		boolean k=isValidExpression("(((33))");
		System.out.println("the res is "+ k);

		// System.out.println(balancedParenthensies("{(a},b)"));
		// System.out.println(balancedParenthensies("{)(a,b}"));

	}

}
