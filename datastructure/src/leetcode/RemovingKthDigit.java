package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class RemovingKthDigit {
	
	public static void main(String[] args) {
	   //String num="1432219";int k=3;
	   String num="112";int k=1;
	   String res=getResult(num,k);
	   System.out.println(res);
	}

	private static String getResult(String num, int k) {
		Stack stack=new Stack();
		String result="";
		      if(num.length()==k) {
		    	  return "0";
		      }
			for(int i=0;i<num.length();i++) {
				if(num.charAt(i)!=0) {
					stack.add(num.charAt(i));
				}if(k>0 && i!=num.length()-1 && num.charAt(i)>num.charAt(i+1)) {
					stack.pop();
					k--;
				}
			}
			char arr[]=new char[stack.size()];
			int size=arr.length-1;int j=0;
			while(!stack.isEmpty()) {
				arr[size]=(char) stack.peek();
				stack.pop();
				size--;
			}
			if(arr.length>=2 && arr[0]=='0') {
				j=1;
			}
			for(int i=j;i<arr.length;i++) {
					result=result+arr[i];
			}
		return result;
	}

}
