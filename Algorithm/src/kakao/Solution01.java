package kakao;

public class Solution01 {
	int ptr;
	int[] bucket;
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        bucket= new int[moves.length];
        
        for(int m=0; m<moves.length; m++) {
        	for(int i=0; i<board.length; i++) {
        		if(board[i][(moves[m]-1)]!=0) {
        			push(board[i][(moves[m]-1)]);
        			board[i][(moves[m]-1)]=0;
        			if(ptr>=2&&bucket[ptr-1]==bucket[ptr-2]) {
                        pop();
                        pop();
                        answer+=1;
        			}
        			break;
        		}
        	}
        }
        return answer*2;
    }
	
	public int push(int x) {
		return bucket[ptr++]=x;
	}
	
	public int pop() {
		return bucket[--ptr];
	}
	
	public static void main(String[] args) {
		Solution01 s1 = new Solution01();
		s1.solution(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[]{1,5,3,5,1,2,1,4});
	}
}
