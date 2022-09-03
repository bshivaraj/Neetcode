package Arrays;

import java.util.Arrays;

public class TwoDimensionArray {
	
	public static void main(String[] args) {
		char c[][]=new char[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				c[i][j]='s';
			}
		}
		System.out.println(Arrays.deepToString(c));
	}

}
