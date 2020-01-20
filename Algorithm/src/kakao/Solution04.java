package kakao;

public class Solution04 {
	long[] answer = {};
	long[] room = {};

	public long[] solution(long k, long[] room_number) {
		answer = new long[room_number.length];
		room = new long[(int) k];

		for (int rm = 0; rm < room_number.length; rm++) {
			if (room[(int) (room_number[rm]-1)] == 0) {
				room[(int) (room_number[rm]-1)] = 1;
				break;
			} 
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution04 s4 = new Solution04();
		s4.solution(10, new long[] { 1, 3, 4, 1, 3, 1 });
	}
}
