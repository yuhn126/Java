package chap04_Exercise;

public class Exercise05 {

	public static void main(String[] args) {
		//중첩 for문을 이용하여 방정식 4x+5y=60의 모든 해를 구해 (x,y)형태로 출력
		
		int x = 0;
		int y = 0;
		
		for(x=1; x<=10; x++) {
			for(y=1; y<=10; y++) {
				if((4*x)+(5*y) == 60) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}

	}

}
