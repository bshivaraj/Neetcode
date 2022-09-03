import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Anagram {
	
	public static void main(String[] args) {
		//fdhlvosfpafhalll
		//xaxb bbxx
		String s="fdhlvosfpafhalll";
		int res=getResult(s);
		System.out.println(res);
	}

	private static int getResult(String s) {
		int res=0, mid=s.length()/2;
		if(s.length()==0 || (s.length()%2!=0)){
			return -1;
		}
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++){
			if(i<mid){
				if(map.containsKey(s.charAt(i))){
					map.put(s.charAt(i), map.get(s.charAt(i))+1);
				}else{
					map.put(s.charAt(i), 1);
				}
			}else{
				if(map.containsKey(s.charAt(i))){
					map.put(s.charAt(i), map.get(s.charAt(i))-1);
				}
			}
			
		}
		for(int k:map.values()){
			if(map.size()==1){
				return k;
			}
			if(k>=1){
				res=res+k;
			}
		}
       
		return res;
	}

}
