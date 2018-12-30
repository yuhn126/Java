package chap04_Exercise;

public class Exercise06 {

	public static void main(String[] args) {
		//for문을 이용하여 * 삼각형 출력
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				if(j==i) {
					System.out.println();
				}
			}
		}

	}

}
