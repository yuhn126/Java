package sec08.exam01_method_declaration;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();			//메소드 호출
		
		int result1 = myCalc.plus(3, 5);	//연산 수행 후 리턴된 값을 result1으로 받음
		System.out.println(result1);
	}

}