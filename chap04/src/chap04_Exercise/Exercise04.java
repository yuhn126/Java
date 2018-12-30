package chap04_Exercise;

public class Exercise04 {

	public static void main(String[] args) {
		//while문과 Math.random() 메소드를 이용하여 (눈1,눈2)형태로 출력하고 둘의 합이 5일때 실행을 멈추는 코드
		
		while(true) {
			int dice1 = (int)(Math.random()*6) + 1;
			int dice2 = (int)(Math.random()*6) + 1;
			
			System.out.println("(" + dice1 + "," + dice2 + ")");
			
			if((dice1 + dice2 )== 5) {
				break;
			}
		}

	}

}
