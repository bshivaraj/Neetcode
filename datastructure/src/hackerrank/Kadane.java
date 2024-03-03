package hackerrank;
public class Kadane
{
    public static void main (String[] args)
    {
        int [] a = {-3,4,-5,6,-4,7,-3,6,-20,18};
        
        System.out.println("Maximum contiguous sum is " +
                                       maxSubArraySum(a));
    }
    static int maxSubArraySum(int a[]){
    	int l_max=0;int g_max=Integer.MIN_VALUE;
    	int start=0,end=0;
    	for(int i=0;i<a.length;i++){
    		if(l_max==0){
    			start=i;
    		}
    		l_max=l_max+a[i];
    		if(l_max>g_max){
    			g_max=l_max;
    		}
    		if(l_max<0){
    			l_max=0;
    		}
    		end=i-1;
    		System.out.println(start+"  "+end);
    	}
    	
		return g_max;
    }
}