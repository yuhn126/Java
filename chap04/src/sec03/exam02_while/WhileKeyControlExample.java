package sec03.exam02_while;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		boolean run = true;			//run이 false가 되면 반복 되지x
		int speed = 0;
		int keyCode = 0;
		
		while(run){
			if(keyCode!=13 && keyCode!=10) {		//엔터키를 눌렀을 때 입력되는 10과 13
				System.out.println("---------------------------------");
				System.out.println("1.증속 |2.감속|3.중지");
				System.out.println("---------------------------------");
				System.out.print("선택: ");
			}
			
			keyCode = System.in.read();			//입력받은 키를 변수에 저장
			
			if(keyCode == 49) {				//1 누름
				speed++;
				System.out.println("현재 속도 = " + speed);
			} else if (keyCode == 50) {		//2 누름
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if (keyCode == 51) {
				run = false;			//run이 true일 동안 while문이 돌아감! false가 됐으므로 while문 종료
			}
		}
		System.out.println("프로그램 종료");
	}
}
