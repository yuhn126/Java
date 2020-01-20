package kakao;

public class Solution04_02 {
	long[] answer = {};
	long[] room = {};
	public long[] solution(long k, long[] room_number) {
		answer = new long[room_number.length];
		room = new long[(int) k];
        for(int r=0; r<k; r++) {
        	room[r]=r+1;
        }
        
        for(int rm=0; rm<room_number.length; rm++) {
        	for(int r=(int) (room_number[rm]-1); r<room.length; r++) {
        		if(room_number[rm]==room[r]) {
        			answer[rm]=room[r];
        			room[r]=0;
        			break;
        		} else if(room[r]!=0){
        			answer[rm]=room[r];
        			room[r]=0;
        			break;
        		}
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Solution04_02 s4 = new Solution04_02();
		s4.solution(10, new long[] {1,3,4,1,3,1});
	}
}
