package p1111;

import java.util.*;

public class Practice02 {
	public String solution(String s) {
		String answer = "";
		String[] splits = s.split(" ");
		int[] parseInt = new int[splits.length];
		for(int i=0; i<splits.length; i++) {
			parseInt[i] = Integer.parseInt(splits[i]);
		}
		Arrays.sort(parseInt);
		answer=parseInt[0]+" "+parseInt[parseInt.length-1];
		System.out.println(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		Practice02 p2 = new Practice02();
		p2.solution("1 2 3 4");
	}
}
