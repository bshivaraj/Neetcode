package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {
	
	
	public static void main(String[] args) {
		String s="123shiva1";
		getResult(s);
		
	}

	private static void getResult(String s) {
	    String s1=s.replaceAll("[^a-z]","");
	    System.out.println(s1);
	}
	

}
