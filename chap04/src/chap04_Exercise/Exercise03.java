package chap04_Exercise;

public class Exercise03 {

	public static void main(String[] args) {
		//for문을 이용하여 1부터 100까지의 정수 중에 3의 배수의 총합을 구하는 코드
		
		int sum = 0;
		
		for(int i=0; i<=100; i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 합 = " + sum);
	}

}
