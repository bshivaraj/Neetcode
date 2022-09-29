package leetcode;

public class RotateImage {
	
	public static void main(String[] args) {
		int[][] image=  {{01,02,03,04},
				         {05,06,07,8},
				         {9,10,11,12},
				         {13,14,15,16}};
		getresult(image);
	}

	private static void getresult(int[][] image) {
		int row=image.length,col=image[0].length,len=col-1;
		for(int i=0;i<row;i++) {
			for(int j=i;j<col;j++) {
				if(i!=j) {
					int temp=image[j][i];
					image[j][i]=image[i][j];
					image[i][j]=temp;
				}
			}
		}
		//reverse element
		for(int i=0;i<row;i++) {
			for(int j=0;j<col/2;j++) {
				int temp=image[i][j+len];
				image[i][j+len]=image[i][j];
				image[i][j]=temp;
				len=len-2;
			}
			len=image[0].length-1;
		}
	}
}
