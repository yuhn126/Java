package sec04.exam01_arithmetic;

public class InputDataCheckNaNCheck2 {

	public static void main(String[] args) {
		String userInput = "NaN";			//사용자로부터 입력 받은 값
		double val = Double.valueOf(userInput);		//입력값을 double타입으로 변환
		
		double currentBalance = 10000.0;
		
		currentBalance += val;			//currentB에 NaN이 저장됨.
		
		System.out.println(currentBalance);

	}

}
