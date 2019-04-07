import java.util.Stack;

public class Main {

	public static void main(String[] args) {
			
		System.out.println(isBalanced("{{()}}}"));
	}
	
	public static boolean isBalanced(String str) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0 ; i< str.length();i++) {
			//
			if( str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[' ) {	
				stack.push(str.charAt(i));
			}
			//
			if(str.charAt(i)==')' || str.charAt(i)=='}' || str.charAt(i)==']') {
				
				if(stack.isEmpty()) {
					return false;
				}
				
				char top = stack.pop();
				
				if( (str.charAt(i)=='}' && top !='{') || (str.charAt(i)==')' && top !='(') || (str.charAt(i)==']' && top !='[') ) {
					return false;
				}	
			}
		}
		
		//
		return stack.isEmpty();
}
	
}
