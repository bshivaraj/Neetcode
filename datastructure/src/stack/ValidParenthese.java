package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthese {

	public static void main(String[] args) {
        System.out.println(getResult("()[]{}"));
        //{[()]}
	}

	private static boolean getResult(String s) {
		  Stack stack=new Stack();
		  Map<Character,Character> map=new HashMap();	
		  map.put(')','(');
		  map.put(']','[');
		  map.put('}','{');
		  
		  char array[]=s.toCharArray();
		  for(char c:array) {
			  map.get(c);
		  }
		 
		  System.out.println(stack.peek());
		return false;
	}

}
