package sec02.exam01_byte;

public class BooleanExample {

	public static void main(String[] args) {
		boolean stop = false;			//두가지 상태값을 저장할 필요성이 있을 때 사용함.
		if(stop) {
			System.out.println("중지");	//stop변수에 true가 들어있었다면 "중지"출력
		} else {
			System.out.println("시작");	//stop변수에 false가 있으므로 "시작" 출력
		}

	}

}
