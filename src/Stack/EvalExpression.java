package Stack;

import java.util.Stack;

public class EvalExpression {

	public static void main(String[] args) {
		
		
		System.out.println("1=================");
		
		String exp = "{()}[{}]";
		if(balParenthesis(exp)){		
			System.out.println("The expression is balanced");
			
		} else{
			System.out.println("The expression is not balanced");
		}
		
		
		System.out.println("2=================");
		
		
		String exp2 = "138*+";
		System.out.println(evaluateExpression(exp2));
	}
	

	public static boolean balParenthesis(String exp){

		Stack<Character>stack = new Stack();
		for (int i = 0;i<exp.length();i++){
			if (exp.charAt(i) =='(' || exp.charAt(i)== '{' || exp.charAt(i)=='['){

				stack.push(exp.charAt(i));
			}
			if (exp.charAt(i) ==')' || exp.charAt(i)== '}' || exp.charAt(i)==']'){
				if(stack.empty()){
					return false;
				}
				Character top = stack.pop();
				if((top == '(' && exp.charAt(i)!=')') ||    (top == '{' && exp.charAt(i)!='}') && (top == '[' && exp.charAt(i)!=']')){
					return false;
				}
			}
		}

		return true;
	}
	
	/***
	 * 
	 * @param exp
	 * @return
	 * 
	 * 82/ 4
	 * 138*+ 25
	 * 545*+ 5
	 */
	public static int evaluateExpression(String exp){

		Stack<Integer>stack = new Stack();
		for (int i = 0;i<exp.length();i++){
			if(Character.isDigit(exp.charAt(i))){
				stack.push(exp.charAt(i)-'0');
			}else{
				int x = stack.pop();
				int y = stack.pop();
				if(exp.charAt(i)== '+'){
					stack.push(y+x);
				}
				else if(exp.charAt(i)== '*'){
					stack.push(y*x);
				}
				else if(exp.charAt(i)== '/'){
					stack.push(y/x);
				}
				else if(exp.charAt(i)== '-'){
					stack.push(y-x);
				}
			}
		}
			return stack.pop();
	}
	

}
	