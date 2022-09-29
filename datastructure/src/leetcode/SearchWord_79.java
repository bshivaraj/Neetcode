package leetcode;

public class SearchWord_79 {
	
	static boolean [][] visited;
	public static void main(String[] args) {
		String word="abe";
		char[][] board= {{'a','b','c','e'},
				         {'s','f','c','s'},
				         {'a','d','e','e'}};
		boolean res=getresult(board,word);
		System.out.println(res);
	}

	private static boolean getresult(char[][] board, String word) {
		int rows=board.length;
		int column=board[0].length;
		visited=new boolean[rows][column];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<column;j++) {
				if(word.charAt(0)==board[i][j] && search(board, word, i, j, 0)) {
					return true;
				}
			}
		}
		return false;  
	}

	private static boolean search(char[][] board, String word, int i, int j, int index) {
		if(index==word.length()) {
			return true;
		}
		if(i<0 || i>=board.length ||j<0 || j>=board[i].length || word.charAt(index)!=board[i][j] || visited[i][j]) {
			return false;
		}
		     visited[i][j]=true;
		     if(search(board, word, i+1, j, index+1)||
				search(board, word, i-1, j, index+1)||
				search(board, word, i, j+1, index+1)||
				search(board, word, i, j-1, index+1)) {
		    	 return true;
		     }
		     visited[i][j]=false;
		return false;
	}

}
