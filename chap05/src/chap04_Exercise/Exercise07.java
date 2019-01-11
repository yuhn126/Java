package chap04_Exercise;

public class Exercise07 {

	public static void main(String[] args) {
		//배열의 최대값 출력(for문 이용)
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		
		System.out.println("max : " + max);
	}

}
