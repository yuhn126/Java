package sec08.exam03_method_call;

public class Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);		//다른 메소드 호출 시 이름으로 호출
		double result = sum / 2;
		return result;
	}
	
	void excute() {
		double result = avg(7, 10);
		println("실행 결과 : " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
