package sec04.exam01_arithmetic;

public class InputDataCheckNaNCheck1 {

	public static void main(String[] args) {
		String userInput = "NaN";		//사용자로부터 입력 받은 값
		double val = Double.valueOf(userInput);		//입력값을 double타입으로 변환
		
		double currentBalance = 10000.0;
		
		//NaN 검사
		if(Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없음.");
			val = 0.0;
		}		//NaN일 경우 실행되는 코드
		
		currentBalance += val;		//currentB의 원래값이 유지됨!
		
		System.out.println(currentBalance);

	}

}
