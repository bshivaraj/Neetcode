package hackerrank;

public class SuperDigit {
	public static void main(String[] args) {
		String s="9875";int target=4;
		System.out.println(getResult(s,target));
	}

	private static int getResult(String s,int k) {
		    String temp = firstIteration(s),res = null;
		    String num=String.valueOf(Integer.parseInt(temp)*k);
		    if(num.length()==1){
		    	return Integer.parseInt(num);
		    }
		    while(num.length()>1){
		    	res=firstIteration(String.valueOf(num));
		    	num=res;
		    }
		return Integer.parseInt(res);
	}

	private static String firstIteration(String s) {
		int tmp=0,num=0;String temp = s;
			while(temp.length()>1){
				for(int i=0;i<temp.length();i++){
					tmp=tmp+Integer.parseInt(temp.charAt(i)+"");
				}
				temp=String.valueOf(tmp);
				tmp=0;
			}
		return temp;
	}

}
